package defaul;

/*
 * java program to reverse elements of the array
 * {10,20,30,40}
 * low  = 0(increment) ,high = arraysize - 1
 * step 1: swaps last and first elemets 
 * as {40,20,30,10}
 * low = 0,high=3
 * step2 :low =1,high=2 swap these two
 * 
 * {10,20,30,40}
 * 
 

step 3: low=2,high = 1 come out of loop 
low < high condition false 

*/
public class Reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		int array[] = {10,20,30,40,70};
		int low = 0,high = array.length-1;
		while(low<high)
		{
			int temp = array[low];
			array[low] = array[high];
			array[high] = temp;
			low++;
			high--;
			
		}
		for(int i:array)
		{
			System.out.println(i);
		}
		
		
	}

}
