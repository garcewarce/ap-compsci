/*
 *	Author: Grace Lee
 *  Date:9/11/24
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	System.out.println("enter number");
	int num1 = sc.nextInt();
	System.out.println("these are the next 5 numbers after" + num1);
	System.out.println((num1 + 1) + ", "+ (num1 + 2) + ", " + (num1 + 3) + ", " + (num1 + 4) + ", " + (num1 + 5));
	System.out.println("these are your numbers and the next 5 multiples of" + num1 );
	System.out.println((num1*2) + ", " + (num1*3) + ", " +  (num1*4) + ", " + (num1*5)+ ", " + (num1*6));
	double num2 = num1; 
	System.out.println("this is your number divided by 100");
	System.out.println((num2/100));
	System.out.println("this is your number divided by 10");
	System.out.println((num2/10));
	}
}
