package SeleniumSessions;

import java.util.ArrayList;

public class ArrayListAssignmenttt {

	public static void main(String[] args) {
		/* 3. Write a Java program to retrieve an element 
		                 * (at a specified index) from a given array list.
		                 */
		
		ArrayList<Object> data=new ArrayList<Object>();
		
		data.add("RAM");
		data.add(100);
		data.add("Bangalore");
		data.add(10.34);
		data.add('A');
		
		//System.out.println(data.get(3)); //Index 3 data will be printed in output console i.e..10.34
		
		
		//System.out.println(data.size());
		
		for(int i=data.size()-1;i>=0;i--)
		{
			if(data.get(i).equals('A'))
			{
				System.out.println(data.get(i));
				break;
			}
			else
			{
				System.out.println("No data found");
			}
		}
		
		
		

	}

}
