/*
 *	Author:grace lee
 *  Date:10/13/24
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int x){
	int count = 2;
	while(count>x){
		if(x%count==0){
			return true;
		}
		count = count + 1;
		}
		return false;
	}
	public static void printPrimes(int x){
	int c = 0;
	while(c < x){
	c =  + 1;
	if(checkPrime(c)==true)
	System.out.println(x);
	}
}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number and we'll print out every prime until that number:");
		int x = sc.nextInt();
		if(checkPrime(x)==true){
			System.out.println(checkPrime(x));
		}
		else{
			System.out.println(checkPrime(x));
		}
		printPrimes(x);
	}
}

