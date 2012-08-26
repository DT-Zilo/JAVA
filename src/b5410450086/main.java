package b5410450086;

import java.util.Scanner;

public class main {

	public static void main(String[]args){

		String nameitem1, nameitem2, nameitem3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name item 1: ");
		nameitem1 = sc.next();
		System.out.print("Enter name item 2: ");
		nameitem2 = sc.next();
		System.out.print("Enter name item 3: ");
		nameitem3 = sc.next();

		Inventory items = new Inventory(1001, 1002, 1003, nameitem1, nameitem2, nameitem3, 0, 0, 0);

		int menu;

		do{
			System.out.println("***************");
			System.out.println("1. Edit number of item");
			System.out.println("2. Call nameitem, number sum of item");
			System.out.println("3. Edit name");
			System.out.println("4. you exit program");
			System.out.print("You enter: ");
			menu = sc.nextInt();

			if(menu==1){items.additem();}
			else if(menu==2){
				items.numberitem();}
			else if(menu==3){
				items.editname();}
			else{System.out.println("you exit programe");}
		}while(menu <= 3);

	}
}
