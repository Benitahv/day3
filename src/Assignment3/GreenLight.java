package Assignment3;
import java.util.Scanner;

public class GreenLight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float s=sc.nextFloat();
		float d=sc.nextFloat();
		float t=sc.nextFloat();
		if((s<t)||((s>t)&&(d>1)))
		{
			System.out.println("No");
			
		}
		else 
		{
			System.out.println("Yes");
		}

	}

}
