/*
 * wap to cunt number of digits in an integer?
 * 1234 -- 4
 * 123 -- 3
 * 1-iterative 1534 = 1534 /10=153(count = 1),153/10=15(count=2),15/10=1(count=3),1/10=0(count=4)
 * 
 * 2-recursivw
 * 3-converting to string
 */
ITERRATIVE APPROACH
public class CountNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int number=5678;
         int count=0;
         while(number!=0) {
        	 number  = number/10;
        	 count++;
        	 
         }
         System.out.println(count);
         
	}

}

RECURSIVE APPROACH
public class CountNumbers {

	public static void main(String[] args) {
	
         System.out.println(countNumbers(2103));
         
	}
	static int countNumbers(Integer n) {
		if(n==0)
			return 0;
		
		return 1+countNumbers(n/10);
		
	}

}
3-CONVERTING TO STRING METHOD
public class CountNumbers {

	public static void main(String[] args) {
	
        System.out.println(String.valueOf(2103).length());
        
	}
	static int countNumbers(Integer n) {
		if(n==0)
			return 0;
		
		return 1+countNumbers(n/10);
		
	}

}

