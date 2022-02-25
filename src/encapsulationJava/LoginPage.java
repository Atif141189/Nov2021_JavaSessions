package encapsulationJava;

public class LoginPage {
	
	private String username;
	
	private String password;

	public LoginPage(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//method
	
	public void doLogin(String name,String password)
	{
		
		System.out.println("Enter username :"+name);
		System.out.println("Enter password :"+password);
		
		System.out.println("Click on login button");
		System.out.println("Login is successful");
	}
	
	
	
}
