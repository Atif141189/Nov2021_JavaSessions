package ConstructorAssignment;

import java.util.Arrays;

public class TestConstructorAssignment {

	public static void main(String[] args) {
		
		String[] strarray=new String[5];
		
		strarray[0]="RAM";
		strarray[1]="Atif";
		strarray[2]="Naveen";
		strarray[3]="Ashok";
		strarray[4]="Arul";
		
			
		
		Browser obj=new Browser("Chrome",14.53,strarray);
		
		System.out.println(obj.getName());
		
		System.out.println(obj.getVersion());
		
		System.out.println(Arrays.toString(obj.getPlugin()));
		
		obj.setName("Atif");
		
		System.out.println(obj.getName());
		
		obj.setVersion(14.54);
		
		System.out.println(obj.getVersion());
		
		strarray[0]="San";
		
		obj.setPlugin(strarray);
		
		System.out.println(Arrays.toString(obj.getPlugin()));


	}

}
