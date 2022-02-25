package SeleniumSessions;

public class staticVsNonStatic {
	
	String name;
	int price;
	String color;
	static String material="Cement";
	
	public static void start()
	{
		System.out.println("Start of show...");
	}
	
	public void stop()
	{
		System.out.println("stop of show...");
	}
	

	public static void main(String[] args) {
		
		staticVsNonStatic object1=new staticVsNonStatic();
		
		object1.name="Shantiniketan";
		object1.price=1000;
		object1.color="Blue";
		//object1.material="Cement";
		
		System.out.println(object1.name);
		System.out.println(object1.price);
		System.out.println(object1.color);
		//System.out.println(object1.material);
		
		//System.out.println(material);
		
		System.out.println(staticVsNonStatic.material);
		
		//System.out.println(name);
		
		System.out.println("==========Printing data of 2 different Object======================");
		
		staticVsNonStatic object2=new staticVsNonStatic();
		
		object2.name="Sarovar";
		object2.price=500;
		object2.color="Red";
		//object2.material="Cement";
		
		System.out.println(object2.name);
		System.out.println(object2.price);
		System.out.println(object2.color);
		//System.out.println(object2.material);
		
		//System.out.println(material);
		
		System.out.println(staticVsNonStatic.material);
		
		//start();
		
		staticVsNonStatic.start();
				
		//stop();
				
		//staticVsNonStatic.stop();
		
		

	}

}
