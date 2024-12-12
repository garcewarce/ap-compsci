/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a phrase:");
	String phrase = sc.nextLine();
	
	 while(true){
	 	if(phrase.indexOf(" ") == -1){
	 		break;
	 	}
	 }
	 	int space = phrase.indexOf(" ");
	 	String word = phrase.substring(0, space+1);
	 	System.out.println(word);
}
}
