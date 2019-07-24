package JAVA;

public class Simple {
	
	public static void Method_Loading() {
		
		System.out.println("running default method");
	}
	
	public static void Method_Loading(int a,int b) {
		
		System.out.println("running int argument method");
		System.out.println(a);
	}
	
	public static void Method_Loadingt(String name) {
		
		System.out.println("running string argument method");
		System.out.println(name);
	}
	
public static void Method_Loadingt(double b) {
		
		System.out.println("running string argument method");
		System.out.println(b);
	}

public static void main(String[]args) {
	
	Simple.Method_Loading();
	Simple.Method_Loading(30,20);
	Simple.Method_Loadingt("Ram");
	Simple.Method_Loadingt(567);
	
}

}
