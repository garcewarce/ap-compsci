/*
 *	Author:  
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
		int i = 0 ;
		while(i < arr.length){
			arr[i] = (int)(Math.random()*1001+1);
			System.out.println(arr[i]);
			i++;
		}
		}
	}
