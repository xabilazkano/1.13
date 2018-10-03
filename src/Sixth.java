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
		int c=0;
		
		if (a<b) {
			 c=b-a+1;
		for (int i=a;i<=b;i++) {
			
			for (int e=2;e<(i/2);e++) {
				if (i%e==0) {
					d=1;					
				}
			}
			if (d==1) {
				c--;
				d=0;
				System.out.println(i);
			}
		}
		}
		
		else {
		 c=a-b+1;
			for (int i=b;i<=a;i++) {
				
				for (int e=2;e<(i/2);e++) {
					if (i%e==0) {
						d=1;					
					}
				}
				if (d==1) {
					c--;
					d=0;
				}
			}
			
		}
		System.out.println("There are "+c+" prime numbers between the two numbers");
		
		

	}
	}

