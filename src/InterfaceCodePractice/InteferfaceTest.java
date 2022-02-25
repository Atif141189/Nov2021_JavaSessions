package InterfaceCodePractice;

public class InteferfaceTest {
	
	public static void main(String args[])
	{
		
//		ChromeDriver chrmobj=new ChromeDriver();
//		
//		chrmobj.get("https://abc.com");
//		
//		System.out.println(chrmobj.getUrl());
		
		
		String browser="Chrome";
		
		WebDriver driver=null;
		
		if(browser.equals("Chrome")) 
		{
			driver=new ChromeDriver();
			
		}
		else if(browser.equals("Firefox"))
		{
			driver=new FireFoxDriver();
		}
		else if(browser.equals("Safari"))
		{
			driver=new SafariDriver();
		}
		else
		{
			System.out.println("Enter the correct browser..");
		}
		driver.findElement();
		driver.findElements();
		driver.get("abc.com");
		driver.getClass();
		driver.close();
		
		
		
		
		
		
		
	}

}
