package InterfaceConcept;

public class FortisHospital extends UNHG implements UsMedical,UkMedical,indianMedical{

	@Override
	public void dentalServices() {
		System.out.println("US medical....dentalServices");
		
	}

	@Override
	public void pediaServices() {
		System.out.println("US medical....pediaServices");
		
	}

	@Override
	public void radiologyServices() {
		System.out.println("UK MEDICAL ....radiologyServices");
		
	}

	@Override
	public void entServices() {
		System.out.println("UK MEDICAL ....entServices");
		
	}

	@Override
	public void physioServices() {
		System.out.println("indianMedicalL ....entServices");
		
	}

	@Override
	public void CardioServices() {
		System.out.println("indianMedicalL ....CardioServices");
		
	}

	@Override
	public void OncologyServices() {
		System.out.println("indianMedicalL ....OncologyServices");
		
	}

	@Override
	public void emergencyServices() {
		System.out.println("FH...emergency services");
	
		
	}
	
	
	//Individual method
	
	public void medicalTraining()
	{
		System.out.println("FH...medicalTraining");
	}
	public void medicalInsurance()
	{
		System.out.println("FH...medicalInsurance");
	}
	
	//Medical Interface

	@Override
	public void medicalServices() {
		System.out.println("FH-----medicalServices");
		
	}

	@Override
	public void covidTest() {
		// TODO Auto-generated method stub
		
	}
	

}
