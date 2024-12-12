/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter{
	public String role; 
	public int strength;
	public int dexterity;
	public int intelligence;
	public int endurance;
	public int charisma;
	
	public myCharacter(){
		role = new String ("rogue");
	}
	
	public void myToString(){
		System.out.println("Your role is " + role);
		System.out.println("Your strength trait is " + strength);
		System.out.println("Your dexterity trait is " + dexterity);
		System.out.println("Your intelligence trait is " + intelligence);
		System.out.println("Your endurance trait is " + endurance);
		System.out.println("Your charisma trait is " + charisma);
	}
}
