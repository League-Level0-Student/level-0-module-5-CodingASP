package _02_nested_loops._3_for_loop_gauntlet;

public class forLoopGuantlet {
	public static void main(String [] ARgs)
	{
	
		
		
		
		
	
	for (int i = 0; i < 101; i++)
		System.out.println(i);
	
	for (int i = 100; i > -1; i--)
		System.out.println(i);
	
	
	for (int i = 2; i < 101; i+=2)
		System.out.println(i);
	
	
	for (int i = 1; i < 100; i+=2)
		System.out.println(i);
	
	
	
	for (int i = 1; i < 501; i++) {
		if (i%2 == 0)
			System.out.println(i + " is even");
		else
			System.out.println(i + " is odd");
	}
	
	for (int i = 7; i < 778; i+=7)
		System.out.println(i);

	
	for (int i = 0; i < 18; i+=1)
	{
		System.out.println("In " + (2007+i) + " I was " + i + " years old.");
	}	
	
	
	
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++)
			System.out.println(i + " " + j);
	}
	
	
	
	
	for (int i = 1; i < 10; i ++)
	{
		if ((i-1) % 3 == 0)
			System.out.println();
		System.out.print(i + " ");
	}
	
	
	for (int i = 1; i < 101; i++)
	{
		if ((i-1) % 10 == 0)
			System.out.println();
		System.out.print(i + " ");
	}
	
	
	for (int i = 0; i < 7; i++) {
		System.out.println();
		for (int j = 0; j < i; j++)
			System.out.print("* ");
	}
	System.out.println();
	for (int i = 0; i < 101; i++)
		System.out.println((i-100)*-1);
	
	
	}
}
