package Progrmas;

public class PalinApp {
public int palin(int n)
{
	int temp=n;
	int rev=0;
	while(temp>0)
	{
		int rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
		
	}
	return rev;
}
}
