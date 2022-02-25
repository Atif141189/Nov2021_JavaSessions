package StaticVsNonStatic;

public class MainMethodOverloading {

	public static void main(String[] args) 
	{
		System.out.println("Main method..");
		
		int a=MainMethodOverloading.main(10);
		
		System.out.println(a);

	}
	
	public static int main(int a) 
	{
	 return a;
	}

}
