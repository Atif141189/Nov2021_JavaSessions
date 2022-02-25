package BuilderPatternInheritance;

public class EcomApp {
	
	public EcomApp login()
	{
		System.out.println("Login to App...");
		
		return this;
	}
	
	public EcomApp login(String un,String pwd)
	{
		System.out.println("Login to App using using username and password :"+un+" "+pwd);
		
		return this;
	}
	
	public EcomApp search(String prodctName)
	{
		System.out.println("Searched product name is :"+prodctName);
		
		return this;
	}
	public EcomApp search(String prodctName,int priceProduct)
	{
		System.out.println("Searching the product name using product name and price of product :"+prodctName+" "+priceProduct);
		
		return this;
	}
	public EcomApp clickonProduct(String prodctName)
	{
		System.out.println("Entered product name is :"+prodctName);
		
		return this;
	}
	public EcomApp addtoCart(String prodctName)
	{
		System.out.println("Product added to cart :"+prodctName);
		
		return this;
	}
	
	public EcomApp doPayment(String CC,int cvv) 
	{
		System.out.println("payment using CC and CVV:"+CC+"  "+cvv);
		
		return this;
	}
	
	public EcomApp doPayment(String cc,int cvv,int otp)
	{
		System.out.println("payment using CC,OTP and CVV:"+cc+"  "+cvv+"  "+otp);
		
		return this;
	}
	public EcomApp generateOrderid() 
	{
		System.out.println("Orderid is generated ");
		
		return this;
		
	}
	
	public void sendordeconfmail()
	{
		System.out.println("Send order conf mail :"+12345);
		
		
	}
	

}
