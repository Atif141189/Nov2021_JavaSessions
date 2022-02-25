package RevisionConcept;

import java.util.Arrays;

public class StaticArrayRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Array:
		//used to store multiple similar type of data/values.
		
		//Limitations of static array:
		
//		1. Size is fixed. To overcome the problem we need to use dynamic array.
//		2. Memory wastage
		//Month in calender,No. of states,No. of country,No. of seats etc.
		//3.Similar type of data. To overcome the problem we use object static array.
		
		//1. int array:
		//lowest index=0
		//highest index=4
		//length=highest index+1=4+1=5
		
		int[] arr=new int[5];
		
		//System.out.println(arr.length);
		
		//Storing the values in array.
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		//arr[5]=60;
		
		System.out.println(arr[0]);
		
		System.out.println(arr[4]);
		
		//System.out.println(arr[-1]); Negative indexing in java not allowed.
		
		//To print all the values in array we need to use indexed based for loop.
		
		System.out.println("=====Printing array values using for loop=====");
		
		for(int i=0;i<arr.length;i++) //using inbuilt length variable to fetch the length/size of the static array.
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("=====Printing array values using for each loop=====");
		
		//for each loop

		for(int i:arr)
		{
			System.out.println(i);
		}
		
		System.out.println(arr);
		
		//default value of array is 0.
		
		System.out.println(Arrays.toString(arr));//Returns a string representation of the contents of the specified array
		
		double[] d=new double[4];
		
		d[0]=12.34;
		d[1]=56.74;
		
		System.out.println(Arrays.toString(d));//Returns a string representation of the contents of the specified array
		
		for(double i:d)
		{
			System.out.println(i);
		}
		
		System.out.println("====Using for loop====");
		
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
		
		//Object Array
		
		Object[] stdent=new Object[3];
		
		stdent[0]="Raju";
		stdent[1]=10;
		stdent[2]=12.33;
		
		for(Object i:stdent)
		{
			System.out.println(i);
		}
		
		

	}

}
