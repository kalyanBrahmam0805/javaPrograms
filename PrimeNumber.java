package Progrmas;
import java.util.*;
public class PrimeNumber {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int count=0;
	prime(n,count);

}
static void prime(int n,int count)
{
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			count=1;
		}
	}
	if(count==0)
	{
		System.out.println(n+" is a prime number");
	}
	else
	{
		System.out.println(n+" is not a prime number ");
	}
}
}
