/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter something to decode (if any)")
		String a = sc.nextLine();
		for(int r = 0; r <= 36; r++){
			System.out.println(Cipher.keyedEncode(a, r));
		System.out.println("The key is: "+r);
		}
		System.out.println("What would you like to encode?");
		String b = sc.nextLine();
		System.out.println(Cipher.encode(b));

	}
}
