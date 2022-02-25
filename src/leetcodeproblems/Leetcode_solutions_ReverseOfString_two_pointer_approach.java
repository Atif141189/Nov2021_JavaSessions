package leetcodeproblems;

public class Leetcode_solutions_ReverseOfString_two_pointer_approach {
	
	
	public static char[] reverseString(char s[])
	{
		int start=0;
		int end=s.length-1;
		
		//0<3
		while(start<end)
		{
			char ch=s[start];
			s[start]=s[end]; //start value is 'o' after swaping. ---> 1st iteration
			s[end]=ch; //end value is h after swaoing----->1st iteration
			start++;//start=1
			end--;//2
		}
		
		return s;
	}
	
	public static void main(String args[])
	{
		char[] data= {'h','e','l','o'};
		System.out.println(reverseString(data));
	}

}
