/*
 *	Author:grace lee
 *  Date:11/12/24
 * 	Collaborator(s):
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] arr = new int [20];
		
		System.out.println("These are 20 random numbers!!!!!");
		
		for(int i = 0; i < arr.length; i++){
		    arr[i] = (int)((Math.random()*10)+1);
		    System.out.print(arr[i]+ " ");
		}
		
		int x = arr[(int)(Math.random()*10+1)];
		
		System.out.println(" ");
		System.out.println("the random number is " + x);
		int a = 0;
        for(int i = 0; i < arr.length; i++){
            if(x == arr[i]){
              System.out.println("duplicate found at index " + i );
              a++;
            }
        }
        
        System.out.println(a + " duplicate(s) found");
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                System.out.println("consecutive at " + i + " and " + (i+1) + " and the number is " + arr[i]);
            }
        }
	}
}
//arr[i] = (int)((Math.random()*10)+1);