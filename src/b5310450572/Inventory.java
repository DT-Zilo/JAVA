package b5310450572;

import java.util.Scanner;

public class Inventory {
	private Scanner sc;
	private Scanner String;
	private String one; // 2 point
	private String two; 
	private String three;
	private int num1=0; // 2 point
	private int num2=0;
	private int num3=0;
	
	public void name(){ // 4.33 point
		System.out.println("Please input name : ");
		Scanner sc = new Scanner(System.in);
		one = sc.next();
		two = sc.next();
		three = sc.next();
		System.out.println("1001 : "+one);
		System.out.println("1002 : "+two);
		System.out.println("1003 : "+three);
	}
	public void delete(){ // 0 point
		System.out.println("Please new name : ");
		Scanner sc = new Scanner(System.in);
		one = sc.next();
		two = sc.next();
		three = sc.next();
		System.out.println("1001 : "+one);
		System.out.println("1002 : "+two);
		System.out.println("1003 : "+three);
	}
	public void input(){ // 0 point
		System.out.println("Input limit 1001,1002,1003 : ");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		System.out.println("1001 : "+one+num1);
		System.out.println("1002 : "+two+num2);
		System.out.println("1003 : "+three+num3);
	}
	public void total(){ // 4.33 point
		System.out.println("1001 : " +num1);
		System.out.println("1002 : " +num2);
		System.out.println("1003 : " +num3);
	}
}
