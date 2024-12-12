/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        // Your Code Goes here!
        // length = 8
        int [] arr = {5, 8, 7, 8, 4, 2, 9, 1};
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        int x = 8;
        for(int i = 0; i < arr.length; i++){
            if(x == arr[i]){
                //i represents which value is the duplicate + where
            }
            System.out.println(i);
        }
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                System.out.println("consecutive at " + i + " and " + (i+1));
            }
            System.out.println("consecutive at " + i + " and " + (i+1));
        }
	}
}