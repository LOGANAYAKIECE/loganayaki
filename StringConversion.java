import java.io.*;
import java.util.*;
class StringConversion
{
 public static void main(String args[])
 {
  Scanner s=new Scanne(System.in);
  String a=s.next();
  for(i=0;i<a.lengh();i++)
  {
    char b=a.charAt(i);
    int n=(int)b-1;
    if(n>0)
    {
    String c=c.concat(String.valueOf((char)n));
    }
    else
    {
     int d=26;
     c=c.concat(String.valueOf((char)d));
    }
  }
 }
}