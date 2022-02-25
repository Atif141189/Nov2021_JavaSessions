package SeleniumSessions;

public class StringJavaConcept {

	public static void main(String[] args) {
		
		// String Concatenation-Merging two thing.
		
		String x="Atif";
		
		String y="Hossain";
		
		int a=100;
		
		int b=200;
		
		double d1=14.55;
		
		double d2=134.78;
		
		
		//System.out.println(a+b); output--->300 addtion operation not merging or concatenation.
		
		System.out.println(x+y); //Concatenation or merging for String.
		
		System.out.println(a+b+x+y);// First addition then merging or concatenation happening.
		
		System.out.println(x+y+a+b); //All merging is happening not arithmetic operation output--->AtifHossain100200
		
		System.out.println(x+y+(a+b));//output ----->AtifHossain300
		
		System.out.println((a+b)+x+y);
		
		System.out.println(x+y+d1+d2+a+b);///output--->AtifHossain14.55134.78100200
		
		System.out.println(a+b+d1+d2+x+y);//output---->449.33000000000004AtifHossain
		
		//---->>>>Left to right execution.
		
		int h=12;
		
		int g=3;
		
		System.out.println(h/g); //output-->4
		
		System.out.println(12/3);//output-->4
		
		System.out.println(9.0/3);
		
		System.out.println(9.0/3.0);
		
		System.out.println(9/3);
		
		System.out.println(9/3.0);
		
		//System.out.println(9/0); //Error-->Exception in thread "main" java.lang.ArithmeticException: / by zero
		//pure integer divided by zero java will throw error as line 56.
		
		//System.out.println(9.0/0); //floating point number divided 0 with give output as'Infinity'.
		
		System.out.println(901%2);
		
		System.out.println(9.2%2);

	}

}
