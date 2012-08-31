// 121

import java.util.ArrayList;
import java.util.Scanner;


public class Main {	
	public static void main(String[] args) {
		ArrayList<Inventory> in = new ArrayList<Inventory>();
		int number = 0,i;
		String name = null;
		Scanner sc = new Scanner(System.in);		
		for(i=0;i<3;i++){
			System.out.print("Enter name : ");
			name = sc.next();
			
			System.out.print("Enter number : ");
			number = sc.nextInt();
			
			in.add(new Inventory(name,number));			
		}
		
		System.out.println("Enter index  : ");
		int index = sc.nextInt();
		System.out.println("Edit number "+index);
		int number1 = sc.nextInt();
		in.get(index).setNumber(number1);
		
		for(i=0;i<3;i++){
			in.get(i).getNumber();
		}
		
	}

}
