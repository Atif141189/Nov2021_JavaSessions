package SeleniumSessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		
		int[] a=new int[4];
		
		a[0]=90;
		a[1]=23;
		a[2]=34;
		a[3]=12;
		//a[4]=98;
//		System.out.println(a[3]);
		
		
		//int[]a=new int[];
		
//		for(int i=0;i<4;i++)
//		{
//			System.out.println(a[i]);
//			
//		}
		System.out.println(a.length);
		
		System.out.println("===============");
		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//			
//		}
		
//		int r=10.57;
		
		
	int[] b=new int[5];
	a[0]=9;
	a[1]=10;
	a[2]=12;
	a[3]=13;
	//a[4]=15;
	
	System.out.println(Arrays.toString(a));
		
		
	double[] f=new double[2];
	
	f[0]=12.45;
	f[1]=13.44;
	
	for(int i=0;i<f.length;i++)
	{
		System.out.println(f[i]);
		
	}
	
	System.out.println("============");
	
	Object[] st=new Object[5];
	
	st[0]="Atif Hossain";
	st[1]='a';
	st[2]=34.44;
	st[3]=34;
	st[4]=true;
	
//	for(int i=0;i<st.length;i++)
//	{
//		System.out.println(st[i]);
//	}

	
	for(Object e:st)
	{
		System.out.println(e);
		
	}
	
	
		
		
		
		
		

	}

}
