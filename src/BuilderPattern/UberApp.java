package BuilderPattern;

public class UberApp {
	
	public UberApp UberAppLogin()
	{
		System.out.println("Loggin to uber App to book cab...");
		
		return this;
	}
	public UberApp UberAppLogin(String mobilenumber)
	{
		System.out.println("Logging to uber app using Mobile number :"+mobilenumber);
		
		return this;
	}
	
	public UberApp enterOtp(int otp)
	{
		System.out.println("Entered OTP received in mobile number is :"+otp);
		
		return this;
		
	}
	
	public UberApp otpValidation(int otp)
	{
		System.out.println("OTP validation is successful with OTP number :"+otp);
		
		return this;
	}
	
	public UberApp selectStartLocation(String startname)
	{
		System.out.println("Start location name of the trip is :"+startname);
		
		return this;
	}
	
	public UberApp selectEndLocation(String endname)
	{
		System.out.println("Start location name of the trip is :"+endname);
		
		return this;
	}
	
	public UberApp chooseTypeoftrip(String tripname)
	{
		System.out.println("Type of Trip choosen is :"+tripname);
		
		return this;
	
	}
	
	public UberApp displayfare(int fare)
	{
		System.out.println("Calculated total fare for the selected trip is :"+fare);
		
		return this;
	}
	
	public UberApp choosePayment(int cashamount) 
	{
		System.out.println("Pay with cash to drive once trip completed with amount:"+cashamount);
		
		return this;
	}
	
	public UberApp choosePayment(String cc,int cvv) 
	{
		System.out.println("Pay with the credit card and cvv to driver once trip completed with amount:"+cc+cvv);
		
		return this;
	}
	
	public UberApp choosePayment(String cc,int cvv,int otp) 
	{
		System.out.println("Pay with the credit card,cvv and otp to drive once trip completed with amount:"+" "+cc+" "+cvv+" "+otp);
		
		return this;
	}
	
	public UberApp searchNearestDriver(String name)
	{
		System.out.println("Booking is successfull and driver name is :"+name);
		
		return this;

	}
	
	public UberApp displaytripCardetails(String carName,String carNumber)
	{
		System.out.println("Car name and number for the booked trip is :"+carName+"  "+carNumber);
		
		return this;
	}
	
	public UberApp sharePintoStartTrip(int pin)
	{
		System.out.println("Enter the pin to start trip :"+pin);
		
		return this;
		
	
	}
	
	public UberApp intemediateTrip()
	{
		System.out.println("Enjoy the trip with UBER..");
		
		return this;
	}
	
	public void endTrip()
	{
		System.out.println("drop the customer in specified location to end the trip");
	}
	

}
