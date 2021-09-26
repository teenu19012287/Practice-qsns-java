class Solution {
    public int mySqrt(int x) {
        if(x<=1){
                return x;
        }    
        long i=1;
        long sqrt = i*i;
        while (sqrt <= x)
        {
            i++;
            sqrt = i*i;
            
        }
        return (int)(i-1);
    }
} 
