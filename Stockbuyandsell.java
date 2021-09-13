package defaul;
//PROGRAM BEST TIME TO BUY AND SELL STOCK 
/*
 * {10,20,40,80,90}
 * high profit = 90-10=80
 * int max = integer.min,int min=Integer.max
 * 1:compare each value with mini if it less than update minimum value with current
 
 *min=10;
 *step2:current value  - min>max 10-10>0
 *3: 80-10>10
 *max = 80;
 *
 *
 */


public class Stockbuyandsell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {7,20,40,80,100};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i] <min)
			{
				min = array[i];
				
			}
			if(array[i]-min>max) {
				max = array[i] - min;
				
			}
		}
		System.out.println("max value = "+max);
		
			
		
	}

}
