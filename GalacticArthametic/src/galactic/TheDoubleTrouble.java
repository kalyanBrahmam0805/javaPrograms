package galactic;

import java.util.Scanner;

public class TheDoubleTrouble {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		//int res=doubletheNumber(num);
		System.out.println(doubleTheNumber(num));
		
	}
	public static int doubleTheNumber(int num) {
	return num*num;
	}
}
