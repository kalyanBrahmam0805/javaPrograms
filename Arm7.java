package Progrmas;

public class Arm7 {
	public int armstrong(int n)
	{
		int sum=0;
		String p=Integer.toString(n);
		while(n>0)
		{
			int digit=n%10;
			sum+=(int) (Math.pow(digit,p.length()));
			n=n/10;
			
		}
		return sum;
	}
	}

