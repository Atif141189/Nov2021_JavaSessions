package RevisionConcept;

import java.util.ArrayList;

public class ArrayListDynamicArrayList {

	public static void main(String[] args) {
		
		ArrayList arlst=new ArrayList();
		
		System.out.println(arlst.size());
		
		arlst.add(100); //index is 0
		arlst.add("Atif");//index is 1
		
		System.out.println(arlst.size());
		
		ArrayList arlst2=new ArrayList();
		
		arlst2.add(100);
		arlst2.add(200);
		arlst2.add(300);
		arlst2.add(400);
		arlst2.add(1000);
		arlst2.add(33300);
		arlst2.add("ram");
		
		//arlst2.add(7, "atif");
		
		//arlst2.add(10,12.33);
//		System.out.println(arlst2.get(7));
		
//		System.out.println(arlst2.get(10));
		
		ArrayList<Integer> marks=new ArrayList<Integer>();
		
		marks.add(100);
		
		System.out.println(marks);
		
		ArrayList<Double> sal=new ArrayList<Double>();
		
		sal.add(12.33);
		
		ArrayList<Object> employdata=new ArrayList<Object>();
		
		employdata.add("Atif"); //String data
		employdata.add(12.33); //Double data
		
		for(int i=0;i<employdata.size();i++)
		{
			System.out.println(employdata.get(i));
		}
		for(Object i:employdata)
		{
			System.out.println(i);
		}
		
		
		
		

	}

}
