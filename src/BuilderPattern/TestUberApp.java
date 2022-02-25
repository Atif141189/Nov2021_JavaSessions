package BuilderPattern;

public class TestUberApp {

	public static void main(String[] args) {
		
		
		UberApp obj1=new UberApp();
		
		obj1.UberAppLogin().UberAppLogin("7358211748")
		.enterOtp(7865).otpValidation(7865).selectStartLocation("Kolkata")
		.selectEndLocation("Digha").chooseTypeoftrip("UBERGO")
		.displayfare(4500).choosePayment("CREDI CARD",635,6980)
		.searchNearestDriver("RAM").displaytripCardetails("Dzire","5673")
		.sharePintoStartTrip(3211).intemediateTrip().endTrip();
		
		
		

	}

}
