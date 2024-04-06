package _01_algorithms._2_fibonacci;
public class algorithms_2_fibonacci 
{
	
	public int fib(int n)
	{
		if(n == 0)
			return 0;
		if (n == 1)
			return 1;


		return fib(n-1) + fib(n-2);
		
		
		
	}
	
	
public static void main(String [] args)
{
	
	algorithms_2_fibonacci f = new algorithms_2_fibonacci();
		for(int i = 0; i < 10; i++)
		System.out.println(f.fib(i));
}



}
