package oops;

import org.testng.annotations.Test;

public class BaseClass extends SuperKeywordPractice{
	int a,f=1;
	
	public BaseClass(int a) {
		// TODO Auto-generated constructor stub
		super(a);
		this.a=a;
	}	

	public int p1() {
		a=a+1;
		return a;
	}
	
    public int p2() {
		
    	a=a-1;
		return a ;
	}

public void   fact(int a) {
		
		
		
		for (int i=1;i<=a;i++) {
			
		   f=f*i;
			
		}
		//return f;
		System.out.println("Your factorial value is -"+f);
		
	}
	

}
