package b5410450728;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		int k=0,menu = 0;
		Inventory inven = new Inventory(k);
		Scanner sc = new Scanner(System.in);
		
		while(menu!=4){
			System.out.println("############## Product Storing ##############");
			System.out.println("1.Check all product's name and amount");
			System.out.println("2.Change product's name");
			System.out.println("3.Add product's amount");
			System.out.println("4.Exit Program");
			
			menu = sc.nextInt();
			switch(menu){
			case 1:
				inven.checkPrname();
				inven.checkAmt();
				break;
			case 2:
				inven.editPrname();
				break;
			case 3:
				inven.addAmt();
				break;
			case 4:
				break;
			
			}
			
		}
		

	}

}
