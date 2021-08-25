package Assignemten3;
import java.util.Scanner;

public class MovieTickets {

	public static void main(String[] args) {
		int age;
		float time;
		Scanner sc = new Scanner(System.in);
		age=sc.nextInt();
		time=sc.nextFloat();
		double time1;
		time1=13.30;
		if(age>13)
		{
			if(time==time1)
			{
				System.out.println("$5");
			}
			else
			{
				System.out.println("$8");
			}
		}
		if(age<13)
		{
			if(time==time1)
			{
				System.out.println("$2");
			}
			else
			{
				System.out.println("$4");
			}
		}
		
		

	}

}
