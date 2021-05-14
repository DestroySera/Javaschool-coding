package subpackage.Encrypt;

import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class TestEncryptfile {
	public static void main(String[] args) throws Exception {
		 
		OutputStream encrypt = new FileOutputStream("encrypt");
		OutputStream decrypt = new FileOutputStream("decrypt.txt");
		
		String str = "암호화 문서";
		
		SecretKey key = AESCryptoUtil.getKey();
		IvParameterSpec ivParameterSpec = AESCryptoUtil.getIv();
		String specName = "AES/CBC/PKCS5Padding";

		String encryptedText = AESCryptoUtil.encrypt(specName, key, ivParameterSpec, str);
		String decryptedText = AESCryptoUtil.decrypt(specName, key, ivParameterSpec, encryptedText);

		System.out.println("cipherText: " + encryptedText);
		System.out.println("plainText: " + decryptedText);
		
		
		byte[] by = encryptedText.getBytes();
		encrypt.write(by);
		
		
		byte[] by1 = decryptedText.getBytes();
		decrypt.write(by1);
	}
}
