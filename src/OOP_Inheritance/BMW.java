package OOP_Inheritance;

public class BMW extends Car {
	
	//Method overriding
	//Method overriding always happen between parent and child class. Not in the same class.
	//when you have same method in parent class and in child class with:
	//same name
	//same number of parameters
	//same type of parameters
	//same return type.
	//private method cannot be overridden
	
	
	
	
	public static void price() //static method cannot be overridden.
	{
		System.out.println("Price of car..");
	}
	
	
	@Override
	public void start()
	{
		System.out.println("BMW start..");
	}
	
	
	public void autoParking()
	{
		System.out.println("BMW auto parking feature..");
	}

}
