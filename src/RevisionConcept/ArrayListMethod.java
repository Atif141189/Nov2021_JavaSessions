package RevisionConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethod {

	public static void main(String[] args) {
		
		ArrayList<Integer> arlst2 = new ArrayList<Integer>();

		arlst2.add(100);
		arlst2.add(200);
		arlst2.add(1111300);
		arlst2.add(400);
		arlst2.add(1000);
		arlst2.add(33300);
		
		Collections.sort(arlst2);
		
		System.out.println(arlst2);
		
		Collections.sort(arlst2,Collections.reverseOrder());
		
		System.out.println(arlst2);
		
		//Printing a list in reverse order
		
		for(int i=arlst2.size()-1;i>=0;i--)
		{
			System.out.println(arlst2.get(i));
		}
		
		List<Integer> dataInt=Arrays.asList(10,20,30);
		
		System.out.println(dataInt);
		
		List<String> dataString=Arrays.asList("Atif","Hossain","TCS");
		
		System.out.println(dataString.get(2));
		
		List<Object> ob=Arrays.asList("Atif",12.33);
		
		System.out.println(ob);
		
		int arr[]= {1,2,3,4};
		
		System.out.println(arr[0]);
		System.out.println(arr[4]);

	}

}
