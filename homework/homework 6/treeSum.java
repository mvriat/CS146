import java.util.*;
public class treeSum {
	public static List<List<Integer>> threeSum(int[] nums)
	{
		Arrays.sort(nums); //sorting will help us skip duplicate numbers
		List<List<Integer>> answer = new ArrayList<>();
		if(nums.length < 3)
		{
			return answer;
		}
		for(int i = 0; i + 2 < nums.length; i++)
		{
			if(i > 0 && nums[i] == nums[i - 1])
			{
				continue; //here we are skipping the duplicates starting from second element
			}
			int j = i + 1;
			int k = nums.length - 1; 
			//here we made the two points going inwards after num1
			while(j < k)
			{
				int sum = nums[i] + nums[j] + nums[k];
				if (sum == 0 && i != j && i != k && j != k)
				{
					answer.add(Arrays.asList(nums[i], nums[j], nums[k]));
					k--;
					while(j < k && nums[k] == nums[k + 1])
					{
						k--;
					}
				}
				else if (sum > 0)
				{
					k--;
				}
				else
				{
					j++;
				}
				//we do this do that if the sum is greater or less than zero, we can 
				//just skip those greater or lesser values
			}
		}
		return answer;
	}
	public static void main(String[] args)
	{
		//teacher test cases
		int[] test1 = new int[] {0,1,1};
		System.out.println(threeSum(test1));
		int[] test2 = new int[] {-5,0,5,10,-10,0};
		System.out.println(threeSum(test2));
		//maria test case
		int[] test3 = new int[] {5,6,4,3,0,0,2,1};
		System.out.println(threeSum(test3));
	}
}
