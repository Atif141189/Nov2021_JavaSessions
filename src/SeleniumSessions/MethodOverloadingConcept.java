package SeleniumSessions;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodOverloadingConcept {
	
	//WAP:
			//Requirement: Based on the company name functions should provide all the available details.
			//functions accept the company name (String)
			//Company name (String)
			//Employee count (integer)
			//Location (String)
			//CEO name (String)
			//data structure we need to use either static array or array list.
			//Type will be object static array or object Array list.
			
			public Object[] getCompanyDetails(String compName)
			{
				System.out.println("Getting the company details :"+compName);
				
				System.out.println("=======================");
				
				Object[] info=new Object[4];
				
				if(compName.equals("IBM")) 
				{
					info[0]="IBM"; //Company name
					info[1]="500"; //Employee count
					info[2]="Bangalore";//Location of company		
					info[3]="Tomy";//CEO name
					
					
				}
				
				else if(compName.equals("TCS")) 
				{
					info[0]="TCS"; //Company name
					info[1]="5000"; //Employee count
					info[2]="Chennai";//Location of company		
					info[3]="Lody";//CEO name
					
					
				}
				else if(compName.equals("Google")) 
				{
					info[0]="Google"; //Company name
					info[1]="200"; //Employee count
					info[2]="Mysore";//Location of company		
					info[3]="Lakry";//CEO name
					
					
				}
				else
				{
					System.out.println("Please enter the correct comapny name...");
				}
				
				return info;
				
				
				
			}
			
			//Using ArrayList
			//method return:List of product Array<String>
			
			public ArrayList<String> getProductList(String compName)
			{
				
				System.out.println("Getting the product details :"+compName);
				
				ArrayList<String> prodList=new ArrayList<String>();
				
				switch (compName.toLowerCase()) 
				{
				case "ibm":
					
					prodList.add("OS");
					prodList.add("MIC");
					prodList.add("YOK");
					
					break;
					
				case "tcs":

					prodList.add("hard disk");
					prodList.add("MIC");
					prodList.add("Luka");

					break;
					
					
				default:
					System.out.println("company not found...");
					
					break;
				}
				
				
				return prodList;
				
				
				
				
			}
	
	public static void main(String[] args) {
		
		MethodOverloadingConcept object=new MethodOverloadingConcept();
		
		
		ArrayList<String> productResult=object.getProductList("TCS");
		
		//System.out.println(productResult);
		
		//Using for each loop
		
		for (String e:productResult)
		{
			System.out.println(e);
		}
		
		//using for loop
		
		
//		for(int i=0;i<productResult.size();i++)
//		{
//			
//			System.out.println(productResult.get(i));
//			
//			
//			
//		}
//		
		System.out.println("=======================");
		
		Object[] result=object.getCompanyDetails("sdgfsdg");
		
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
		
		
		
		
		
			
		
	}

}
