
//JAVA PROGRAM TO FIND LONGEST SUBSTRING WITHOUT REPETITION .

package defaul;

import java.util.HashSet;

public class Longest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               
		String str  = "abcdeab";
		Substring(str);
		
		
	}
	
	public static String Substring(String str)
	{
    HashSet<Character> set = new HashSet<>();
	String longestOverall="";
	String longestTillnow="";
	
	for(int i=0;i<str.length();i++)
	{
		char c = str.charAt(i);
		if(set.contains(c))
		{
			longestTillnow="";
			set.add(c);
			
		}
		set.add(c);
		longestTillnow+=c;
		if(longestTillnow .length() > longestOverall.length())
		{
			longestOverall = longestTillnow;
			
		}
	}
	return longestOverall;
}
}