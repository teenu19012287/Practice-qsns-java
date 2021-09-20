
import java.util.Scanner;

/* wap to print numbers from one to n;
 * 
 */
public class Numbersdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc  = new Scanner(System.in);
    System.out.println("enter the number:");
    int number  = sc.nextInt();
    
    for(int i = 1; i<=number;i++) {
    	System.out.println("the numbers are ="+i);
    	
    }
	}

}
