/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.println("Enter an integer");
		int x = sc.nextInt(); 
		System.out.println("Please enter another integer that is bigger than the first");
		int y = sc.nextInt();
		
		System.out.println("Your range is "+ x + " to " + y+".");
		System.out.println("Here are 5 randomly generated numbers in that range");
		int z = y- x;
		int a = (int)(Math.random()*z)+x;
		int b = (int)(Math.random()*z)+x;
		int c = (int)(Math.random()*z)+x;
		int d = (int)(Math.random()*z)+x;
		int e = (int)(Math.random()*z)+x;
		System.out.println(a + ", " + b + ", " + c + ", " + d + ", "+ e);
	}
}
