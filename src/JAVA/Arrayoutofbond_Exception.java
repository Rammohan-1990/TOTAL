package JAVA;

public class Arrayoutofbond_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a=new int[2];
		
		a[0]=1;
		a[1]=2;
		
try {
			
	a[2]=4;
		}
		
		catch(ArrayIndexOutOfBoundsException r) {
			
			System.out.println("arrays are excuted successfully");
		}
		
	}

}
