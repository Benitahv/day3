package Assigment3;
import java.util.Scanner;


public class que5 {

	public static void main(String[] args) {
		int t,b,h;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter student type");
		String str=sc.next();
		System.out.println("enter the tution fee");
		t=sc.nextInt();
		System.out.println("enter the bus fee");
		b=sc.nextInt();
        System.out.println("enter the values hostel fee");
    	h=sc.nextInt();
		switch(str)
		{
		case  "msds":System.out.println(t+b);break;
		case "msh":System.out.println(t+h);break;
		case "mgsds":System.out.println(150%(t+b));break;
		case "mgsh":System.out.println(150%(t+h));break;
		
		}
		

	}

}
