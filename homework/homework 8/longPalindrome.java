import java.util.HashSet;

public class longPalindrome {
	public static int longestPalindrome(String s) 
	{
		if (s.length() == 0)
		{
			return 0;
			
		}
		int dupliCount = 0;
		HashSet<Character> count = new HashSet<Character>();
		for(int i = 0; i < s.length(); i++)
		{
			if(count.contains(s.charAt(i)))
			{
				count.remove(s.charAt(i));
				dupliCount++;
			}
			else
			{
				count.add(s.charAt(i));
			}
		}
		if(count.isEmpty())
		{
			return 2*dupliCount;
		}
		else 
		{
			return 2*dupliCount + 1;
		}
    }
	public static void main(String[] args)
	{
		String s = "speediskey";
		System.out.println(longestPalindrome(s));
	}
}
