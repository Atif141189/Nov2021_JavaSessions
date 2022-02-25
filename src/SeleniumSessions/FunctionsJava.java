package SeleniumSessions;

public class FunctionsJava {
	
	//methods:
	//method is piece of code which is reuseable and can be executed n number of times.
	//method is parallel to each other. Method cannot be created inside method.
	//Method cannot be duplicate.
	
	//no input and no return:
	
//	public void testLoginPage() // No input/parameter present
//	{
//		System.out.println("test method...");
//		
//		//testLoginPage() method is not returning anything. method is void in nature.
//		//we cannot use return keyword.
//	
//	}
	
	// no input and some return.
	
//	public String getNumber() // No input/parameter present
//	{
//		System.out.println("get number method...");
//		
//		return "Return type is String for get number method";
//	
//	}
	
//	public boolean getResults()
//	{
//		return false;
//	}
	
	//Some input and some return:
	
	public int addNumbers(int a,int b)
	{
		int c=a+b;
		
		return c;
	}
	
	
	public static void main(String[] args)
	{
		FunctionsJava object=new FunctionsJava();
		
		//object.testLoginPage();
		
		//String g=object.getNumber();
		
		//System.out.println(g);
		
		//object.getNumber();
		
//		boolean flag=object.getResults();
//		
//		if(flag)
//		{
//			System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
		
//		int results=object.addNumbers(30, 40);
//		
//		System.out.println(results);
//		
//		

	}

}
