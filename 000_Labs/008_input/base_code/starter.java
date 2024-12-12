/*
 *	Author:Grace Lee
 *  Date:9/10/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("what is your name?");
		String name = sc.nextLine();
		
		System.out.println("hello " + name +" please enter your age");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("wow youre " + age + "!!! please enter the month you were born in");
		String month = sc.nextLine();
		
		
		System.out.println(month+ " wow! what day in " + month+"?");
		int day = sc.nextInt();
		
		System.out.println(month+" " + day + "? what year?");
		int year = sc.nextInt();
		
		System.out.println(month +" "+day +", "+year + "? how much is in a buck fifty");
		int money = sc.nextInt();
		System.out.println("ok");
	}
}
