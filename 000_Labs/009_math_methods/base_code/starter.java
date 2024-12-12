/*
 *	Author:Grace Lee
 *  Date:9/12/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	double x = sc.nextDouble();
	System.out.println("please enter another number");
	double y = sc.nextDouble();
	System.out.println("here is the bigger number out of the ones you entered");
	double max = Math.max(x,y);
	System.out.println(max);
	System.out.println("here is the square root of your second number");
	double root = Math.sqrt(y);
	System.out.println(root);
	System.out.println("here is your first number to the power of your second number");
	double power = Math.pow(x,y);
	System.out.println(power);
	
	}
}
