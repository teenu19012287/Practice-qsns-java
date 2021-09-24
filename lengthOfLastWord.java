class Solution {
    public int lengthOfLastWord(String s) {
        
         s = s.trim();   //will trim the white space;
            int x = s.length()-1,i;
        for(i=x;i>=0;i--)
        {
            if(s.charAt(i) == ' ')
            {
                break;
            }
           
        }
         return x-i;
    }
}
        
        
        
    
