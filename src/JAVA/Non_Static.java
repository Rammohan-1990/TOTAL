
package JAVA;

public class Non_Static {
	
	static int a=1;
	static int b=2;
	
	public void add() {
		
		int c=a+b;
		System.out.println(c);
		
	}
	
public void sub() {
		
	int d=a-b;
	System.out.println(d);
	
}


public static void main(String[]args) {
	
	Non_Static n1=new Non_Static();
	n1.add();
	n1.sub();
	Non_Static n2=new Non_Static();
	n2.add();
	n2.sub();
	
}
}
