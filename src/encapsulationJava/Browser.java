package encapsulationJava;

public class Browser {
	
	
	public void launchBrowser()
	{
		System.out.println("Trying to launch chrome..");
		osCompatible();
		browserVersion();
		System.out.println("Chrome is launched");
		
	}
	
	private void osCompatible()
	{
		System.out.println("Trying to check osCompatible....");
		
	}
	
	private void browserVersion()
	{
		System.out.println("Trying to check browserVersion..");
	}

}
