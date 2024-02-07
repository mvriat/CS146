package lab1;

import java.util.Arrays;

public class index_finder 
{
	public static int[] indexFinder(int[] nums, int target)
	{
		//int secNum;
		for (int i = 0; i < nums.length - 1; i++)
		{
			//secNum = target - nums[i];
			for (int j = i + 1; j < nums.length; j++)
			{
				if (nums[i] + nums[j] == target)
				{
					return new int[] {i, j};
				}
			}
		}
		return new int[] {};
	}
	public static void main(String args[])
	{
		int[] nums1 = new int[]{3,6,4,2};
		int target1 = 7;
		int[] result1 = indexFinder(nums1, target1);
		System.out.println(Arrays.toString(result1));
		
		int[] nums2 = new int[]{1,1,1,1,1,1};
		int target2 = 4;
		int[] result2 = indexFinder(nums2, target2);
		System.out.println(Arrays.toString(result2));
	}
}
