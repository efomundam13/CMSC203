
public class CryptoManager {
	
	private static final char LOWER_BOUND = ' ';
	private static final char UPPER_BOUND = '_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_BOUND and UPPER_BOUND characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	
	public static boolean stringInBounds (String plainText) {
		boolean inBounds = true;
		for(int index = 0; index < plainText.length(); index++) {
			if (!(plainText.charAt(index) >= LOWER_BOUND && plainText.charAt(index) <= UPPER_BOUND))
				 inBounds = false;
			}
		return inBounds;
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String encryptCaesar(String plainText, int key) {
		String encrypt = "";
		if(stringInBounds(plainText)) {
			for(int index = 0; index < plainText.length(); index++) {
				char ch = plainText.charAt(index);
				int encrypt_ch = ((int)ch + key);
				while(encrypt_ch > UPPER_BOUND) {
					encrypt_ch -= RANGE;
				}
				encrypt += (char) encrypt_ch;
				}
			}
		return encrypt;
		}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String encryptBellaso(String plainText, String bellasoStr) {
		String encrypt = "";
		for(int index = 0; index < plainText.length(); index++) {
			char ch = plainText.charAt(index);
			int encrypt_ch =((int)ch + (int)bellasoStr.charAt(index % bellasoStr.length()));
			while(encrypt_ch > (int) UPPER_BOUND) {
				encrypt_ch -= RANGE;
			}
			encrypt += (char) encrypt_ch;
		}
		return encrypt;
    }

	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String decryptCaesar(String encryptedText, int key) {
		String decrypt = "";
		for(int index = 0; index < encryptedText.length(); index++) {
			char ch = encryptedText.charAt(index);
			int decrypt_ch = ((int)ch - key);
			while(decrypt_ch < LOWER_BOUND) {
				decrypt_ch += RANGE;
			}
			decrypt += (char) decrypt_ch;
		}
		return decrypt;
    }

	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String decryptBellaso(String encryptedText, String bellasoStr) {
		String decrypt = "";
		for (int index = 0; index < encryptedText.length(); index++) {
			char ch = encryptedText.charAt(index);
			int decrypt_ch = ((int)ch - (int)bellasoStr.charAt(index % bellasoStr.length()));
			while(decrypt_ch < (int)LOWER_BOUND) {
				decrypt_ch += RANGE;
			}
			decrypt += (char) decrypt_ch;
		}
		return decrypt;
	}
}
