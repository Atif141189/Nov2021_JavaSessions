package leetcodeproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode_solutions_Twosum_hashmap_approach_refined {
	
	
	public static int[]  twosum(int num[],int target)
	{
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int i=0;i<num.length;i++)
		{
			int findme=target-num[i];
			
			if(map.containsKey(findme))
			{
				return new int[] {map.get(findme),i};
			}
			
			map.put(num[i],i);
		}
		
		return null;
		
	}

	public static void main(String[] args) 
	{
		int list[]=twosum(new int[]{5,6,8},14);
		
		System.out.println(Arrays.toString(list));

	}

}
