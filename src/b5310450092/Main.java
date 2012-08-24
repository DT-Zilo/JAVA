package b5310450092;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Inventory[] shop = new Inventory[100];
		int i=0;
		int id=1001;
		System.out.println("+++Inventory Shop+++");
		System.out.println("1.Input Name");
		System.out.println("2.Edit Name");
		System.out.println("3.Edit Count");
		System.out.println("4.Print Inventory");
		System.out.println("5.exit");
		System.out.println("++++++++++++++++++++");
		while(true){
		String name,oldname;
		int count;
		System.out.print("Input number :");
		int cho=sc.nextInt();
		switch (cho){
		case 1:	System.out.println("+++Input Product+++");
				System.out.print("Input Product name: ");
				name = sc.next();
				System.out.print("Input Initial product: ");
				count = sc.nextInt();		
				shop[i] = new Inventory(name, count,id);
				i++;
				id++;
				System.out.println("+++++++++++++++++++");
				break;
		case 2: System.out.println("+++Edit name+++");
				System.out.print("Input old name:");
				oldname = sc.next();
				for(int j=0;j<i;j++){
					if(shop[j].outName().equals(oldname)){
						System.out.print("Input new name:");
						name = sc.next();
						shop[j].editName(name);
						break;
					}	
				
				}
				System.out.println("++++++++++++++");
				break;
		case 3: System.out.println("+++Edit Count+++");
				System.out.print("Input name: ");
				name = sc.next();
				for(int j=0;j<i;j++){
					if(shop[j].outName().equals(name)){
						System.out.print("Input add count: ");		
						shop[j].addCount(sc.nextInt());
						break;
						}
								
				}
				System.out.println("++++++++++++++++");
				break;
		case 4: System.out.println("+++Print Inventory+++");
				
				for(int j=0;j<i;j++){
				System.out.println("Product id:"+shop[j].id+" Product name:"+shop[j].outName()+" Outstanding :"+shop[j].showCount());
				}
				System.out.println("+++++++++++++++++++++");
				break;
		case 5: System.exit(0);
		
		}		
		}
				
	}		
}


