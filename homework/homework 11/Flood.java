import java.util.Arrays;

public class Flood 
{
	 public int[][] floodFill(int[][] image, int sr, int sc, int color) 
	 {
	       if (image == null || image.length == 0 || image[0].length == 0 || sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length)
	       {
	    	   return image; //takes care of weird image inputs
	       }
	       if (image[sr][sc] == color)
	       {
	    	   return image;
	       }
	       floodFillHelper(image, sr,sc,image[sr][sc], color);
	       return image;
	 }
	 public void floodFillHelper(int[][] image, int row, int column, int color, int newColor)
	 {
		 if (row < 0 || column < 0 || row >= image.length || column >= image[0].length || image[row][column] != color)
		 {
			 return;
		 }
		 image[row][column] = newColor;
		 int[][] directionals = {{1,0},{-1,0},{0,1},{0,-1}};
		 for (int[] directions : directionals)
		 {
			 floodFillHelper(image, row+directions[0], column+directions[1], color, newColor);
		 }
	 }
	 public static void toString(int arr[][]) 
	    { 

	        for (int i = 0 ; i < arr.length ; i++)
	        {
	            System.out.println(Arrays.toString(arr[i])); 
	        } 
	            
	    } 
	 public static void main(String[] args)
	 {
		 Flood test = new Flood();
		 int[][] img = 
			 {
					 {2,2,2},
					 {2,2,0},
					 {2,0,2}
			 };
		 int sr = 1;
		 int sc = 1;
		 int newColor = 8;
		 int[][] answer = test.floodFill(img,sr,sc,newColor);
		 toString(answer);
	 }
}
