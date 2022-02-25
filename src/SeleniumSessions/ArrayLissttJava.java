package SeleniumSessions;

import java.util.ArrayList;

public class ArrayLissttJava {

	public static void main(String[] args) {
		// ArrayList is inbuilt class in java. 
		// To collect the data or store the data dynamically.
		// Methods are available to store the data,display the data,delete the data etc.
		// dynamic array. It can grow automatically in term of size as per requirement.
		// It stores different type of data.
		// To create ArrayList in Java we need to create object of ArrayList.
		// Already in built class is available then we never create same class explicitly.
		
		ArrayList ar=new ArrayList();
		
		//System.out.println(ar.size());
		
        ar.add(100); //index-->0
		
		//System.out.println(ar.size());
//		
        ar.add(200);  //index-->1
//		
        ar.add("Atif Hossain"); //index-->2
//		
        ar.add(300); //index-->3
		
		//System.out.println(ar.size());
        
        //System.out.println(ar.get(3));
        
        ar.add(2,4000);
        
        //System.out.println(ar.get(2));
        
        //System.out.println(ar);
		
		//integer type of array list.
        
        ArrayList<Integer> marks=new ArrayList<Integer>();
        
        marks.add(87);
        
        //marks.add("RAAA");
        
		ArrayList<String> name=new ArrayList<String>();
		
		name.add("Atif");
		
		//name.add(89);
		
		ArrayList<Object> empdet=new ArrayList<Object>();
		
		empdet.add(87);
		
		System.out.println(empdet);
		
        empdet.add("Rahul Dravid");
		
		System.out.println(empdet);
		
		System.out.println(empdet.size());
		
//		for(Object w:empdet)
//		{
//			System.out.println(w);
//		}
		
		for(int i=0;i<empdet.size();i++)
		{
			System.out.println(empdet.get(i));
		}
		
		
		ArrayList<String> nameemployee=new ArrayList<String>();
		
		nameemployee.add("Rahul");
		nameemployee.add("Atif");
		nameemployee.add("Hossain");
		nameemployee.add("DDLJ");
		
//		for(int i=0;i<nameemployee.size();i++)
//		{
//			System.out.println(nameemployee.get(i));
//		}
		
		
		for(String h:nameemployee)
		{
			System.out.println(h);
		}
	
		
		
		
		
		
		

	}

}
