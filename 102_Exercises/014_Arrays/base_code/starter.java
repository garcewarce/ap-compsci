/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr = new int[1001];
		 int a = 0;
		 while (a<arr.length){
		 	arr[a] = a*3+ 3;
		 	//(a+1)*3
		 	System.out.println(arr[a]);
		 	a++;
		 }
		 int [] arr2 = new int[1001];
		 int b = 0; 
		 while(b<arr2.length){
		 	arr2[b] = arr2.length - 1 - b;
		 	System.out.println(arr2[b]);
		 	b++;
		 	//for(int a = 0; a < ar.length; a++;);
		 }
	}
}
