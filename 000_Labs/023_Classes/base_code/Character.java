/*
 *	Author:grac elee
 *  Date: 10/19/24
*/

import java.util.Scanner;
import java.util.Random;

public class Character{
	String role; 
	int strength;
	int dexterity;
	int intelligence;
	int endurance;
	int charisma;
	
	public Character(){
		role = new String ("Rogue");
		strength = 3;
		dexterity = 5;
		intelligence = 5;
		endurance = 3;
		charisma = 4;
	}
	public static void main(String args[]) {
	Character myCharacter = new Character();
	System.out.println("Your role is: " + myCharacter.role);
	System.out.println("Strength: " + myCharacter.strength);
	System.out.println("Intelligence: " + myCharacter.intelligence);
	System.out.println("Endurance: " + myCharacter.endurance);
	System.out.println("Charisma: " + myCharacter.charisma);
	}
}