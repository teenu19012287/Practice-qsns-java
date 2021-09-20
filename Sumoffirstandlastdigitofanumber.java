
import java.util.Scanner;

/*
 * wap to find first digit and last digit of a number and sum of first and last digit of a number
 * int number = 134
 * firstdigit = 1;
 * lastdigit = 4;
 * sum = 1+4 = 5;
 * int lastdigit = 134%10 = 4;
 * int lastdigit = 145 %10 = 5;
 * firstdigit = number;
 * while(firstdigit>=10){ //134>10,13>=10 ,1>=10 = wrong
 * firstdigit = firstdigit/10; // 134/10 = 13 //13/10=1;
 * firstdigit = 4;
 * 
 * 
 */
public class Sumoffirstandlastdigitofanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the number:");
         int number  = sc.nextInt();
         //LAST DIGITWE USE % OPERATION
         int lastdigit = number%10;
         int firstdigit = number;
         while(firstdigit >=10) {
        	 firstdigit = firstdigit/10;
        	 
         }
         System.out.println("first digit = "+firstdigit);
         System.out.println("last digit="+lastdigit);
         System.out.println("sum = "+(firstdigit+lastdigit));
         
	}

}
