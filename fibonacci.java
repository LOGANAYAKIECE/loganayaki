package hunter;
import java.io.*;
import java.util.Scanner;
public class Fabonacci {
public static void main(String[] args) 
{
	int n1=0,n2=1,n3,count=0;
	System.out.println( n1+" "+n2);
	for(int i=2;i<10;i++) {
		n3=n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
		
	}
}
}
    	