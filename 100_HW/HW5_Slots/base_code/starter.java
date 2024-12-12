/*
 *	Author:Grace Lee
 *  Date:10/4
 * 	Collaborator(s):Giorgio Banna
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Slot machine rules:");
		System.out.println("1. Each user starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("  a. If two numbers match, you double your money.");
		System.out.println("  b. If three numbers match, you triple your money.");
		System.out.println("  c. If none match, you lose your money.");
		// System.out.println("Would you like to play the slots? (Yes/yes/Y/y)");
		// String answer = sc.nextLine();
		int money = 100;
		// while(true){
		// 	if ((answer.equals("Yes"))||(answer.equals("yes"))||(answer.equals("Y"))||(answer.equals("y"))){
		// 		System.out.println("Yay! Please enter an amount to wager:");
		// 	}
		// 	else if((answer.equals("No"))||(answer.equals("no"))||(answer.equals("N"))||(answer.equals("n"))){
		// 		System.out.println("you controlled your urges and decided not to play the slots.");
		// 		break;
		// 	}
		while(money > 0){
			System.out.println("Would you like to play the slots? (Yes/yes/Y/y)");
			String answer = sc.nextLine();
			if ((answer.equals("Yes"))||(answer.equals("yes"))||(answer.equals("Y"))||(answer.equals("y"))){
			System.out.println("How much would you like to wager?");
			int wager = sc.nextInt();
			sc.nextLine();
			if(wager > money){
				System.out.print("You do not have enough money, please input another value: ");
				wager = sc.nextInt();
			}
			int first = (int)(Math.random()*10+1);
			int second = (int)(Math.random()*10+1);
			int third = (int)(Math.random()*10+1);
			System.out.println("| " + first + " | " + second + " | " + third + " |");
			if(first == second && second == third && first == third){
				System.out.println("JACKPOT! All 3 numbers match! You gained triple your wagered amount.");
				money = 2*wager + money;
			}
			if(first == second || second == third || first == third){
				System.out.println("2 numbers match!! You gained double your wagered amount.");
				money = wager + money;
			}
			else{
				System.out.println("None of the numbers match. You lost $" + wager + ".");
				money = money - wager;
				}
				if(money == 0){
					System.out.println("You have no more money. goodbye!!");
					break;
				}
				System.out.println("You now have $" + money + ".");
			}
			else if((answer.equals("No"))||(answer.equals("no"))||(answer.equals("N"))||(answer.equals("n"))){
				// System.out.println("you controlled your urges and decided not to play the slots.");
				// break;
				// System.out.println("Would you still like to wager? (Yes/yes/Y/y)");
				// answer = sc.nextLine();
				// sc.nextLine();
				// if ((answer.equals("Yes"))||(answer.equals("yes"))||(answer.equals("Y"))||(answer.equals("y")))
				// System.out.println("Yay! Please enter an amount to wager:");
				// else if((answer.equals("No"))||(answer.equals("no"))||(answer.equals("N"))||(answer.equals("n"))){
				// System.out.println("you controlled your urges and decided not to play the slots.");
				// break;
				}
				}
		}
	}
