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
	public int charisma;
	
	public myCharacter(){
		role = "No role";
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
	}
		
		public String setRole(String x){
			role = x;
		if(x.equals("wizard")||x.equals("Wizard")){
			role = "wizard";
			System.out.println("you've chosen the wizard! Excelsior!");
			return role;
		}
		else if(x.equals("rogue")||x.equals("Rogue")){
			role = "rogue";
			System.out.println("You've chosen the rogue! How cunning!");
			return role;
		}
		else if(x.equals("warrior")||x.equals("Warrior")){
			role = "warrior";
			System.out.println("You've chosen the warrior! For honor!");
			return role;
		}
		else{
			role = x;
			return role;
		}
		}
		
		public int setStrength(int m){
			strength = m;
			if (strength < 0){
				strength = 0;
			}
			return strength;
		}
		public int setDexterity(int j){
			dexterity = j;
			if(dexterity < 0){
				dexterity = 0;
			}
			return dexterity;
		}
		public int setIntelligence(int k){
			intelligence = k;
			if (intelligence < 0){
				intelligence = 0;
			}
			return intelligence;
		}
		public int setCharisma(int l){
			charisma = l;
			if (charisma < 0){
				charisma = 0;
			}
			return charisma;
		}
		public boolean setAll(String hi, int bye, int hello, int what, int idk){
			role = hi;
			strength = bye;
			dexterity = hello;
			intelligence = what; 
			charisma = idk; 
			return true; 
		}
		
		public void myToString(){
			System.out.println("Your role is " + role);
			System.out.println("Strength: " + strength);
			System.out.println("dexterity: " + dexterity);
			System.out.println("intelligence: " + intelligence);
			System.out.println("charisma: " + charisma);
		}
	}