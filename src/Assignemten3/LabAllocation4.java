package Assignemten3;
import java.util.Scanner;

public class LabAllocation4 {

	public static void main(String[] args) {
		int l1,l2,l3,n;
		Scanner sc = new Scanner(System.in);
		l1=sc.nextInt();
		l2=sc.nextInt();
		l3=sc.nextInt();
		n=sc.nextInt();
		if(n<l1&&n<l2&&n<l3)
		{
			if(l1<l2&&l1<l3)
			{
				System.out.println("L1 lab should be allocated to this class");
			}
			else if(l2<l3)
			{
				System.out.println("L2 lab should be allocated to this class");
			}
			else
			{
				System.out.println("L3 lab should be allocated to this class");
			}
		}

			else if(n<l1&&n<l2)
			{
				if(l1<l2)
				{
					System.out.println("L1 lab should be allocated to this class");
				}
				else
				{
					System.out.println("L2 lab should be allocated to this class");
				}
			}
				else if(n<l1&&n<l3)
				{
					if(l1<l3)
					{
						System.out.println("L1 lab should be allocated to this class");
					}
					else
					{
						System.out.println("L3 lab should be allocated to this class");
					}
				}
					else if(n<l2&&n<l3)
					{
						if(l2<l3)
						{
							System.out.println("L2 lab shold ne allocated to this class");
						}
						else
						{
							System.out.println("L3 lab should be allocated to this class");
						}
					}
						else if(n<l1)
						{
							System.out.println("L1 lab should be allocated to this class");
						}
						else if(n<l2)
						{
							System.out.println("L2 lab should be allocated to this class");
						}
						else if(n<l3)
						{
							System.out.println("L3 lab should be allocated to this lab");
						}
						else
						{
							System.out.println("none of the labs should be allocated");
						}
					}
}
				
		
