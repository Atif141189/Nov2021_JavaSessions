package SeleniumSessions;

public class PracticeAssignmentFunctions {

	// Launch a browser.
	// input param:name (String)--->FF/Chrome/IE etc.
	// return: boolean

	public boolean launchBrowser(String name) {
		System.out.println("Entered browser name is :" + name);
		
		boolean flag=false;

		switch (name.toLowerCase()) {
		case "chrome":
			System.out.println("Launch Chrome");
			flag=true;
			//return true;
			break;
		case "firefox":
			System.out.println("Launch firefox");
			flag=true;
			//return true;
			break;
		case "ie":
			System.out.println("Launch ie...");
			flag=true;
			//return true;
			break;
		case "opera":
			System.out.println("Launch opera");
			flag=true;
			//return true;
			break;

		default:
			System.out.println("Please enter the correct browser name..");
			flag=false;
			//return false;
			break;
		
		}
		return flag;

	}

	public static void main(String[] args) {
		
		PracticeAssignmentFunctions objectt=new PracticeAssignmentFunctions();
		
		boolean result=objectt.launchBrowser("ie");
		
		System.out.println(result);
	}

}
