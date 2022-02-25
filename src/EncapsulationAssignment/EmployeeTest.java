package EncapsulationAssignment;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee objEmp=new Employee();
		
		objEmp.setName("Atif");
		objEmp.setAge(32);
		objEmp.setSalary(10.22);
		objEmp.setGender('M');
		objEmp.setActive(true);
		
		//String outputEmployee1=objEmp.getEmployeeInfo();
		
		System.out.println(objEmp.getEmployeeInfo());

	}

}
