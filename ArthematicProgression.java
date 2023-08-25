package Progrmas;
import java.util.*;
public class ArthematicProgression {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	double sum=0;
	for(int i=1;i<=a;i++)
	{
		
		sum=sum+(1.0/i);
		
	}
	System.out.println(sum);
}
}
