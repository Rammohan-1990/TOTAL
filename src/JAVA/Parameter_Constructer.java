package JAVA;

public class Parameter_Constructer {
	
	Parameter_Constructer(int a){
		
		System.out.println(a);
		
	}
	
	Parameter_Constructer(String name){
		
		System.out.println(name);
		
	}
	
	public static void main(String[]args) {
		
		Parameter_Constructer p=new Parameter_Constructer(30);
		Parameter_Constructer p1=new Parameter_Constructer("Ram");
		
	}
	
}
