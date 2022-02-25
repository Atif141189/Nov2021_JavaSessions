package encapsulationJava;

public class TestEncapsulation {

	public static void main(String[] args) {
		
		//Advantage of Encapsulation
		//1. security to class variable.
		//2. Hide the implementation.
		
		
		EncapsulationConcept obj1=new EncapsulationConcept();
		
		obj1.setName("Atif Hossain");
		obj1.setAge(32);
		obj1.setSalary(12.33);
		
		System.out.println(obj1.getName());
		System.out.println(obj1.getAge());
		System.out.println(obj1.getSalary());
		
		System.out.println(obj1.getallDetails());

	}
}
