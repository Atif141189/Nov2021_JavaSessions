package SeleniumSessions;

import java.util.Scanner;

public class LoopAssignment {

	public static void main(String[] args) {
//		Loops Assignment:
//
//
//			1. WAP to print following output:
//
//
//			I am Batman
//
//
//			I am Batman
//
//
//			I am Batman
//
//
//			I am Batman
//
//
//			I am Batman
		
//		for(int i=1;i<=5;i++)
//		{
//			System.out.println("I am Batman\n");
//		}
//		
		//Using while loop
		
//		int i=1;
//		
//		while (i<=5)
//		{
//			System.out.println("I am Batman\n");
//			
//			i++;
//		}
		
		
//		2. WAP to print following output:
//			I am Batman 1
//
//
//			I am Batman 2
//
//
//			I am Batman 3
//
//
//			I am Batman 4
//
//
//			I am Batman 5
//
//
//			I am Batman 6
//
//
//			I am Batman 7
//
//
//			I am Batman 8
//
//
//			I am Batman 9
//		//using for loop.
//		for(int i=1;i<=9;i++)
//		{
//			System.out.println("I am Batman\s"+i+"\n");
//		}
//		
		//using while loop.
		
//		int i=1;
//		
//		while(i<=9)
//		{
//			System.out.println("I am Batman\s"+i+"\n");
//			
//			i++;
//			
//		}
		
		//3. WAP to print 10 to 1 using for, while and do-while loop
		
		//using for loop.
		
//		for(int i=10;i>=1;i--)
//		{
//			System.out.println(i);
//			
//			
//		}
		//using while loop.
		
//		int i=10;
//		while(i>=1)
//		{
//			System.out.println(i);
//			i--;
//		}

        //using do-while loop.
		
//		int i=10;
//		do {
//			System.out.println(i);
//			i--;
//		}
//		while(i>=1);
		
		//4. Write a program in Java to print "Hello World" ten times using while loop
		
//		int g=1;
//		
//		while(g<=10)
//		{
//			System.out.println("Hello world");
//			
//			g++;
//		}
        
//		5. Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
		
//		int r=1;
//		
//		while(r<=20)
//		{
//			if(r%7==0) {
//				
//				break;
//			}
//			
//			System.out.println(r);
//			
//			r++;
//			
//		}
		
		
//		Data Types:
//		1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
//	    Expected Output :
//	    Hello 
//		Naveen K	
		
		//using while loop.
//	    int i=1;
//		while(i<2)
//		{
//			System.out.println("Hello"+"\n"+ "Atif Hossain");
//			
//			i++;
//		}
			
//		//using for loop.
//		
//		for(int i=1;i<2;i++)
//		{
//			System.out.println("Hello"+"\n"+ "Atif Hossain");
//		}
		
//		2. Write a Java program to print the sum of two numbers. 
//		Test Data: 
//		 74 + 36 
//		Expected Output :
//		110
		
//		int a=74;
//		
//		int b=36;
//		
//		System.out.println(a+b);
		
		
	
//		3. Write a Java program to divide two numbers and print on the screen. 
//		Test Data : 
//		50/3
//		Expected Output :
//		16
		
//		int y=50;
//		
//		int h=3;
//		
//		System.out.println(y/h);
//		
		
		
//		4. Write a Java program to print the result of the following operations. Change your test data accordingly.
//		Test Data:
//		a. -5 + 8 * 6
//		b. (55+9) % 9 
//		c. 20 + -3*5 / 8 
//		d. 5 + 15 / 3 * 2 - 8 % 3 
//		Expected Output :
//		43 
//		1 
//		19 
//		13
		
		//System.out.println(-5 + 8 * 6);
		//System.out.println(((55+9) % 9));
		//System.out.println(20+(-3*5 / 8));
		//System.out.println(5 + (15 / 3) * 2 - (8 % 3));
		
//		5. Write a Java program to compute the specified expressions and print the output. Go to the editor
//		Test Data:
//		((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
//		Expected Output
//		2.138888888888889
//		
		
		
		//System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
		
		
		
		//6. Try to concat "Hello Selenium" with a character 't'.
//		char c='t';
//		System.out.println("Hello Selenium"+c);
//		
//		7. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
//		"Your Toal amount is. 3700".
		
//		int a1=100;
//		int b1=200;
//		int c1=3400;
//		
//		System.out.println("Your Toal amount is."+"\s"+(a1+b1+c1));
//		
  
//		Question 3: Try to print the following pattern on the console:
//			n = 4
//			n = 3
//			n = 2
//			n = 1
//			n = 0	
		
		
//		for(int i=4;i>=0;i--)
//		{
//			System.out.println("n="+i);
//		}
//		
		
		
//		Question 2: Write a program to create a static Array, having following cricket data:
//			--name(String), age(age), team name(String), DOB(String), gender(char), Strike Rate(Double), isActive(boolean)
//			--Try to create multiple Object Arrays for different players 
//			--Try to print all the values of each player on the console using normal for/while loop and for each loop	
//		
//		
		
		Object[] cricketerSachinData=new Object[7];
		
		cricketerSachinData[0]="Sachin Tendulkar";
		
		cricketerSachinData[1]=40;
		
		cricketerSachinData[2]="India";
		
		cricketerSachinData[3]="141179";
		
		cricketerSachinData[4]='M';
		
		cricketerSachinData[5]=100.00;
		
		cricketerSachinData[6]=true;
		
		Object[] cricketerRahulDravidData=new Object[7];
		
		cricketerRahulDravidData[0]="Rahul Dravid";
		
		cricketerRahulDravidData[1]=36;
		
		cricketerRahulDravidData[2]="India";
		
		cricketerRahulDravidData[3]="141185";
		
		cricketerRahulDravidData[4]='M';
		
		cricketerRahulDravidData[5]=400.00;
		
		cricketerRahulDravidData[6]=false;
		
//		for(Object e:cricketerSachinData)
//		{
//			System.out.println(e);
//		}
//		
//		System.out.println("---------------------------");
//		
//		
//		for(Object e:cricketerRahulDravidData)
//		{
//			System.out.println(e);
//		}
		
		for(int i=0;i<cricketerSachinData.length;i++)
		{
			System.out.println(cricketerSachinData[i]);
			
			
		}
		
		System.out.println("---------------------------");
		
		
		
		for(int i=0;i<cricketerRahulDravidData.length;i++)
		{
			System.out.println(cricketerRahulDravidData[i]);
			
			
		}
		

	}
}
