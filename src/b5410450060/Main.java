// 20

import java.util.Scanner;


public class Main {

	
	public static void main(String[] args) {
		Inventory in = new Inventory();
		 Scanner sc = new Scanner(System.in);
		 String c;
		int choice;
			while(true){
			System.out.println("1.addItem\n2.Add amount\n3.ShowAmount\n4.exit\n");
			choice=sc.nextInt();
			switch(choice){
			case 1 :System.out.println("Type name");c=sc.nextLine();in.addItem(c);break;
			case 2 :System.out.println("How many?");choice=sc.nextInt();in.addAmount(choice);break;
			case 3:in.showAmount();break;
			
			case 4:System.exit(0);
			}}
			}
}
	


