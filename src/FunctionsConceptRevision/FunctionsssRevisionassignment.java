package FunctionsConceptRevision;

public class FunctionsssRevisionassignment {
	
	
	
	//WAP:Write a program to print the sum of two numbers entered by user by defining your own method
	
	
	public int sum(int a, int b)
	{
		
		System.out.println("Adding two numbers..");
		int c=a+b;
		
		return c;
	}
	
	//Write a program to print the factorial of a number by defining a method named 'Factorial'.
	//Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
//	4! = 1*2*3*4 = 24
//	3! = 3*2*1 = 6
//	2! = 2*1 = 2
//	Also,
//	1! = 1
//	0! = 0
	//5!=5*4*3*2*1=120
	public int factNumber(int number) 
	{
		int fact=1;
		if(number>=1) 
		{
			for(int i=1;i<=number;i++)
			{

					fact=fact*i;
					
			}
			
		}
		else
		{
			fact=0;
		}
		
		return fact;
		
	}
	

}
