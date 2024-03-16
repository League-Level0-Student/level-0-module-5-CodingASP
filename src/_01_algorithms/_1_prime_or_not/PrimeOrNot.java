package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot 
{

	public static void main(String[] args) 
	{
		boolean isPrime = true;
		String input = JOptionPane.showInputDialog("Enter a number");
		int num = Integer.parseInt(input);
		for(int i = 2; i * i <= num; i++) 
		{
	        if (i % num == 0) 
	            isPrime = false;
	        
		}
	        if (isPrime == true)
	        	System.out.println("That is a prime number!");
	        else
	        	System.out.println("That is NOT a prime number!");
	       
	        
	    

	}

}
