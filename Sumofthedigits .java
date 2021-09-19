
/*
 * wap to find sum of digits of a number?
 * 123 = 1+2+3=6
 * 1234=10
 * 123
 * digit = (123%10)=3;12%2 = 2;(1%10) = 1
 * sum = 0
 * add it to sum sum = (0+3)=3+2+1=6
 * num = num/10 (123/10)=12=
 * (12/10) = 1
 */
public class Sumofthedigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=1234;
       int sum=0;int digit = 0;
       while(num>0) {
    	   digit = num%10;
    	   sum = sum+digit;//0+4
    	   num = num/10;
    	   
    	   
       }
       
       System.out.println("sum of the digits are "+sum);
       
	}

}
