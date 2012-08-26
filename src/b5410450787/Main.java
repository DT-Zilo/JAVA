package b5410450787;

import java.util.Scanner;


public class Main {

	
	public static void main(String[] args) {
		int h=0;
		Scanner op = new Scanner(System.in);
		Inventory gf = new Inventory();
	do{
		System.out.println("What do yo want");
		System.out.println("1.Check product name.");
		System.out.println("2.Edit product name.");
		System.out.println("3.Increase value of product.");
		System.out.println("4.Check value of product.");
		System.out.println("5.Exit program");
		h=op.nextInt();
		if(h==1){
			gf.Callname();
		}
		else if(h==2){
			gf.Editname();
		}
		else if(h==3){
			gf.Increase();
		}
		else if(h==4){
			gf.Check();
		}
		
		
	}while(h!=5);
	System.out.println("Thank you for use.");

	}

}
