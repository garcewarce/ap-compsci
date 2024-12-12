package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	public String name;
	public int age;
	public String breed;
	
	public Dog(){
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	public Dog(String a){
		name = a;
		age = 1;
		breed = "dog dog";
	}
	public Dog(String b, String c){
		name = b;
		age = 1;
		breed = c;
	}
	public Dog(String x, int y){
		name = x;
		age = y;
		breed = "dog dog";
	}
	public void setName(String input){
		this.name = input;
	}
	public void setAge(int input2){
		this.age = input2;
	}
	public void setBreed(String input3){
		this.breed = input3;
	}
	public String getname(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	public boolean isSleeping(){
		int maybe = (int)(Math.random()*2);
		if(maybe==0){
			return true;
		}
		return false;
	}
	public void bark(){
		System.out.println(name + " barks!");
	}
}