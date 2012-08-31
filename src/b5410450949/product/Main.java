// 54

package product;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int choice;
		Inventory a = new Inventory();
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter courseNumber : ");
		choice = sc.nextInt();
		
		
		a.editProduct(choice);
		a.printProduct(choice);
		a.printTotalproduct();
		a.setProduct(choice);
		// TODO Auto-generated method stub

	}

}
