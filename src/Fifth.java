import java.util.Scanner;
public class Fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tell me a number and I will say if it is prime or not");
		int a =sc.nextInt();
		int b = 0;
		
		for (int i=2;i<(a/2);i++) {
			if (a%i==0) {
				b=1;
			}
		}
		
		if (b==1) {
			System.out.println("The number isn't prime");
		}
		
		else {
			System.out.println("The number is prime");
		}

	
}
}