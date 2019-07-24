package JAVA;

public class B extends A {
	
	public void ram() {
		
		System.out.println("running ram method");
	}
	
	public static void main(String[]args) {
		
		B b=new B();
		b.ram();
		
	}

}
