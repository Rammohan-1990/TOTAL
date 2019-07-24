package JAVA;

public class Call_Super1 extends Call_Super {
	
	Call_Super1(){
		
		super();
		System.out.println("running zero argument constructer");
	}
	
	public static void main(String[]args) {
		
		Call_Super1 c1=new Call_Super1();
		
	}

}
