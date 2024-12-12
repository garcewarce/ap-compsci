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
		int ok = (int)(Math.random()*150+51);
		int [] arr = new int[ok];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*101+1);
			if (arr[i] > max){
				max = arr[i];
			}
			if(arr[i] < min){
				min = arr[i];
			}
	}
		int avg = (min + max)/2;
		System.out.println("Your array had a size of " + ok);
		System.out.println("largest number: " + max);
		System.out.println("smallest number: " + min);
		System.out.println("average: " + avg);
		}
}
