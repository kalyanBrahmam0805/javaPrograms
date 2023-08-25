package Progrmas;
import java.util.*;
public class ArmstrongNumberApp {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	Arm7 a1=new Arm7();
	int res=a1.armstrong(a);
	if(a==res)
	{
		System.out.println("armstrong number");
	}
	else
	{
		System.out.println("not armstrong number");
	}
	
	
}
}
