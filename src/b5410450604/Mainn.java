package b5410450604;

import java.util.Scanner;


public class Mainn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Inventory[] terr = new Inventory[3];
		for(int i = 0 ; i<3 ;i++){  
			
		System.out.print("Enter name Product "+(i+1)+" : ");
		String n ;
		n = sc.next();
		terr[i] = new Inventory(i,n);
		
		System.out.print("Edit Name Product (y/n) : "); 
		String c ;
		c = sc.next();
		if(c.equals("y")){
			System.out.print("New name :");
			String n1;
			n1 = sc.next();
			terr[i].editName(n1);
		}
		
		System.out.print("Add Number Product :"); 
		int add;
		add = sc.nextInt();
		terr[i].addProdouct(add);
		
		System.out.print("Add Product (y/n) :"); 
		String d;
		d = sc.next();
		if(d.equals("y")){
			System.out.print("Add Number Product :");
			int add1;
			add1 = sc.nextInt();
			terr[i].addProdouct(add1);
		}
		
		for(int i1=0 ; i1<3 ; i1++){ 
			
			System.out.println("Name Product "+(i1+1)+" : "+terr[i1].dooName());
			System.out.println("Code Product "+(i1+1)+" : "+terr[i1].doocode());
			System.out.println("Amount Product "+(i1+1)+" : "+terr[i1].dooProduct());
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
			
			
		}
		
	}

}
}
