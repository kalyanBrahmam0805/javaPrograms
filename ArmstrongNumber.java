package Progrmas;

public class ArmstrongNumber {
public int armstrong(int n)
{
	int sum=0;
	int temp=n;
	String p=Integer.toString(temp);
	while(temp>0)
	{
		int digit=temp%10;
		sum+=(int) (Math.pow(digit,p.length()));
		temp=temp/10;
		
	}
	return sum;
}
}
