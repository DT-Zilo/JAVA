package 200-b5310450033;

import java.util.Scanner;


public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		
			System.out.print("Number1 name : ");
			name=sc.next();
			Inventory a = new Inventory(name,3);	
			System.out.println("Name is : "+a.callname());
			a.edittotal();
			System.out.println("Total is : "+a.calltotal());
		
			
			
			System.out.print("Number2 name : ");
			name=sc.next();
			Inventory b = new Inventory(name,3);
			System.out.println("Name is : "+b.callname());
			b.edittotal();
			System.out.println("Total is : "+b.calltotal());
			
			
			
			System.out.print("Number3 name : ");
			name=sc.next();
			Inventory c = new Inventory(name,3);
			System.out.println("Name is : "+c.callname());
			c.edittotal();
			System.out.println("Total is : "+c.calltotal());
		
		
		}
		
	}


