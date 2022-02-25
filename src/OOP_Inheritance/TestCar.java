package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW obj1=new BMW();
		
		
		obj1.start();//overridden method
		obj1.stop(); //inherited method
		obj1.refuel();//inherited method
		obj1.autoParking();//individual method of BMW class
		
		BMW.price();
		Car.price();
		
		Car obj2=new Car();
		
		obj2.start();
		obj2.stop();
		obj2.refuel();
		
		
		//Top Casting
		
		Car obj3=new BMW();
		
		obj3.start();
		obj3.stop();
		obj3.refuel();
		//obj3.autoParking(); //cannot access individual method.
	
		
		

	}

}
