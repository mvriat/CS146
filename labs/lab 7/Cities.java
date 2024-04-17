import java.util.Arrays;

public class Cities 
{
	public static int findTheCity(int n, int[][] edges, int distanceThreshold) 
	{
		int[][] graph = new int[n][n];
		// fill the diagonals with 0
		for (int i = 0; i < n; i++)
		{
			Arrays.fill(graph[i], Integer.MAX_VALUE);
			graph[i][i] = 0;
		}
		for (int[] a : edges)
		{
			int u = a[0];
			int v = a[1];
			int weight = a[2];
			graph[u][v] = weight;
			graph[v][u] = weight;
		}
		for (int k = 0; k < n; k++) 
		{
			for (int i = 0; i < n; i++) 
			{
				for (int j = 0; j < n; j++) 
				{
					if (graph[i][k] != Integer.MAX_VALUE && graph[k][j] != Integer.MAX_VALUE) 
					{
						graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
					}
				}
			}
		}
		int minimumCount = Integer.MAX_VALUE;
		int result = -1;
		for (int i = 0; i < n; i++)
		{
			int count = 0;
			for (int j = 0; j < n; j++)
			{
				if (i != j && graph[i][j] <= distanceThreshold) 
				{
					count++;
				}
			}
			if (count <= minimumCount) 
			{
				minimumCount = count;
				result = i;
			}
		}
		return result;
	}
	public static void main(String args[])
	{
		Cities test = new Cities();
		int[][] test1 = new int[][] {{0,1,3},{1,2,1},{1,3,4},{2,3,1}};
		System.out.println(findTheCity(4, test1, 4));
	}
}
