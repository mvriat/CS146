import java.util.*;
public class Courses 
{
	public static boolean canFinish(int numCourses, int[][] prerequisites)
	{
		 if(prerequisites.length == 0)
		 {
			 return true;
		 }
		 if (numCourses < 0 || numCourses > 2000)
		 {
			 return false;
		 }
		 List<Integer>[] edgeList = new List[numCourses];
		 int[] frequencies = new int[numCourses];
		 int count = 0;
		 for (int[] prereq : prerequisites)
		 {
			 if(edgeList[prereq[0]] == null)
			 {
				 edgeList[prereq[0]] = new ArrayList<>();
			 }
			 edgeList[prereq[0]].add(prereq[1]);
			 frequencies[prereq[1]]++;
		 }
		 Queue<Integer> queue = new LinkedList<>();
		 for(int i = 0; i < edgeList.length; i++)
		 {
			 if(frequencies[i] == 0)
			 {
				 queue.offer(i);
				 count++;
			 }
		 }
		 while(!queue.isEmpty())
		 {
			 int i= queue.poll();
			 for (int n = 0; edgeList[i] != null && n < edgeList[i].size(); n++)
			 {
				 int j = edgeList[i].get(n);
				 frequencies[j]--;
				 if(frequencies[j] == 0)
				 {
					 count++;
					 queue.offer(j);
				 }
			 }
		 }
		 return count == numCourses;
	}
	public static void main(String[] args)
	{
		int numCourses = 2;
		int[][] prereq = {{1,0},{0,1}};
		Courses test = new Courses();
		System.out.println(canFinish(numCourses, prereq));
	}
}
