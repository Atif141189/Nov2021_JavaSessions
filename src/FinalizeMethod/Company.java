package FinalizeMethod;

public class Company {
	
	@Override
	public void finalize()
	{
		System.out.println("inside finalize method...Company");
	}

}
