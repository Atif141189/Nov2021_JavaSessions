package BuilderPattern;

public class EcommAPPTest {

	public static void main(String[] args) {
		
		EcommerceAPP obj1=new EcommerceAPP();
		
		obj1.login().login("Atif Hossain","@!2345").search("Lenovo").search("LG", 1110).clickonProduct("Lenovo")
		.addTocart("Lenovo").doPayment("1231111111").doPayment("122221111",634).doPayment("122221111",634).generateOrderID()
		.sendorderviaEmail().logout();
		

	}

}
