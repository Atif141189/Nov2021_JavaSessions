package StringManipulation;

import java.util.Arrays;

public class PracticeStringManipulation {

	public static void main(String[] args) {
		
		String inputString = "Atif Hossainaaaaaaa";
		
		int count=0;
		
		int noOfOccurancesChar=0;
		
		while(count<inputString.length())
		{
			if('a'==inputString.charAt(count))
			{
				noOfOccurancesChar=noOfOccurancesChar+1;
				
				
			}
			
			count=count+1;
		
		}
		
		System.out.println(noOfOccurancesChar);
		
		
//		String y="100A";
//		
//		System.out.println(y.replaceAll("A",""));
//		
//		String[] s1=y.split("A");
//		
//		System.out.println(Arrays.toString(s1));
		
		String s2="12345Hello Java 123 programmer";
		
		String numericExtract1=s2.substring(11,14);
		
		System.out.println(numericExtract1);
		
		String numericExtract2=s2.substring(0,5);
		
		
		System.out.println(numericExtract2);
		

	}

}
