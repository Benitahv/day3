package Assignment3;
import java.util.Scanner;


public class que6 {

	public static void main(String[] args) {
		int cur;
		int bir;
		int age=0;
		Scanner sc = new Scanner(System.in);
		cur=sc.nextInt();
		bir=sc.nextInt();
		if(cur>bir)
		{
			age=cur-bir;
			
		}
		else if(cur<bir)
		{
			age=(cur+100)-bir;
		}
		System.out.println(age);
			
				

	}

}
