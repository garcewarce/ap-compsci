/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input a role");
		String a = sc.nextLine();
		myCharacter cha = new myCharacter(a);
		
		System.out.println("Your role is " +cha.role);
	
	}
}
