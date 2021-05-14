package subpackage.Encrypt;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class test2 {
	public static void main(String[] args) throws Exception {
		String plainText = "Hello, MadPlay!";

		SecretKey key = AESCryptoUtil.getKey();
		IvParameterSpec ivParameterSpec = AESCryptoUtil.getIv();
		String specName = "AES/CBC/PKCS5Padding";

		String encryptedText = AESCryptoUtil.encrypt(specName, key, ivParameterSpec, plainText);
		String decryptedText = AESCryptoUtil.decrypt(specName, key, ivParameterSpec, encryptedText);

		System.out.println("cipherText: " + encryptedText);
		System.out.println("plainText: " + decryptedText);
	}
}
