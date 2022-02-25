
public class TUFCP {
	
	public static void sumofGivenNumber(int givenNumber,int sum)
	{
		if(givenNumber<0)
		{
			System.out.println(sum);
			return;
		}
		
		sumofGivenNumber(givenNumber-1,sum+givenNumber);
	}

	public static void main(String[] args) 
	{
		sumofGivenNumber(3,0);

	}

}
