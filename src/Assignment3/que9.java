package Assignment3;
import java.util.Scanner;

public class que9 {

	public static void main(String[] args) {
		int x,y,z,n;
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		n=sc.nextInt();
	    if(n<=x&&n<=y&&n<=z)
	    {
	    	System.out.println("3 labs can accomodate 25 students");
	    }
	    else if((n<=x&&n<=y)||(n<=y&&n<=z)||(n<x&&n<=y))
	    {
	    	System.out.println("2 labs can accomodate 25 students");
	    }
	    else if(n<=x||n<=y||n<=z)
	    {
	    	System.out.println("1 lab can accomodate 25 students");
	    }
	    else
	    {
	    	System.out.println("none of the labs can accomodate 25 students");
	    }
			    	
	    

	}

}
