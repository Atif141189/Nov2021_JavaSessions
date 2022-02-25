package StringManipulation;

import java.util.ArrayList;

public class CP2402 {
	
	static int arrSize;
	
	 
	
	public static void printF(int index,int arr[],ArrayList<Integer> result)
	{
		if(index>=arr.length)
		{
			System.out.println(result);
			
			return;
		}
		result.add(arr[index]);
		
		printF(index+1,arr,result);
		
		result.remove(new Integer(arr[index]));
		
		printF(index+1,arr,result);
		
		
	}
	
	public static void main(String args[]) 
	{
		int arr[]= {3,1,2};
		
		ArrayList<Integer> result = new ArrayList<Integer>(); 
		
		printF(0,arr,result);
	}

}
