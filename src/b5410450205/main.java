package lab;

import java.util.Scanner;

public class main {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Inventory in = new Inventory();
		
	
	
		String c;
		c= in.callname();
		System.out.println("change name : "+c);
		
		in.changenum();
		in.callnum();
		
		
		
		
		
		
		
		
		
	}

}
