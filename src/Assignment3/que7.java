package Assignment3;
import java.util.Scanner;

public class que7 {

	public static void main(String[] args) {
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		if(x<y && x<z)
		{
			System.out.println("L1 has minimal seating:"+x);
		}
		else if(y<x && y<z)
		{
			System.out.println("L2 has minimal seating:"+y);
		}
		else if(z<x && z<y)
		{
			System.out.println("L3 has minimal seating:"+z);
		}

	}

}
