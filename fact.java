import java.util.*;
import java.lang.*;
import java.io.*;
class Vika
{
	public static void main (String[] args)
	{
		int n,i=1,f=1;
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
  while(i<=n)
  {
  	f=f*i;
  	i++;
  }
  System.out.println("Factorial of "+n+" is "+f);
	}
}