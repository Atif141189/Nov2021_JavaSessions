package CompetitiveCoding;

public class ReverseString {
	

	public static void main(String[] args) {
		//WAP:Reverse words in a given string
		
		String inpString="My name is Atif Hossain";
		
		String splittedStringArray[]=inpString.split(" ");
		
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=splittedStringArray.length-1;i>=0;i--)
		{
			if (i == 0) 
			{ 
				sb.append(splittedStringArray[i]);
			} 
			else 
			{
				sb.append(splittedStringArray[i] + " ");
			}
		}
		
	
		System.out.println(sb.toString());
		
		
		
	}

}
