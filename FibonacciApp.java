package Progrmas;

public class FibonacciApp {
public static String fibonacciSeries(int n)
{
	int n1=0;
	int n2=1;
	if(n==1)
	{
		System.out.println(n1);
		//return "completed";
	}
	else if(n==2)
	{
		System.out.println(n1+" "+n2);
		//return "completed";
		
	}
	else
	{
		System.out.print(n1+" "+n2+" ");
		for(int i=3;i<=n;i++)
		{
			int next=n1+n2;
			n1=n2;
			n2=next;
			System.out.print(next+" ");
		}
	}
	return "completed";
}
}
