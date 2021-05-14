package subpackage.Encrypt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.stream.Collectors;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class AESCryptoUtil {

	/**
	 * 키 반환
	 */
	public static SecretKey getKey() throws Exception {
		KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		keyGenerator.init(128);
		SecretKey secretKey = keyGenerator.generateKey();
		return secretKey;
	}

	/**
	 * 초기화 벡터 반환
	 */
	public static IvParameterSpec getIv() {
		byte[] iv = new byte[16];
		new SecureRandom().nextBytes(iv);
		return new IvParameterSpec(iv);
	}

	// 이어지는 암호화 및 복호화 예제 코드

	public static String encrypt(String specName, SecretKey key, IvParameterSpec iv, String plainText)
			throws Exception {
		Cipher cipher = Cipher.getInstance(specName);
		cipher.init(Cipher.ENCRYPT_MODE, key, iv);
		byte[] encrypted = cipher.doFinal(plainText.getBytes(StandardCharsets.UTF_8));
		return new String(Base64.getEncoder().encode(encrypted));
	}

	public static String decrypt(String specName, SecretKey key, IvParameterSpec iv, String cipherText)
			throws Exception {
		Cipher cipher = Cipher.getInstance(specName);
		cipher.init(Cipher.DECRYPT_MODE, key, iv); // 모드가 다르다.
		byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(cipherText));
		return new String(decrypted, StandardCharsets.UTF_8);
	}
	public static void encryptFile(String specName, SecretKey key, IvParameterSpec iv,
	        File inputFile, File outputFile) throws Exception {
		
	    Cipher cipher = Cipher.getInstance(specName);
	    cipher.init(Cipher.ENCRYPT_MODE, key, iv);
	    
	    try (FileOutputStream output = new FileOutputStream(outputFile);
	        CipherOutputStream cipherOutput = new CipherOutputStream(output, cipher)) {
	    
	        String data = Files.lines(inputFile.toPath()).collect(Collectors.joining("\n"));
		    cipherOutput.write(data.getBytes(StandardCharsets.UTF_8));
	    }
	}

	public static void decryptFile(String specName, SecretKey key, IvParameterSpec iv,
	        File encryptedFile, File decryptedFile) throws Exception {
		
	    Cipher cipher = Cipher.getInstance(specName);
	    cipher.init(Cipher.DECRYPT_MODE, key, iv);

	    try (
	        CipherInputStream cipherInput = new CipherInputStream(new FileInputStream(encryptedFile), cipher);
	        InputStreamReader inputStream = new InputStreamReader(cipherInput);
	        BufferedReader reader = new BufferedReader(inputStream);
	        FileOutputStream fileOutput = new FileOutputStream(decryptedFile)) {

	        StringBuilder sb = new StringBuilder();
	        String line;
	        while ((line = reader.readLine()) != null) {
	            sb.append(line);
	        }
		    fileOutput.write(sb.toString().getBytes(StandardCharsets.UTF_8));
	    }
	}
}