package oops;

import org.testng.annotations.Test;

public class SuperKeywordPractice {
	
	int a;
	public SuperKeywordPractice(int a) {
		
		this.a=a;
		
	}

	@Test
	public int multiplication() {
	
		return a*3;
		
	}
	
	public int divide() {
		
		return a/3;
		
	}

}
