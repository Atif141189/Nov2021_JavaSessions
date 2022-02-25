package DifferentPackageAccessModifiers;

import AccessModifiers.Employee;

public class EmployeeTest extends Employee{

	public static void main(String[] args) {
		
		
		//Different Package sub class.
		
		EmployeeTest obj4=new EmployeeTest();
		
		obj4.empPersonalDetails();//public
		obj4.empPreEducation();//protected
		
		
		
		

	}

}
