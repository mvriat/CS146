package lab_2;
import java.util.*;
public class anagram_finder 
{
	//private String s;
	//private String t;
	//private boolean isAnagram;
	
	public static boolean anagramFinder(String s, String t)
	{
		//boolean isAnagram;
		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();
		Arrays.sort(sArray);
		Arrays.sort(tArray);
		return Arrays.equals(sArray, tArray);
	}
	public static void main(String[] args) 
	{
		String a = "poop";
		String b = "liar";
		System.out.println(anagramFinder(a,b));
	}
}
