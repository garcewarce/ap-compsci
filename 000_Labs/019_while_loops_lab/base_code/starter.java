/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please write your name");
		String name = sc.nextLine();
		System.out.println("please input how many times you would like your name to be written");
		int a = 0;
		int amt = sc.nextInt();
		sc.nextLine();
		while (a < amt)
		{
			System.out.println(name);
			if(a >= amt){
				break;
			}
			a = a +1;
		}
}
}
