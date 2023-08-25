package Progrmas;
import java.util.*;
public class PalinDromeUsingMethods {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	PalinApp p=new PalinApp();
	int res=p.palin(n);
	if(res==n)
	{
		System.out.println("palin");
	}
	else
	{
		System.out.println("not palin");
	}
	
}
}
