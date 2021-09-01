package defaul;

import java.util.Scanner;

/*
 * JAVA PROGRAM TO FIND THE NUMBER OF OCCURENCES OF CHARACTERS IN STRING?
 * 
 "HELLO WORLD" = 11
		 COUNT FOR L
		 REMOVE L FROM STRING 
		 "HEO WORD"=8
		 SO, 11-8 = 3;
 */
public class Occurences {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        
        int initiallength = str.length();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the characters ");
        String str1 = sc1.next();
        str=str.replace(str1, "");
        int finalString = str.length();
        System.out.println("Total number of occurences "+str1+ (initiallength-finalString));
	}

}
