package Progrmas;
import java.util.*;
public class Arm3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		ArmstrongNumber a1=new ArmstrongNumber();
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
