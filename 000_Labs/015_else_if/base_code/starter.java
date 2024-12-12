/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
	System.out.println("please guess a number between 1 and 1000");
	int random = sc.nextInt();
	int what = (int)(Math.random()*1000+1);
	if(random > what){
		System.out.println("your number is too large, the correct number is " + what);
	}
	else if(random < what){
		System.out.println("your number is too small, the correct number is " + what);
	}
	else if(random == what){
		System.out.println("you got it correct!!");
	}
	}
}
