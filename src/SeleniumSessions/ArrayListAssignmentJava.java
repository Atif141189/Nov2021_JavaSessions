package SeleniumSessions;

import java.util.ArrayList;

public class ArrayListAssignmentJava {
	
	public ArrayList<String> listingFlowerName()
	{
		ArrayList<String> object=new ArrayList<String>();
		
		object.add("RED");
		object.add("Green");
		object.add("Brown");
		object.add("White");
		
		return object;
		
		
	}

	public static void main(String[] args) {
		
		
		/*1. Write a Java program to create a new array list,
		  *  add some colors (string) and print out the collection*/
		
		ArrayListAssignmentJava obj=new ArrayListAssignmentJava();
		
		//System.out.println(obj.listingFlowerName());
		
		ArrayList<String> flowerDeatils=obj.listingFlowerName();
		
		for(String e : flowerDeatils)
		{
			System.out.println(e);
		}
		
		
		//ArrayList<String> object=new ArrayList<String>();
		
//		object.add("RED");
//		object.add("Green");
//		object.add("Brown");
//		object.add("White");	
		
		//System.out.println(object);
		
//		for(int i=0;i<object.size();i++)
//		{
//			System.out.println(object.get(i));
//		}
		
		
		
		

	}

}
