package StringManipulation;

public class TUFCP2 {
	
	public static int sumOfNumbers(int givenNumber)
	{
		if(givenNumber==1)
		{
			return 1;
		}
		
		return givenNumber*sumOfNumbers(givenNumber-1);
	}

	public static void main(String[] args) 
	{
		System.out.println(sumOfNumbers(2));	

	}

}
