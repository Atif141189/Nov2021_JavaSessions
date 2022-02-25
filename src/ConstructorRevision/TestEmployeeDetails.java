package ConstructorRevision;

public class TestEmployeeDetails {

	public static void main(String[] args) {
		
		//EmployeeDetails objEmp=new EmployeeDetails();
		
		EmployeeDetails objEmp2=new EmployeeDetails("Atif",32,"Kolkata");
		
		System.out.println(objEmp2.name);
		System.out.println(objEmp2.age);
		System.out.println(objEmp2.city);
		
		objEmp2.getResults();
		
		

	}

}
