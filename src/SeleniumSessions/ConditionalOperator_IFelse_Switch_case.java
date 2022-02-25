package SeleniumSessions;

public class ConditionalOperator_IFelse_Switch_case {

	public static void main(String[] args) {

		// Conditional Operator

		byte b = 0127;

		System.out.println(b);

		// byte b1=078;

		// System.out.println(b1);

		int c1 = 0777;
		System.out.println(c1);

		int r = 90;
		int e = 45;

		System.out.println(r == e);
		if (r == e) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");
		}

		// Dead Code

		if (true) {
			System.out.println("Hiiii");
		} else {
			System.out.println("Biiii"); // Dead Code
		}

		if (false) {
			System.out.println("Hiiii");// Dead Code
		} else {
			System.out.println("Biiii");
		}
		// Not a dead code. As the flag value can change in future.
		boolean flag = true;

		if (flag) {
			System.out.println("Hiiii");// Dead Code
		} else {
			System.out.println("Biiii");
		}

		double d1 = 19.88;
		double d2 = 19.888888;

		if (d1 == d2) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Botha re not equal");
		}

		String s1 = "Atif";
		String s2 = "Hossain";

		// System.out.println(s1.equals(s2));

		if (s1.equals(s2)) {

			System.out.println("Matched");
		} else {
			System.out.println("Not Matched");
		}

		String f1 = "Atif ";
		String f2 = "Atif";

		if (f1.equals(f2)) {
			System.out.println("MAtcheeeed");

		}

		else {
			System.out.println("No String match");
		}

		// 1-50--->2nd class
		// 50-69---->1st class
		// 70-100 ----Grade A
		
		
			

		// 1-50--->2nd class
		// 50-70---->1st clas
		// 70-100 ----Grade A

	}

}
