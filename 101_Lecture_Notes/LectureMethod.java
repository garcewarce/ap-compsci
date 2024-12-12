/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        
        greeting("garce");
        greeting("chlo");
        
        double num = raise(200000.42, 5);
        System.out.println(num);
        num = raise(num, 5);
        System.out.println(num);
        num = raise(num, 5);
        System.out.println(num);
	}
	public static double raise(double salary, int percent){
	    double amount = salary + (salary*(percent/100.0));
	    return amount;
	}
	
	public static void greeting(String name){
	    System.out.println("hai " + name + " :3");
	    
	}
	
	public static void printAnimal(){
	    System.out.println(" ^ ^");
	    System.out.println("(O,O)");
	    System.out.println("(   )");
	    System.out.println("-\"-\"---dwb-");
	    
	}
	
	
}