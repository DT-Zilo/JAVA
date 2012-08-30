package junen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Inventory[] june = new Inventory[3];
		for(int i=0;i<3;i++){
			System.out.print("Enter name Product"+ (i+1)+" : ");
			String n;
			n = sc.next();
			june[i] =new Inventory(i,n);
			
			System.out.print("Edit name Product (y/n) :");
			String c;
			c = sc.next();
			if(c.equals("y")){
				System.out.print("New namme :");
				String n1;
				n1 = sc.next();
				june[i].edit(n1);
			}
			System.out.print("Add name Product :");
			int add;
			add = sc.nextInt();
			june[i].add(add);
			
			System.out.print("Add Product (y/n) :");
			String d;
			d = sc.next();
			if(c.equals("y")){
				System.out.print("Add number Product :");
				int add1;
				add1 = sc.nextInt();
				june[i].add(add);
		}
			System.out.print("*********************");
			
	}

}
