package AccessModifiers;

public class SubClass extends Employee{

	public static void main(String[] args) {
		
		//same package sub class.
		
		SubClass obj2 =new SubClass();
		
		obj2.empPersonalDetails();//public
		obj2.empPreCompanyDeatils();//default
		obj2.empPreEducation();//protected
		

	}

}
