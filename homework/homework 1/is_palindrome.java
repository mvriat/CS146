import java.util.Arrays;

public class is_palindrome 
{
	public static boolean isPalindrome(String s)
	{
		s = s.toLowerCase();
		s = s.replaceAll("[^A-Za-z0-9]", "");
		char[] normal = s.toCharArray();
		char[] backwards = new char[normal.length];
		int j = 0;
		for (int i = normal.length - 1; i >= 0; i--)
		{
			backwards[j] += normal[i];
			j++;
		}
		return Arrays.equals(normal, backwards);
	}
	public static void main(String args[])
	{
		String test1 = "poop";
		System.out.println(isPalindrome(test1));
	}
}
