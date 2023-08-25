package galactic;
import java. util.Scanner;
public class galactic {
public static void main(String args[]) {
	
	 int result1=subtractNumbers(20, 5);
	 int result2=multiplyNumbers(4, 5);
	 double result3=divideNumbers(20, 4);
	 double result4=findRemainder(10.0, 3.0);

	 System.out.println(result1);
	 System.out.println(result2);
	 System.out.println("%.2f\n",result3);
	 System.out.println(result4); 
	
	
	

}
public static int subtractNumbers(int num1, int num2) {
	return num1-num2;
}
public static int multiplyNumbers(int num1, int num2) {
	return num1*num2;
 }
public static double divideNumbers(double num1, double num2) {
	return num1/num2;
	}
public static int findRemainder(double num1, double num2) {
	return(int) (num1%num2);
}
  

   }





