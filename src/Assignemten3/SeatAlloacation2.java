package Assignemten3;
import java.util.Scanner;

public class SeatAlloacation2 {

	public static void main(String[] args) {
		int Rollno,rows,columns;
		Scanner sc = new Scanner(System.in);
		Rollno=sc.nextInt();
		rows=sc.nextInt();
		columns=sc.nextInt();
		if(Rollno%columns==0||Rollno%columns==1||Rollno<=columns)
				{
					System.out.println("yes");
				}
		else
		{
			System.out.println("no");
		}

	}

}
