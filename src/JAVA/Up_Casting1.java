package JAVA;

public class Up_Casting1 extends Up_Casting {
	
public void ram() {
		
		System.out.println("running ram method");
	}
	
public void charan() {
		
		System.out.println("running charan method");
	}

public static void main(String[]args) {
	
	Up_Casting a=new Up_Casting1();
	
	a.mohan();
	a.babu();
	
	Up_Casting1 b=(Up_Casting1) a;
	
	b.mohan();
	b.babu();
	b.ram();
	b.charan();
	
}

}
