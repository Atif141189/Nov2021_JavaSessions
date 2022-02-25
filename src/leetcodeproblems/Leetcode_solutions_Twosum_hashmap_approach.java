package leetcodeproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode_solutions_Twosum_hashmap_approach {
	
	public static int[] twosum(int num[],int target)
	{
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int i=0;i<num.length;i++)
		{
			map.put(num[i],i);
			
			
		}
		for(int i=0;i<num.length;i++)
		{
			if(map.containsKey(target-num[i]) && map.get(target-num[i])!=i)
			{
				return new int[] {i,map.get(target-num[i])};
			}
		}
		
		return null;
		
	}

	public static void main(String[] args) 
	{
		int list[]=twosum(new int[] {1,5,7},5);
		
		System.out.println(Arrays.toString(list));

	}

}
