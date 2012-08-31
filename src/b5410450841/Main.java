// 66

import java.util.Scanner;


public class Main {

	
	private static Scanner c;

	public static void main(String[] args) {
		Inventory v = new Inventory();
		c = new Scanner(System.in);
		int choice;
		while(true){
			v.printMenu();
			choice = c.nextInt();
			switch(choice){
			case 1 : v.nlist();
			break;
			case 2 : v.nname();
			break;
			case 3 : v.ntotal();
			break;
			case 4 : v.printtotal();
			break;
			case 5 : System.exit(0);
			}
			
		}
	}

}
