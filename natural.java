package program;
import java.util.Scanner;
import java.io.*;
public class Sum {
	private static Scanner s;

	public static void main(String[] args)
	{
		int sum=0,i,n=0;
		s = new Scanner(System.in);
		System.out.println("enter the number");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{ 
			sum =sum+i;
		}
		System.out.println("sum of n numbers" +sum);
		
		
	}
	}




