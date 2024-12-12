/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Input a sentence");
	 String x = sc.nextLine();
	 
	 while(true){
	 	if(x.indexOf(" ") == -1){
	 		System.out.println(spongeCase(x));
	 		break;
	 	}
	 	
	 	int space = x.indexOf(" ");
	 	String word = x.substring(0, space);
	 	System.out.print(spongeCase(word) + " ");
	 	x = x.substring(space+1);
	 	}
	 }
	 public static String spongeCase(String x){
	 String result = " ";
	
	 for(int i = 0; i<x.length(); i++){
	 	String letter = x.substring(i, i+1);
	 	if(i%2 == 0){
	 		letter = x.toLowerCase();
	 		
	 	}
	 	else{
	 		letter = x.toUpperCase();
	 	}
	 	result = result + letter;
	 	}
	 	return result;
	 }
}
