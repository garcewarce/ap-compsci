/*
 *	Author: grace lee
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int [] arr = new int [1000];
		for(int i = 0; i< arr.length; i++){
			arr[i] = (int)(Math.random()*arr.length+1);
			System.out.println(arr[i]);
		}


		
	}
}
