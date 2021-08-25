package Assignment3;
import java.util.Scanner;

public class que8 {

	public static void main(String[] args) {
		int x,y,z;
		String lab;
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		lab = sc.next();
		if(lab.equals("L1"))
		{
			if(y<z)
			{
				System.out.println("L2 has minimal seating capacity");
			}
			else
			{
				System.out.println("L3 has minimal seating capacity");
			}
			
		}
		else if(lab.equals("L2 has minimal seating capacity"))
		{
			if(x<z)
			{
				System.out.println("L1 has minimal seating capacity");
			}
			else
			{
				System.out.println("L3 has minimal seating capacity");
			}
		}
		else if(lab.equals("L3"))
		{
			if(x<y)
			{
				System.out.println("L1 has minimal seating capacity");
			}
			else
			{
				System.out.println("L2 has minimal seating capacity");
			}
		}
		
		
		






	}

}
