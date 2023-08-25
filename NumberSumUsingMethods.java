package Progrmas;
import java.util.*;
public class NumberSumUsingMethods {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	sumOfNumber(a);
}
public static void sumOfNumber(int n)
{
	int sum=0;
	while(n>0)
	{
	int rem=n%10;
	sum=sum+rem;
	n=n/10;
	}
	System.out.println(sum);
	
}
}
