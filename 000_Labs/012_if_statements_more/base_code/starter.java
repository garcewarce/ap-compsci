/*
 *	Author:Grace
 *  Date:9/19
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please type in 2 numbers");
		int x = sc.nextInt();
		System.out.println("next number");
		int y = sc.nextInt();
		boolean z = (x == y);
		if(z){
			System.out.println("heh heh heh...");
		}
		else if(x != y){
			System.out.println("ho ho ho...");
		}
	}
}
