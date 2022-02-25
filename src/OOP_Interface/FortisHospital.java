package OOP_Interface;

public class FortisHospital implements USMedical,IndiaMedical,UKMedical,Medical{

	//Overriding grand interface method.
	//Medical
	@Override
	public void medicalFunds() {
		System.out.println("FH....medical funds");
		
	}

	@Override
	public void radiologyServices() 
	{
		System.out.println("FH---radiologyServices");
		
	}

	@Override
	public void entServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dentalServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pediaServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void physioServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cardioServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void oncologyServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emergencyServices() {
		// TODO Auto-generated method stub
		
	}
	
	//WHO
	@Override
	public void covidCheckReport() {
		System.out.println("Report check-FH");
		
	}
	
	//WHO
	@Override
	public void vaccinationType(String name) {
		System.out.println("Fortis Hospital is providing vaccination :"+name);
		
	}

}
