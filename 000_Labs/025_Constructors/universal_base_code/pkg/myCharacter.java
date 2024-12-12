/*
 *	Author:grac elee
 *  Date: 10/19/24
*/
package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter{
	public String role;
	
	public void mycharacter(){
		role = new String ("No role");
	}
	
	public myCharacter(){
		if(role.equals("No role")){
			System.out.println("No role");
		}
	}
	public myCharacter(String a){
		role = a;
		if(role.equals("wizard")||role.equals("Wizard")){
			role = "wizard";
			System.out.println("you've chosen the wizard! Excelsior!");
		}
		else if(role.equals("rogue")||role.equals("Rogue")){
			role = "rogue";
			System.out.println("You've chosen the rogue! How cunning!");
		}
		else if(role.equals("warrior")||role.equals("Warrior")){
			role = "warrior";
			System.out.println("You've chosen the warrior! For honor!");
		}
		else{
			System.out.println(role);
		}
	}
}