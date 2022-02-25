package InterfaceCodePractice;

public class RemoteWebDriver implements WebDriver{

	@Override
	public void findElements() {
		System.out.println("Find elements....");
		
	}

	@Override
	public void findElement() {
		System.out.println("Find element....");
		
	}

	@Override
	public void get(String url) {
		System.out.println("Entered URL is :"+url);
		
	}

	@Override
	public String getTitle() {
		
		return "abc";
	}

	@Override
	public String getUrl() {
		
		return "https://www.abc.com/";
	}

	@Override
	public void click() {
		System.out.println("Clicking on the URL...");
		
	}

	@Override
	public void sendKeys(String value) {
		System.out.println("Entered value is :"+value);
		
	}

	@Override
	public void close() {
		System.out.println("Close the browser...");
		
	}

}
