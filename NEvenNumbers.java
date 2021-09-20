
import java.util.Scanner;

/*wap to print even numbers from 1 - n;
 * N = 100,1-100
 * N = 10 , 1-10
 * if(n%2==0)
 * 2%2==0 is an even number;
 * 
 */
public class NEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner (System.in);
          System.out.println("enter the highest number:");
          
          int n = sc.nextInt();
          for(int i=1;i<=n;i++)
          {
        	  if(i%2==0)
        	  {
        		  System.out.println("the number is :"+i);
        		  
        	  }
          }
          
	}

}
