package InterfaceCodePractice;

public interface WebDriver extends SearchContent
{
	@Override
	public void findElements();
	
    @Override
	public void findElement();
    
    public void get(String url);
    
    public String getTitle();
    
    public String getUrl();
    
    public void click();
    
    public void sendKeys(String value);
    
    public void close();
    
      

}
