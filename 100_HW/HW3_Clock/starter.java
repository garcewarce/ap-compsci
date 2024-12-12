/*
 *	Author:Grace Lee
 *  Date:9/20
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sunday = 1;
		int monday = 2;
		int tuesday = 3;
		int wednesday = 4; 
		int thursday = 5;
		int friday = 6;
		int saturday = 7;
		System.out.println("please select the day of the week");
		System.out.println("1. Sunday");
		System.out.println("2. Monday");
		System.out.println("3. Tuesday");
		System.out.println("4. Wednesday");
		System.out.println("5. Thursday");
		System.out.println("6. Friday");
		System.out.println("7. Saturday");
		int answer = sc.nextInt();
		
		if(answer == 1){
			System.out.println("wake up, it's 10 A.M.!!");
		}
		else if(answer == 2){
			System.out.println("wake up, it's 7 A.M.!!");
		}
		else if(answer == 3){
			System.out.println("wake up, it's 7 A.M.!!");
		}
		else if(answer == 4){
			System.out.println("wake up, it's 7 A.M.!!");
		}
		else if(answer == 5){
			System.out.println("wake up, it's 7 A.M.!!");
		}
		else if(answer == 6){
			System.out.println("wake up, it's 7 A.M.!!");
		}
		else if(answer ==7){
			System.out.println("wake up, it's 10 A.M.!!");
		}
	}
}
