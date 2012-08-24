package 200-b5310450327;

import java.util.Scanner;


public class Main {
	private static int product;
	private static Scanner sc;

	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Enter Number of Product = ");
		product = sc.nextInt();
	
		
		Inventory m = new Inventory(product);
		
		for(int i=0 ; i<product ;i++){
			m.enter(i);
			}
			m.output(product);
		
			
	}

}
