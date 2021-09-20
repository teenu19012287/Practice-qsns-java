/*
 * wap to find first duplicate occurence of a number in an array
 * "1,2,3,1,4,5,6,7}
 * compare with each other technique
 */
public class FirstDuplicateoccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Integer x[] = {2,2,4,5,1,2,7};
       for(int i=0;i<x.length;i++)
       {
    	   for(int j=i+1;j<x.length;j++)
    	   {
    		   if(x[i]==x[j]) {
    			   System.out.println(x[i]);
    			   return ;
    		   }
    	   }
       }
	}

}
