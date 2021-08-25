package Assignemten3;
import java .util.Scanner;

public class Microven {

	public static void main(String[] args) {
		int n;
		float f;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		f=sc.nextFloat();
		switch(n)
		{
		case 1:
			System.out.println("The recommended heating time %.1f"+f);
		case 2:
			double t=1.5*f;
			System.out.println("The reccommended  heating time is"+t);
			break;
		case 3:
			 t=2*f;
			System.out.println("The recommended heating time is"+t);
			break;
		default:
			System.out.println("Number of items is more");
			
			
		}

	}

}
