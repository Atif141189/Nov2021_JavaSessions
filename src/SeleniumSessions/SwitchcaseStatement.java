package SeleniumSessions;

public class SwitchcaseStatement {

	public static void main(String[] args) {
		
		String browserr="Chr o me ";
		
		switch (browserr.toLowerCase().trim().replaceAll(" ", "")) {
		case "ff":
			System.out.println("Fire fox");
			break;
		case "chrome":
			System.out.println("Chrome");
			break;

		default:
			System.out.println("No browser available");
			break;
		}
		
		
		
		

	}

}
