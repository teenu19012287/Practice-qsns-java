package defaul;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		      int[] arr  = {3,4,5,12,1};
		      int temp;
		      
		      for(int i=0;i<arr.length;i++)
		      {
		    	int flag =0;
		    	  for(int j=0;j<arr.length-1-i;j++)
		    	  {
		    		  if(arr[j]>arr[j+1])
		    		  {
		    			  temp=arr[j];
		    			  arr[j] = arr[j+1];
		    			  arr[j+1] = temp;
		    			  flag = 1;
		    			  
		    		  }
		    		  
		    		  
		    		  
		    	  }
		    	  if(flag==0)
		    	  {
		    		  break;
		    	  }
		      }
		      for(int i=0;i<arr.length;i++)
		      {
		    	  System.out.println(arr[i]);
		    	  
		      }
	}

}
