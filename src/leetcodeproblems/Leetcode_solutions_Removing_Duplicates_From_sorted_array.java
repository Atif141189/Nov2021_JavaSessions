package leetcodeproblems;

import java.util.Arrays;

public class Leetcode_solutions_Removing_Duplicates_From_sorted_array {

	
	public static int Removing_Duplicates_From_sorted_array(int num[])
	{
		int count=0;
		
		for(int startfromindex=1;startfromindex<num.length;startfromindex++)
		{
			if(num[startfromindex]!=num[count])
			{
				count++;
				
				num[count]=num[startfromindex];
			}
				
				
				
		}
			
		System.out.println(Arrays.toString(num));
		
		return count+1;
	}
	
	
	public static void main(String[] args) 
	{
		int data[]= {5,6,4,4,10,20,10};
		
		int size=Removing_Duplicates_From_sorted_array(data);
		
		System.out.println(size);

	}

}
