package jose.sunoj;
import java.util.Arrays;

/**
 * a Java program to check whether two given strings are anagrams or not
 * @author sunoj jose
 * @version 0.1
 *
 */
public class Main {
	
	/**
	 * the main method of the application to call the isAnagrams method
	 * @param args command line arguments
	 */

	public static void main(String[] args) {
		System.out.println(isAnagrams("action man", "cannot aim"));
		System.out.println(isAnagrams("action man", "cannotaim"));
		System.out.println(isAnagrams("the eyes", "they see"));
		System.out.println(isAnagrams("the eyes", "they sea"));

	}
	
	/**
	 * This method tests the given strings 
	 * @param s the first string
	 * @param t the second string
	 * @return true or false
	 */
	private static boolean isAnagrams(String s, String t) {
		if (s.length() != t.length()) return false;
		char[] ch1 = s.toCharArray();
		char[] ch2 = t.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);

	}	

}
