package jose.sunoj;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		System.out.println(isAnagrams("action man", "cannot aim"));
		System.out.println(isAnagrams("action man", "cannotaim"));
		System.out.println(isAnagrams("the eyes", "they see"));
		System.out.println(isAnagrams("the eyes", "they sea"));

	}
	
	private static boolean isAnagrams(String s, String t) {
		if (s.length() != t.length()) return false;
		char[] ch1 = s.toCharArray();
		char[] ch2 = t.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);

	}	

}

}
