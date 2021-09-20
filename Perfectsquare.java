/* java program to check whether a given number is perfect square or nto?
 * every square of an integer is an perfect square
 * 4,16,36,25,144,1......
 * 4
 * 1 square  =4 ...
 * ...not
 * 
 * 2 square  = 4 yes
 * 
 */

import java.util.Scanner;

public class Perfectsquare {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc = new Scanner (System.in);
      
           System.out.println("enter the number:");
           int num = sc.nextInt();
           for(int i=1;i<num;i++)
           {
        	   if(i*i==num) {
        		    System.out.println("given number is squARE OF"+i);
        	   
        	   return;
        	   
           }
	}
	}

}
