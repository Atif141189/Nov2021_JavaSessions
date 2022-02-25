package encapsulationJava;

public class TestLogin {

	public static void main(String[] args) {
		
		//user1
		LoginPage obj2=new LoginPage("Atif Hossain","@1234");
		
		System.out.println(obj2.getUsername());
		
		System.out.println(obj2.getPassword());
		
		//user 2
		
		LoginPage obj3=new LoginPage("Naveen","@12121");
		
		System.out.println(obj3.getUsername());
		//System.out.println(obj3.getPassword());
		
		obj3.setPassword("@12321");//update the values
		System.out.println(obj3.getPassword());	
		
		obj3.doLogin(obj3.getUsername(), obj3.getPassword());
		

	}

}
