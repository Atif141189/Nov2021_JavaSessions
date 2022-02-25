import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionAssignment {
	
	public static void printNumber(int i,int enteredNumber)
	{
		if(i>enteredNumber)
		{
			return;
		}
		
		printNumber(i+1,enteredNumber); //Function call wiil go
		
		System.out.println(i);
	}

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
//        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
//		
//		int it = Integer.parseInt(bfn.readLine());
		
		printNumber(1,5);

	}

}
