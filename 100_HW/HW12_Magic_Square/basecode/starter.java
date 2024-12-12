import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many perfect squares would you liked to see?");
		int what = sc.nextInt();
		// CVMath.specialSquare(5);
		System.out.println(CVMath.findMid(2,3,1));
		int squares = 0;
		int count = 1;
		while(squares <= what){
			int sum = count*(count+1)/2;
			int root = (int)Math.sqrt(sum);
			if (root*root == sum){
				System.out.println(sum + " is a perfect square!!");
				squares++;
			}
			count++;
		}
	}
}
