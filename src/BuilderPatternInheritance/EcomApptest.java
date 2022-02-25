package BuilderPatternInheritance;

public class EcomApptest {
	
	public static void main(String[] args)
	{
		
		EcomApp obj=new EcomApp();
		
		obj.login().login("RAM", "@12345")
		.search("Laptop").search("Laptop",30000)
		.clickonProduct("Lenovo").addtoCart("Lenovo 123")
		.doPayment("1232122111",625, 5647)
		.generateOrderid().sendordeconfmail();
		
		EcomApp obj2=new EcomApp();
		
		obj2.sendordeconfmail();
		
	
		
		
		
	}

}
