
import java.util.Scanner;

/* wap to find largest of three numbers
 * 10,40,50
 * ->50
 * num1,num2,num3
 * if(num1>num2) && (num1>num3) - num1 is largest
 * if(num2>num3) && (num2>num1) - num2 is largest
 * else num3 
 */
public class Largestofthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner (System.in);
          System.out.println("enter the first number");
          
          int num1 = sc.nextInt();
          System.out.println("enter second number:");
          
          int num2 = sc.nextInt();
          System.out.println("enter the third number:");
          int num3 = sc.nextInt();
          
          
          if(num1 > num2 && num1>num3)
          {
        	  System.out.println("first number is largest:");
        	  
          }else if(num2 > num3 && num2 > num1) {
        	  System.out.println("second number is largest");
        	  
          }else {
        	  System.out.println("third number is largest");
        	  
          }
	}

}
