/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		boolean barked = false;
		Dog fart = new Dog("fart",2);
		
		Dog ahhh = new Dog("ahhhh","Chinese Crested Dog");
		if(fart.isSleeping()){
			System.out.println("it stays in slumber");
		}
		else{
			fart.bark();
			barked = true;
		}
		if(ahhh.isSleeping() && barked){
			ahhh.bark();
		}
		else if(!fart.isSleeping() && barked){
			ahhh.bark();
		}
			
		}
	}
