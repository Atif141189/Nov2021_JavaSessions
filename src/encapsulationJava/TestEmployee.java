package encapsulationJava;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee obj1=new Employee("Atif Hossain",32,14.55);
		
		System.out.println(obj1.getName());
		System.out.println(obj1.getAge());
		System.out.println(obj1.getSalary());
		
		obj1.setName("RAMO");
		obj1.setAge(34);
		obj1.setSalary(12.78);
		
		System.out.println(obj1.getName());
		System.out.println(obj1.getAge());
		System.out.println(obj1.getSalary());
		
		
	}

}
