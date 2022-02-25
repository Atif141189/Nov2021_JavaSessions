package BuilderPattern;

public class EcommerceAPP {
	
	
	public EcommerceAPP login()
	{
		System.out.println("Login to APP");
		
		return this; //returning current class object. new EcommerceAPP()
	}
	
	public EcommerceAPP login(String username,String passwrd)
	{
		System.out.println("Login to APP using username and password"+username+passwrd);
		
		return this;
	}
	
	public EcommerceAPP search(String productName)
	{
		System.out.println("Seraching the product using product name :"+productName);
		
		return this;
	}
	
	public EcommerceAPP search(String productName,int price)
	{
		System.out.println("Seraching the product using product name and price :"+productName+price);
		
		return this;
	}
	
	public EcommerceAPP clickonProduct(String productName)
	{
		System.out.println("Clicking on the product name :"+productName);
		return this;
	}
	
	public EcommerceAPP addTocart(String productName) 
	{
		System.out.println("adding on the product to cart :"+productName);
		return this;
	}
	
	public EcommerceAPP doPayment(String cc,int cvv)
	{
		System.out.println("Do payment using credit card and cvv:"+cc+cvv);
		
		return this;
	}
	
	public EcommerceAPP doPayment(String cc,int cvv,int otp)
	{
		System.out.println("Do payment using credit card,cvv and otp :"+cc+cvv+otp);
		
		return this;
	}
	
	public EcommerceAPP doPayment(String cc)
	{
		System.out.println("Do payment using credit card :"+cc);
		return this;
	}
	
	public EcommerceAPP generateOrderID()
	{
		System.out.println("order id is :"+12345);
		return this;
	}
	
	public EcommerceAPP sendorderviaEmail()
	{
		System.out.println("Send order via Email :"+12345);
		
		return this;
	}
	
	public void logout()
	{
		System.out.println("Logout is susccessful");
	}

}
