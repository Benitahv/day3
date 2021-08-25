package Assignment3;
import java.util.Scanner;

public class que1 {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner SC = new Scanner(System.in);
		a=SC.nextInt();
		b=SC.nextInt();
		if(a>b)
		{
			System.out.println("a is greater than b");
		}
		else if(a<b)
		{
			System.out.println("a is less than b");
		}
		else
		{
			System.out.println("a is equal to b");
		}
	}

}
