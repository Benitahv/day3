package Assignment3;
import java.util.Scanner;

public class Budget {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int D=sc.nextInt();
		int E=sc.nextInt();
		double t=(A*350.34)+(B*230.90)+(C*190.55)+(D*125.30)+(E*180.90);
		if(t<15000)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

}
