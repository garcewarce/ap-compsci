/*
 *	Author:Grace Lee
 *  Date:9/26/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("what is your name?");
		String name = sc.nextLine();
		
		System.out.println("thank you " + name+ ", what is your title?");
		String title = sc.nextLine();
		
		System.out.println("hello "+name+", "+title);
		
		System.out.println("please choose from three roles: wizard, warrior, or rogue");
		String role = sc.nextLine();
		
		if((role.equals("wizard"))||(role.equals("Wizard"))){
			System.out.println("you chose wizard!");
		}
		else if((role.equals("warrior"))||(role.equals("Warrior"))){
			System.out.println("you chose warrior!");
		}
		else if((role.equals("rogue"))||(role.equals("Rogue"))){
			System.out.println("you chose rogue!");
		}
		else{
			System.out.println("you decided not to choose a role - rerun");
		}
	
		int points = 20;
		System.out.println("  ");
		System.out.println("you have 20 points to spend on 4 traits: strength, dexterity, intelligence, and charisma.");
		System.out.println("Strength (1 - 10)");
		int strength = sc.nextInt();

		if(strength > 10){
			System.out.println("please input a smaller value");
			strength = sc.nextInt();
		}
		else if(strength <= 10){
			System.out.println("great! you input " + strength + " points into strength."  );
		}
		points = points - strength;
		System.out.println(" ");
		System.out.println("you have " + points + " points remaining.");
		System.out.println(" ");
		System.out.println("Dexterity (1 - 10)");
		int dexterity = sc.nextInt();
		
		if((dexterity > 10)||(dexterity > points)){
			System.out.println("please input a smaller number");
			dexterity = sc.nextInt();
		}
		else if(dexterity <= 10){
			System.out.println("great! you input " + dexterity + " points into dexterity.");
		}
		points = (points - dexterity);
		System.out.println("you have " + points + " points remaining.");
		
		if(points == 0){
			System.out.println("you have no more points to invest.");
		}
		System.out.println(" ");
		System.out.println("Intelligence (1-10)");
		int intel = sc.nextInt();
		if((intel > 10)||(intel > points)){
			System.out.println("please input a smaller value");
			intel = sc.nextInt();
		}
		else if(intel < 0){
			System.out.println("you do not have enough points.");
		}
		else if((intel <= 10) && (intel >= 0)){
			System.out.println("great! you input " + intel +" points into intelligence.");
		}
		points = points - intel;
		if(points == 0){
			System.out.println("you have no more points to invest.");
		}
		else if(points > 0){
			System.out.println("you have " + points + " points remaining.""
		}
		System.out.println(" ");
		System.out.println("charisma (1-10)");
		int charisma = sc.nextInt();
		points = points - charisma;
		if((charisma > points)||(charisma > 10)){
			System.out.println("please input a smaller value");
			charisma = sc.nextInt();
		}
		if(points == 0){
			System.out.println("you have used up all points.");
		}
		else if(points > 0){
			System.out.println("you have " + points + " points left over.");
		}
			System.out.println("total stats for "+name +" the " + role+", "+title+":");
			System.out.println("strength:" + strength+" points");
			System.out.println("dexterity: "+dexterity+" points");
			System.out.println("intelligence: " +intel+ " points");
			System.out.println("charisma: " +charisma+ " points");
	}
}
