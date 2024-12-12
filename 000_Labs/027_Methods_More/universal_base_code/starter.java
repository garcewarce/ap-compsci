/*
 *	Author:Grace Lee
 *  Date:10/
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		myCharacter fart = new myCharacter();
		System.out.print("choose from three roles: wizard, warrior, rogue: ");
		fart.setRole(sc.nextLine());
		System.out.println("input points to put into four traits: strength, dexterity, intelligence, charisma");
		System.out.print("Strength: ");
		fart.setStrength(sc.nextInt());
		System.out.print("Dexterity: ");
		fart.setDexterity(sc.nextInt());
		System.out.print("Intelligence: ");
		fart.setIntelligence(sc.nextInt());
		System.out.print("Charisma: ");
		fart.setCharisma(sc.nextInt());
		fart.myToString();
	}
}
