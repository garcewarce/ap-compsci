/*
 *	Author:Grace Lee
 *  Date:9/19
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("please guess a number between 1 and 1000");
	int random = sc.nextInt();
	int what = (int)(Math.random()*1001+1);
	if(random == what){
		System.out.println("that's correct!!! hurray!!");
	}
	else(random !== what){
		System.out.println("sorry that's incorrect...");
	}
}
