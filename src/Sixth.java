import java.util.Scanner;
public class Sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number ");
		int a = sc.nextInt();
		System.out.println("Enter the second number ");
		int b = sc.nextInt();
		int d=0;
		int z=0;
		
		if (a<b) {
			
		for (int i=a;i<=b;i++) {
			
			if (primeNumber(i)) {
				d++;
				
			}
		}
		}
		
		else {
		 
			for (int i=b;i<=a;i++) {
				if (primeNumber(i)) {
					d++;
					
				}
			
				}
		
			}
			
		
		System.out.println("There are "+d+" prime numbers between the two numbers");
		
		

	}
	
	public static boolean primeNumber (int z) {
	boolean result=true;
		
		for (int v =2; v<z;v++) {
			if (z%v==0) {
				result=false;
				break;
			}
		}
		return result;
		
	}
	}

