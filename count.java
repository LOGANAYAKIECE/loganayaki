package program;

import java.util.Scanner;
public class Count
{
	public static void main(String[] args)
	{
		int num,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		num=s.nextInt();
		while(num>0)
	    {
			 num=num/10;
			 count++;
		
		
	    }

		System.out.println(" sum of digit number " +count);
	
	}

}

