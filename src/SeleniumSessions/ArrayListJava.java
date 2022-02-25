package SeleniumSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> empdet=new ArrayList<String>();
		
		empdet.add("Atif");
		empdet.add("Naveen");
		empdet.add("Arul");
		empdet.add("Noria");
		
		//System.out.println(empdet);
		
		//sort--> by default in ascending order.
		
		//there is a collections class in which inbuilt method sort() is present to sort the data.
		
		Collections.sort(empdet);
		
		System.out.println(empdet);
		
		//descending order
		
		Collections.sort(empdet,Collections.reverseOrder());
		
		System.out.println(empdet);
		
        ArrayList<String> empdetails=new ArrayList<String>();
		
        empdetails.add("Atif");
        empdetails.add("Naveen");
        empdetails.add("Arul");
        empdetails.add("Noria");
        
        for(int i=0;i<empdetails.size();i++) 
        {
        	System.out.println(empdetails.get(i));
        }
        
        System.out.println("============");
		
		//Printing the above array list in reverse order.
        
        //way 1:
        
        for(int i=empdetails.size()-1;i>=0;i--)
        {
        	System.out.println(empdetails.get(i));
        }
        
        ArrayList<String> empdaddetails=new ArrayList<String>();
		
        empdaddetails.add("oscdf");
        empdaddetails.add("rtgf");
        empdaddetails.add("asfsf");
        empdaddetails.add("safcsa");
        
        
        empdetails.addAll(0, empdaddetails);
        
        System.out.println(empdetails);
        
        List<Integer> data=Arrays.asList(10,20,30);
      
        System.out.println(data);
        
        List<Object> dataObject=Arrays.asList("atif",30,40,"Rahul");
        
        System.out.println(dataObject.size());
        
        

		
		
		
	}

}
