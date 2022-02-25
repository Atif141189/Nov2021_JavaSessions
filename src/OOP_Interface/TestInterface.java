package OOP_Interface;

public class TestInterface {

	public static void main(String[] args) {
		
		FortisHospital fh=new FortisHospital();
		
		fh.medicalFunds(); // By creating object of FortisHospital class we can access the method of grand Interface.
		
		//Top Casting
		
		//referring child class object by parent Interface reference variable.
		
		Medical md=new FortisHospital();
		
		md.medicalFunds();
		
		USMedical usm=new FortisHospital();
		
		usm.medicalFunds();
		
		fh.covidCheckReport();
		
		fh.vaccinationType("CovidShield");
		
		
		

	}

}
