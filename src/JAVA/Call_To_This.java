package JAVA;

public class Call_To_This {
	
	Call_To_This(){
		
		System.out.println("running zero argument construcer");
	}
	
	Call_To_This(int a){
		
		this();
		System.out.println("running int argument consrucer");
		System.out.println(a);
	}
	
	Call_To_This(String name){
		
		this();
		System.out.println("running string argument constructer");
		System.out.println(name);
	}
	
	public static void main(String[]args) {
		
		Call_To_This c=new Call_To_This(3);
		Call_To_This c1=new Call_To_This("Ram");
		
	}

}
