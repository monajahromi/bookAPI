package mellat.ir.card.tools;


import java.security.Key;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;



public class CryptoUtils {
	private static final String HTML_CHARSET = "UTF-8";
	public static final String DES_ALGORITHM = "DES";
	public static final String RSA_ALGORITHM = "RSA/ECB/PKCS1Padding"; //"RSA";
	public static final String MD5_ALGORITHM = "HmacMD5" ;
	public static final String SHA1_ALGORITHM = "HmacSHA1" ;

	public CryptoUtils() {
	}

	public static String encode(String algorithm, String data, String keyStr) throws Exception
	{
		Key key = getSecretKey(algorithm, keyStr);
		return encode(algorithm, data, key);
	}

	public static String encode(String algorithm, String data, Key key) throws Exception
	{
		Cipher cipher = Cipher.getInstance(algorithm);
		cipher.init(Cipher.ENCRYPT_MODE, key);
		byte[] bb = data.getBytes(HTML_CHARSET);
		byte[] bytes = cipher.doFinal(bb);
		String base64Encoded = base64Encode(bytes);
		return base64Encoded;
	}

	public static Key getSecretKey(String algorithm, String myKey) throws Exception
	{
		String newMyKey = paddingString(myKey, 8, ' ', false);
		return new SecretKeySpec(newMyKey.getBytes(), algorithm);
	}

	public static String decode(String algorithm, String data, String keyStr) throws Exception
	{
		Key key = getSecretKey(algorithm, keyStr);
		return decode(algorithm, data, key);
	}

	public static String decode(String algorithm, String data, Key key) throws Exception
	{
		Cipher cipher = Cipher.getInstance(algorithm);
		cipher.init(Cipher.DECRYPT_MODE, key);
		byte[] bb = base64Decode(data);
		byte[] bOut = cipher.doFinal(bb);
		String result = new String(bOut);
		return result;
	}

	public static String mac(String algorithm, String data, String keyStr) throws Exception
	{
		Key key = getSecretKey(algorithm, keyStr);
		return mac(algorithm, data, key);
	}

	public static String mac(String algorithm, String data, Key key) throws Exception
	{
		Mac mac = Mac.getInstance(algorithm) ;
		mac.init(key) ;
		byte[] bb = data.getBytes(HTML_CHARSET);
		byte[] bytes = mac.doFinal(bb);
		String result = base64Encode(bytes);
		return result;
	}

	public static String paddingString(String s, int n, char c , boolean paddingLeft  ) {
		StringBuffer str = new StringBuffer(s);
		int strLength  = str.length();
		if (n > 0 && n > strLength) {
			for (int i = 0; i <= n ; i ++) {
				if (paddingLeft) {
					if (i < n - strLength) str.insert(0, c);
				}
				else {
					if (i > strLength) str.append(c);
				}
			}
		}
		return str.toString();
	}
	
	public static String base64Encode(byte[] byteArray) {
	//	String encodedString = Base64.getEncoder().encodeToString(byteArray);
	    return Base64.getEncoder().encodeToString(byteArray);
	}
	  
	public static byte[] base64Decode(String input) throws java.io.IOException
	{
	   return  Base64.getDecoder().decode(input); 
			   
			  // BASE64Decoder().decodeBuffer(input);
	}	
}
