//30

import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Inventory[] petch = new Inventory[3];
		for (int i = 0 ; i<3 ; i++)
		System.out.print("Enter your name inventory : "+ (i+1) + "  :  " );
		String n;
		n = sc.next();
		petch[i] = new Inventory(i,n);
		
		System.out.print("Edit name (yes/no) :   " );
		String o;
		o = sc.next();
		if(o.equals("yes")){
			System.out.print("New your name  :  " );
			String n1;
			n1 = sc.next();
			petch[i].setName(n1);
						
		}
		
		System.out.print("Add number :   " );
		int add;
		add = sc.nextInt();
		petch[i].setInventory(add);
		
		System.out.print("Edit number) :   " );
		String p;
		p = sc.next();
		if(p.equals("yes")){
		System.out.print("Add number : ");
		int add1;
		petch[i].setInventory(add1);
		}
		
		
		for(int i =0 ; i <3 ; i++){
			System.out.print("name ");
		}
			
	}

}