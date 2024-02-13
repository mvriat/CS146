package fibonacci;

public class fibonnaci_iterative 
{
	//this starts at 1 not 0
	static int fibonacci (int n) 
	{
	    int x = 0;
	    int y = 1;
	    for(int i = 0; i < n; i++) 
	    {
	        int temp = x;
	        x = x + y;
	        y = temp;
	    }
	    return x;
	}
	
	public static void main(String args[])
	{
		System.out.println(fibonacci(8));
	}
}
