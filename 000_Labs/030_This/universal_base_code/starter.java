/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}
	
	public static int randAge(){
	int r = (int) (Math.random()*10);
	return r;
	}


	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf erm = new PooleDwarf();
		PooleDwarf erm1 = new PooleDwarf(randName(), randAge());
		PooleDwarf erm2 = new PooleDwarf(randName(), randAge());
		PooleDwarf erm3 = new PooleDwarf(randName(), randAge());;
		PooleDwarf erm4 = new PooleDwarf(randName(), randAge());;
		PooleDwarf erm5 = new PooleDwarf(randName(), randAge());
		PooleDwarf erm6 = new PooleDwarf(randName(), randAge());;
		PooleDwarf erm7 = new PooleDwarf(randName(), randAge());;
		System.out.println(erm1.getName());
		System.out.println(erm2.getName());
		System.out.println(erm3.getName());
		System.out.println(erm4.getName());
		System.out.println(erm5.getName());
		System.out.println(erm6.getName());
		System.out.println(erm7.getName());
		int d = 0;
		for(int i=0;i<6;i++){
		switch(i){
		case 0:
		if(erm2.isSameName(erm1.getName()))
		d++;
		break;
		case 1:
		if(erm3.isSameName(erm1.getName()))
		d++;
		break;
		case 2:
		if(erm4.isSameName(erm1.getName()))
		d++;
		break;
		case 3:
		if(erm5.isSameName(erm1.getName()))
		d++;
		break;
		case 4:
		if(erm6.isSameName(erm1.getName()))
		d++;
		break;
		case 5:
		if(erm7.isSameName(erm1.getName()))
		d++;
		break;
		}
		}
		System.out.println("\nThere are " + d + " duplicate(s), of the name " + erm1.getName());
	}
}
