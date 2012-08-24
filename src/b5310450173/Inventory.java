package b5310450173;

import java.util.Scanner;

public class Inventory {
	int a ;
	int b;
	int c;
public Inventory(int count,int number1,int sum){
	a = sum ;
	b = count;
	c = number1 ;

}
public void Name(String name){
	for(int i = 0 ; i < 3 ; i++)
		System.out.println("Name product "+name);
	}
public void Product(String name){
	System.out.print("Name Again ");
	
}
public void Count(int count){
	for(int i = 0 ; i < 3 ; i++)
		System.out.println("number "+count);
}

public void getprint(){
	for(int i = 0 ; i < 3 ; i++)
	System.out.println("number "+b);
	System.out.println("All product "+a);
	
	
}
}

