package defaul;

public class Stackimple {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	//}	
		
	int	Array[] = new int[9];
     int top=0;
     
    private boolean push(int x)
     {
    	 top++;
    	 Array[top]=x;
    	 System.out.println("element pushed into the stack="+x);
    	 return true;
    	 
     }
    private int pop()
    {
    	int x = Array[top--];
    	System.out.println("element popped from stack="+x);
    	return x;
    	
    }
	
    private int peek()
    {
    	return Array[top];
    	
    }
    public static void main (String[] args)
    {
    	Stackimple stack = new Stackimple();
    	stack.push(10);
    	stack.push(45);
    	stack.push(23);
    	stack.push(34);
    	stack.pop();
    	System.out.println("peek="+stack.peek());
    }

}
