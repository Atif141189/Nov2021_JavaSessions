package StringManipulation;

import java.util.ArrayList;
import java.util.Arrays;

public class TestCode {

	public static void main(String[] args) {


//		for(;true;)
//		{
//			System.out.println("Print");
//		}
		
//		String browser="Chrome";
//		
//		if(browser.equals("Chrome"))
//		{
//			System.out.println("Launch chrome..");
//		}
//		if(browser.equals("ff"))
//		{
//			System.out.println("Launch chrome..");
//		}
//		if(browser.equals("Chrome"))
//		{
//			System.out.println("Launch chrome..2nd time check");
//		}
//		
//		
//		short b=07777;
//		System.out.println(b);
		
		for(char i='A';i<='Z';i++)
		{
			System.out.println(i+" : "+(int)i);
		}
		System.out.println("============================");
		
		for(char i='0';i<='9';i++)
		{
			System.out.println(i+" : "+(int)i);
		}
		
		System.out.println("============================");
		
		//WAP: To print 1,3,5,7,9
	
		for(int i=1;i<10;i=i+2)
		{
			System.out.println(i);
				
		}
		
		
		ArrayList<Integer> even=new ArrayList<Integer>();
		ArrayList<Integer> odd=new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				even.add(i);
			
			}
			else
			{
				odd.add(i);
			}
			
		}
		
		System.out.println("Even elements are :"+even);
		
		System.out.println("============================");
		
		System.out.println("Odd elements are :"+odd);	
		
		int a[]=new int[5];
		System.out.println(a.length);
		
		
		ArrayList<String> st=new ArrayList<String>();
		
		st.add("Ram");
		st.add("Sam");
		st.add("Atif");
		st.add("Dany");
		
		st.add(1,"1000");
		
		System.out.println(st);

	}

}
