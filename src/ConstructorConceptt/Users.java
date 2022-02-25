package ConstructorConceptt;

public class Users {
	
	String name;
	int userid;
	boolean isPrime;
	String city;
	
	public Users(String name,int userid,String city)
	{
		this.name=name;
		this.userid=userid;
		this.isPrime=true;
		this.city=city;
	}
	

	public static void main(String[] args) {
		
		Users u1=new Users("Atif",1234,"Ramnagar");
		
		System.out.println(u1.name + "  "+ u1.userid+"   "+u1.isPrime+"  "+u1.city);
		
		

	}

}
