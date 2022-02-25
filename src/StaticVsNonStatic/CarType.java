package StaticVsNonStatic;

public class CarType {
	
	String name;
	int price;
	String color;
	static int wheels=4;
	
	public static  void start()
	{
		System.out.println("Static method..Car Start");
		
	}
	
	public void stop()
	{
		System.out.println("Non Static method..Car stop");
		
	}

	public static void main(String[] args) {
		
		
		
		CarType c1=new CarType();
		
		c1.name="BMW";
		c1.price=70;
		c1.color="Black";
		//c1.wheels=4;
		
		CarType c2 = new CarType();

		c2.name = "Audi";
		c2.price = 65;
		c2.color = "Blue";
		//c2.wheels = 4;
		
		CarType c3 = new CarType();

		c3.name = "Honda";
		c3.price = 45;
		c3.color = "Red";
		//c3.wheels = 4;
		
		System.out.println(CarType.wheels);
		
		CarType.start();
		
		
		

	}

}
