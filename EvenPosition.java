/*
 * wap a java program to print elements in even postion ?
 * {1,10,2,20,30,40}
 * i=2;i<array.length;i++
 * 
 */
public class EvenPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[] = new int[] {1,2,3,4,5,7,8};
    for(int i=2;i<arr.length;i=i+2)
    {
    	System.out.println("index="+i);
    	
    	System.out.println("VALUE="+arr[i]);
    	
    	
    }
	}

}
