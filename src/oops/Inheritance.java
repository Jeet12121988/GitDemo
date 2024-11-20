package oops;

import org.testng.annotations.Test;

public class Inheritance  {
	

     

	@Test
	public void inheritance() {
		
		BaseClass b1=new BaseClass(3);
		//Factorial f=new Factorial(6);
		
		//SuperKeywordPractice s1= new SuperKeywordPractice(3);
		
		//int a=3;
		
		System.out.println(b1.p1());
		System.out.println(b1.p2());
		System.out.println(b1.multiplication());;
		System.out.println(b1.divide());;
		
		
		b1.fact(5);
		
	}

}
