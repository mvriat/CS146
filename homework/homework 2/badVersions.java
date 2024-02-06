
public class badVersions 
{
	//Change this yourself to decide which one is the bad version.
	public static boolean isBadVersion(int version)
	{
		if (version == 3 || version == 4 || version == 5 || version == 6)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static int firstBadVersion(int n)
	{
		int firstVersion = 1;
		int lastVersion = n;
		while (firstVersion < lastVersion)
		{
			int middle = firstVersion + (lastVersion - firstVersion) / 2;
			if (isBadVersion(middle))
			{
				lastVersion = middle;
			}
			else
			{
				firstVersion = middle + 1;
			}
		}
		return firstVersion;
	}
	public static void main(String args[])
	{
		System.out.println(firstBadVersion(10));
	}
}
