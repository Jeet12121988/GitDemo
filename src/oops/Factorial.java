package oops;

public class Factorial {
	int a;
	int f=1;
	public Factorial(int a) {
		
	
		this.a=a;
	}

	

	public void   fact() {
		
		
		
		for (int i=1;i<=a;i++) {
			
		   f=f*i;
			
		}
		//return f;
		System.out.println("Your factorial value is -"+f);
		
	}

}
