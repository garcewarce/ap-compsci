/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("You will be guessing one random number out of 1000.");
		System.out.println("Please input a number");
		int num = sc.nextInt();
		int secret = (int)(Math.random()*1001);
		while (num != secret)
		{
			int num2 = (int)num;
			if(num != secret){
			System.out.println("Incorrect. please input again");
			num2 = sc.nextInt();
			}
			if ((num2 == secret) || (num == secret)){
			System.out.println("Correct!");
			break;
			}
		}
		System.out.println("you won!!!!");
	}
}