import java.util.*;
public class Servers 
{
	public static int minMeetingRooms(int[][] intervals)
	{
		if(intervals.length <= 0)
		{
			return 0; //has to have values
		}
		int[] start = new int[intervals.length];
		int[] end = new int[intervals.length];
		for (int i = 0; i < intervals.length; i++)
		{
			start[i] = intervals[i][0];
			end[i] = intervals[i][1];
		}
		Arrays.sort(start);
		Arrays.sort(end);
		int servers = 0;
		int itr = 0;
		for(int i = 0; i < start.length; i++)
		{
			if (start[i] < end[itr])
			{
				servers++;
			}
			else
			{
				itr++;
			}
		}
		return servers;
	}
	public static void main(String[]args)
	{
		int[][] intervals = {{0,1},{1,2},{2,3}};
		System.out.println(minMeetingRooms(intervals));
		
		int[][] intervals2 = {{0,30},{5,10},{15,20}};
		System.out.println(minMeetingRooms(intervals2));
	}
}
