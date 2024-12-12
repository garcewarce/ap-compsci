/*
 *	Author:Grace Lee
 *  Date: 10/10
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input 2 values: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("here is " + x + " to the power of " + y + ":");
		int num = pow(x,y);
		System.out.println(num);
	}
	public static int pow(int x, int y){
	int count = 0;
	int z = x;
	while(count<y-1){
		x = x * z;
		count = count+1;
	}
	return x;
		}
	}
