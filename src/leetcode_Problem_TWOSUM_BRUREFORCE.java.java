import java.util.Arrays;

public class leetcode 
{
	
	//Brute force approach.
	//Time complexity o(n2)
	public static int[] twosum(int num[],int target)
	{
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]+num[j]==target)
				{
					return new int[] {i,j};
				}
			}
		}
		
		return null;
		
	}

	public static void main(String[] args) 
	{
		int list[]=twosum(new int[] {1,5,7,4,567},568);
		
		System.out.println(Arrays.toString(list));
	
		
		

	}

}
