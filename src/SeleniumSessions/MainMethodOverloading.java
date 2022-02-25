package SeleniumSessions;

public class MainMethodOverloading {
	
	public static void main(String[] args)
	{
		System.out.println("Actual main method...");
		
		main(10);
		main(10,90);

	}

	public static void main(int d)
	{
		System.out.println("Method overloaded...");

	}
	
	public static int main(int d,int c)
	{
		System.out.println("Addtion number "+(d+c));
		
		return 5000;

	}
	
}
