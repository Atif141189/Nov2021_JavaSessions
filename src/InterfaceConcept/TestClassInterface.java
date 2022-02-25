package InterfaceConcept;

public class TestClassInterface {
	
	public static void main(String args[])
	{
		FortisHospital fh=new FortisHospital();
		
		fh.medicalServices();
		fh.covidReport();
		
		//Top casting
		
		UsMedical usobj=new FortisHospital();
		
		usobj.dentalServices();
		usobj.pediaServices();
		usobj.emergencyServices();
		
		usobj.medicalServices();
		UkMedical ukobj=new FortisHospital();
		
		ukobj.emergencyServices();
		ukobj.entServices();
		ukobj.radiologyServices();
		
		indianMedical indobj=new FortisHospital();
		
		indobj.CardioServices();
		indobj.emergencyServices();
		indobj.OncologyServices();
		indobj.physioServices();
		
		//down casting
		
		//FortisHospital fh2=new UkMedical();
		
		
		
		
	}

}
