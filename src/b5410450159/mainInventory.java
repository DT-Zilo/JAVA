package b5410450159;

import java.util.Scanner;


public class mainInventory {
	private static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Enter list item : ");
		int n = sc.nextInt() ;
		Inventory a = new Inventory(n);
		int i ;
		for(i = 0 ; i<n ; i++){
		System.out.print("Enter Your Name Item : ");
		String nameItem = sc.next();
		a.setName(i, nameItem);
		System.out.print("Enter Your Item : ");
		int item = sc.nextInt();
		a.setItem(i, item);
		int numberItem = 1000+i ;
		a.setNumberItem(i,numberItem);
		System.out.println("Your Number Item : "+a.getNumberItem(i));
		}
		
		System.out.print("You Want Edit Name Item ? Y=1/N=0 : ");
		int p = sc.nextInt();
		if (p==1){
			System.out.print("Enter Your Number Item : ");
			int editNumberItem = sc.nextInt();
			System.out.print("Enter Edit Your Name item : ");
			String editNameItem = sc.next();
			a.editNameItem(editNumberItem,editNameItem);
		}
		else {
			System.out.println("Your Not Edit Name item");
			
		}
		
		
		System.out.print("You Want Edit item ? Y=1/N=0 : ");
		int m = sc.nextInt();
		if (m==1){
			System.out.print("Enter Your Number Item : ");
			int editNumberItem = sc.nextInt();
			System.out.print("Enter Edit Your Number item : ");
			int editItem = sc.nextInt();
			a.editItem(editNumberItem,editItem);
		}
		else {
			System.out.println("Your Not Edit item");
			
		}
		
		for(i = 0 ; i<n ; i++){
			System.out.println("Name item "+i+": "+a.getName(i));
			System.out.println("Item : "+a.getItem(i));
			System.out.println("All List item : "+n);
		}
		
		
		
		
		
	}

}
