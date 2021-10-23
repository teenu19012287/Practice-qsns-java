package defaul;

public class Selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min;
		int temp=0;
    int[]  arr = {23,33,12,86,54,33};
       for(int i=0;i<arr.length;i++)
       {
    	   min=i;
    	   for(int j=i+1;j<arr.length;j++)
    	   {
    		   if(arr[j]<arr[min])
    		   {
    			   min=j;
    			   
    		   }
    	   }
    	   temp=arr[i];
    	   arr[i] = arr[min];
    	   arr[min] =temp;
    	   
       }
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}
}
