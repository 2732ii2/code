//5 4 3 2 1 1 2 3 4 5 series

public class Main
{
	public static void main(String[] args) {
	    int n=5;
	    series(n);
		System.out.println("Hello World");
	}
	
	public static void series(int n)
	{
	    if(n==0)
	    {
	        return;
	    }
	    System.out.println(n);
	     series(n-1);
	    System.out.println(n);
	   
	}
}
