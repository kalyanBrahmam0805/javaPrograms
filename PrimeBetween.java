package Progrmas;
import java.util.*;
public class PrimeBetween {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int count=0;
	int n=sc.nextInt();
		
		for(int i=1;i<=n;i++){
			//int count=0;
		    if(checkPrime(i)){
		        System.out.print(i+" " );
		        count++;
			    
		        
		    }
		    

		   
		}
		System.out.println();
		System.out.println(count);
	}
	public static boolean checkPrime(int num){
	    
	
	    if(num<2)
	        return false;
	    for(int i=2;i<num;i++){
	           if(num%i==0){
	                return false;
	            }
	    }
	    return true;
	}
}

