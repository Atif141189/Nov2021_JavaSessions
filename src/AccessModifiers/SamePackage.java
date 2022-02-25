package AccessModifiers;

public class SamePackage {

	public static void main(String[] args) {
		
		//Same package non sub class..

		SubClass obj2 = new SubClass();

		obj2.empPersonalDetails();// public
		obj2.empPreCompanyDeatils();// default
		obj2.empPreEducation();// protected

	}

}
