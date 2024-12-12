/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		String wizname = "skib";
		Wizard [] umm = new Wizard[100];
		for(int i = 0;i<umm.length;i++){
		umm[i] = new Wizard(wizname);
		}
		
		String warriorname = "garce";
		Warrior [] skibidi = new Warrior[100];
		for(int i = 0;i<skibidi.length;i++){
		skibidi[i] = new Warrior(warriorname);
		}
		
		int wacount = 0;
		int wicount = 0;
		while(true){
		umm[wicount].attack(skibidi[wacount]);
		if(skibidi[wacount].isDead()){
		if(wacount<99) wacount++;
		}
		skibidi[wacount].attack(umm[wicount]);
		if(umm[wicount].isDead()){
		if(wicount<99) wicount++;
		}
		}
		
		if(umm[99].isDead()){
		int walives = 0;
		for(int i=0;i<skibidi.length;i++){
			if(skibidi[i].isDead()==false){
			walives++;
		}
		System.out.println("Warriors Win!\nThere are " + walives + " warriors left standing.");
		break;
		}
		}
		
		if(skibidi[99].isDead()){
		int wilives = 0;
		for(int i=0;i<umm.length;i++){
		if(umm[i].isDead()==false){
		wilives++;
		}
		}
		System.out.println("Wizards Win!\nThere are " + wilives + " wizards left standing.");
		}
	}
}
