import java.util.Scanner;
public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number and I will tell you its divisors");
		int a = sc.nextInt();
		for (int i=1;i<a;i++) {
			if (a%i==0) {
				System.out.println(i);
			}
			
		}

	}
	}

