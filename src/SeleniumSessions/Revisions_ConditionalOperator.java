package SeleniumSessions;

public class Revisions_ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// byte b=066;

		// A Octal number starts with 0 and have a base of 8.

		// Decimal number have base of 10.

		// Java will always print equivalent decimal number and calcualted as below.

		// (0*8^2)+(6*8^1)+(6*8^0)=54

		// System.out.println(b); //output--->54

		// octal number will start with 0 and can have any digit between 0 to 7 only.
		// So the below number is not octal number.
		// byte b1=088;

		// octal number will start with 0 and can have any digit between 0 to 7 only.
		// the equivalent decimal number of 07777 is 4095 which can not be stored in
		// byte.
		// but we can use short, int, and long to store the value.

		// int b2=07777;

		// System.out.println(b2);

		// Assignment operator.

//		int a =10; //=----> assignment operator.
//		
//		int b=20;  //=----> assignment operator.
//		
//		System.out.println(a==b); //== ----> comparison operator.
//		

		// When we need to do comparison between 2 primitive data types we need to use
		// "==" operator.

		// After if keyword we need to write boolean. Otherwise java will throw error.

//		if(a==b)
//		{
//			System.out.println("PASS");
//	    }
//		else {
//			System.out.println("FAIL");
//		}
//		
//		System.out.println("==================");
//		
		// Example of dead code.

		// Else block is never reachable.

//		if(true)
//		{
//			System.out.println("PASS");
//	    }
//		else {
//			System.out.println("FAIL");
//		}

		// How to overcome this problem.

		// the flag value can change.

//		boolean flag=true;
//		
//		if(flag)
//		{
//			System.out.println("PASS");
//		}
//		else
//		{
//			System.out.println("FAIL");
//		}

//		double d1=12.33;
//		double d2=12.33;
//		
//		if(d1==d2)
//		{
//			System.out.println("Bot are equal");
//		}

		// String is a class in java.
		// we use equals() method to compare 2 Strings.
		// Hard comparison.

//		String S1="Hello";
//		String S2="hello";
//		
//		if(S1.equals(S2))
//		{
//			System.out.println("Equal......");
//		}
//		else
//		{
//			System.out.println("Not equal");
//		}

//		String S1="HellO";
//		String S2="hello";
//		
//		if(S1.equalsIgnoreCase(S2))
//		{
//			System.out.println("Match found");
//		}

//		String browser = "ie";
//		if(browser.equals("chrome")) {
//			System.out.println("launch chrome");
//		}
//		
//		if(browser.equals("ff")) {
//			System.out.println("launch ff");
//		}
//		
//		if(browser.equals("safari")) {
//			System.out.println("launch safari");
//		}
//		
//		if(browser.equals("ie")) {
//			System.out.println("launch ie");
//		}
//
//		else {
//			System.out.println("please pass the right browser");
//		}

		int a=10;
		
		int b=20;

		switch (a==b) {
		case value:

			break;

		default:
			break;
		}

	}

}
