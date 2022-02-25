import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CP2102 {
	
	public static void printName(int i,int it) 
	{
		if(i>it)
		{
			return;
		}
		
		System.out.println("Java Programming");
		
		printName(i+1,it);
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
		
		int it = Integer.parseInt(bfn.readLine());
		
		printName(1,it);

	}

}
