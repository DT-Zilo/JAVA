//59

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		
		String name   ;
		int number ;

		Scanner sc = new Scanner(System.in);
		
		Inventory s = null;
		Inventory s1 = null;
		Inventory s2 = null;
		System.out.print("Enter name : ");
		name = sc.next();
		System.out.print("Enter number :");
		number = sc.nextInt();
		
		s= new Inventory(name,number);
		System.out.print("Enter name : ");
		name = sc.next();
		System.out.print("Enter number :");
		number = sc.nextInt();
		
		s1= new Inventory(name,number);
		System.out.print("Enter name : ");
		name = sc.next();
		System.out.print("Enter number :");
		number = sc.nextInt();
		
		s2= new Inventory(name,number);

	s.getName();
	s.setNumber(number = sc.nextInt());
	
	s.print();
	}
	
	
	}



