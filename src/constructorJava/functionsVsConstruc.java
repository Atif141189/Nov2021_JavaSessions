package constructorJava;

public class functionsVsConstruc {
	
	String name;
	int age;
	
	public void getempdetails(String name,int age) 
	{
		//System.out.println("method in class");
		
		this.name=name; //this keyword is pointing to current class object and we can access current class object.
		
		this.age=age;
		
	}

	public static void main(String[] args) {
		
		functionsVsConstruc obj=new functionsVsConstruc();
		
		obj.getempdetails("Atif",100);
		System.out.println(obj.name);	
		System.out.println(obj.age);
		
		functionsVsConstruc obj2=new functionsVsConstruc();

	}

}
