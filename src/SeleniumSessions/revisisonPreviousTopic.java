package SeleniumSessions;

public class revisisonPreviousTopic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Character are part of numeric family as internally they are stored based on the ASCII value of the character.
		char ch1='a';
		
		char ch2='b';
		
		System.out.println(ch1); // when printing a individual character then the character will be printed in the output.
		
		System.out.println(ch1+ch2); //97+98=195 ....While performing a arithmetic operation it will take individual ASCII value of a and b which are stored in ch1 and ch2.
		
		
		//range of ASCII value
		//a-z:97 to 122
		//A-Z:65 to 90
		//0-9:48 to 57
		
		// to print the individual value of character. when not performing any arithmetic operation.
		
		System.out.println((int)ch2);
		
		//String Concatenation
		
		String x="atif"; //String is a class in java. Always string are written in double quotes.
		
		String y="Hossain";
		
		int a=100;
		int b=200;
		
		System.out.println(a+b);
		
		System.out.println(x+y); //String concatenation...>atifhossain
		
		System.out.println(a+b+x+y); //300atifhossain
		
		System.out.println(x+y+a+b); //atifhossain100200
		
		System.out.println(x+y+(a+b)); //atifhossain300
		
		//With String we can use only operator i.e + operator.
		
		//System.out.println(9/0); //Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		//System.out.println(0/0); //Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		System.out.println(9.0f/0); //Infinity
		
		System.out.println(8.4/0);//Infinity
		
		System.out.println(9/0.00);//Infinity
		
		System.out.println(0.00/0.00); //NaN----> Not a number.
		
		System.out.println(0/13);//0
		
		System.out.println(0.1+0.2);
		
		//Incremental and Decremental Operator
		
		int a1=10;
		
		int b1=a1++;
		
		System.out.println(a1); //11
		
		System.out.println(b1);//10
		
		int c5=-90;
		int r=c5++;
		
		System.out.println(c5); //-89
		System.out.println(r);//-90
		
		int t=90;
		int f=++t;
		
		System.out.println(t); //91
		
		System.out.println(f); //91
		
		
		int y6=-98;
		int e=--y6;
		
		System.out.println(y6);//-99
		System.out.println(e);//-99
		
		int q=90;
		System.out.println(q++);
		
		System.out.println(q);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
