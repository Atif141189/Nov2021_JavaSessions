package SeleniumSessions;

public class IncrementalAndDecrementalOperator {

	public static void main(String[] args) {
		// 1.Post Increment
		
		int a=1;
		int b=a++;
		
		System.out.println(a); //2
		
		System.out.println(b); //1
		
		int c=-99;
		int d=c++;
		
		System.out.println(c); //-98
		
		System.out.println(d); //-99
		
		//Pre increment
		
		int h=1;
		int g=++h;
		
		System.out.println(h); //2
		System.out.println(g); //2
		
		int l=-98;
		int i=++l;
		
		System.out.println(l); //-97
		System.out.println(i); //-97
		
		
		int t=10;
		System.out.println(t++);
		System.out.println(t);
		
		//Post decrement
		
		int r=10;
		
		int w=r--;
		
		System.out.println(r); //9
		
		System.out.println(w); //10
		
		//Pre decrement
		
		int u=2;
		int o=--u;
		
        System.out.println(u); //1
		
		System.out.println(o); //1
		
		double ff=12.33;
		System.out.println(++ff);//13.33
		
		int t1=17;
		System.out.println(t1++); //17
		System.out.println(++t1);
		
		
		
		
		
		

	}

}
