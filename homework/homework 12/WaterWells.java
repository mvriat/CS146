import java.util.*;
public class WaterWells 
{
		private static int[] parentNodes;
	   public static int minCostToSupplyWater(int n, int[] wells, int[][] pipes)
	   {
		   int[][] nums = Arrays.copyOf(pipes, pipes.length + n);
		   for (int i = 0; i < n; i++)
		   {
	            nums[pipes.length + i] = new int[] {0, i + 1, wells[i]};
	       }
		   Arrays.sort(nums, (a, b) -> a[2] - b[2]);
		   parentNodes = new int[n + 1];
	        for (int i = 0; i <= n; i++) 
	        {
	        	parentNodes[i] = i;
	        }
	        int result = 0;
	        for (var z : nums)
	        {
	        	//z represents every connection (pipe/well) along with cost
	        	int a = z[0], b = z[1], c = z[2];
	        	int parentA = find(a);
	        	int parentB = find(b);
	        	if (parentA != parentB)
	        	{
	        		parentNodes[parentA] = parentB;
	        		result += c;
	        		if (n-- == 0)
	        		{
	        			return result;
	        		}
	        	}
	        			
	        }
	        return result;
	   }
	   private static int find(int x)
	   {
		   if (parentNodes[x] != x)
		   {
			   parentNodes[x] = find(parentNodes[x]);
		   }
		   return parentNodes[x];
	   }
	   public static void main(String[] args)
	   {
		   int n = 2;
		   int[] wells = new int[]{1,1};
		   int[][] pipes = new int[][] {{1,2,1},{1,2,2}};
		   WaterWells test = new WaterWells();
		   System.out.println(minCostToSupplyWater(n, wells, pipes));
	   }
}
