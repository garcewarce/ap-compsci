/*
 *	Author:Grace Lee
 *  Date:9/19
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter one out of three integers");
		int a = sc.nextInt();
		System.out.println("second number");
		int b = sc.nextInt();
		System.out.println("third number");
		int c = sc.nextInt();
		if((a>b && b>c) || (a>c && c>b)){
			System.out.println("your largest integer is " + a);
		}
		if((b>a && a>c) || (b>c && c>a)){
			System.out.println("your largest integer is " + b);
		}
		if ((c>a && a>b) || (c>b && b>a)){
			System.out.println("your largest integer is " + c);
		}
		if ((a<b && b<c) || (a<c && c<b)){
			System.out.println("your smallest integer is " + a);
		}
		if ((b<c && c<a) || (b<a && a<c)){
			System.out.println("your smallest integer is " + b);
		}
		if ((c<b && b<a) || (c<a && a<b)){
			System.out.println("your smallest integer is " + c);
		}
	}
}
