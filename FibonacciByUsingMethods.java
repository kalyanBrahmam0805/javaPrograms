package Progrmas;
import java.util.*;
public class FibonacciByUsingMethods {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int n1=0;
	int n2=1;
	if(a==1)
	{
		System.out.println(n1);
	}
	else if(a==2)
	{
		System.out.println(n1+" "+n2);
	}
	else
	{
		fibonacci(a,n1,n2);
	}
}
public static void fibonacci(int a,int n1,int n2)
{
	System.out.print(n1+" "+n2);
	for(int i=3;i<=a;i++)
	{
		int next=n1+n2;
		n1=n2;
		n2=next;
		System.out.print(" "+next+" ");
	}
}
}
