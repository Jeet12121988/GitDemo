package oops;

import org.testng.annotations.Test;

public class BaseClass extends SuperKeywordPractice{
	int a;
	
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
	

}
