/*
 *	Author:Grace Lee
 *  Date:9/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
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
			System.out.println("please input again - wrong input");
		}
	}
}
