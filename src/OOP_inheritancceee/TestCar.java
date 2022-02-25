package OOP_inheritancceee;

public class TestCar {

	public static void main(String[] args) {
		
		
		BMW obj=new BMW();
		
		obj.start();  //overridden method
		obj.stop();  // inherited method 
		obj.refuel();//inherited method
		obj.autoParking();//individual method
		obj.engine();// inherited method of grand parent class---Vehicle
		
		Car objCar=new Car();
		
		//objCar.start();//individual method of car class
		objCar.stop(); //individual method of car class
		objCar.refuel();//individual method of car class
		objCar.engine();//inherited method of  parent class---Vehicle
		
		
		//objCar.autoparking(); //cannot access method of child class.
		
		//Top Casting- Child class object is referred by parent class reference variable.
		
		//Can access inherited method.
		//overridden method.
		
		
		Car obj3=new BMW();
		
		obj3.start(); //Overridden method by BMW class.
		obj3.stop();  //inherited method by BMW class from Car class.
		obj3.refuel(); //inherited method by BMW class from Car class.
		obj3.engine(); //inherited method of vehicle class---Super class.
		
		//Top Casting- Child class object is referred by grand parent class reference variable.
		
		Vehicle objgrand=new BMW();
		
		
		objgrand.engine();// Only can access the method which are inherited by child and grand child class.
		
		Audi au=new Audi();
		au.start();
		au.stop();
		au.refuel();
		au.theftSafety();
		au.engine();
		System.out.println(BMW.wheels);
		
		System.out.println(Audi.wheels);
		
		

	}

}
