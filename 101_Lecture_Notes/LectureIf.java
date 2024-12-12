/* 
    Lecture note example - If Statements
*/

import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You've joined the Alien Exchange Program!");
        System.out.println("Pick and alien to take in");
        System.out.println("1. Joe, a fat bellied alien who loves eating pizza");
        System.out.println("2. Bob, a blue alien who oves trees");
        System.out.println("3. Barney, a purple tailed alien who eats butter");
        
        int answer1 = sc.nextInt();
        if(answer1 == 1 ){
            System.out.println("You picked JOE! Hurray!!");
        }
        else if(answer1 == 2){
            System.out.println("You picked BOB! Hurray!!");
            
        }
        else if(answer1 == 3){
            System.out.println("You picked BARNEY! Hurray!!");
        }
        else{
            System.out.println("You get Bartholomew");
        }
        System.out.println("diddy invited you to his diddy party");
        System.out.println("Would you like to go?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int answer2 = sc.nextInt();
        if(answer2 == 1){
            System.out.println("You said yes! Diddy is SO happy!");
            System.out.println("You went to the Diddy party. you diddled a LOT");
        }
        if(answer2 == 2){
            System.out.println("You said no. Diddy got sad...");
            System.out.println("You stayed at home. Diddy came to your house and diddled.");
        }
        
	}
}