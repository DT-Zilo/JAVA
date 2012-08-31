// 185

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		int code,count,i=0;
		String name,choice;
		Scanner sc = new Scanner(System.in);
		ArrayList<Inventory> IN = new ArrayList<Inventory>();
		for(i=0;i<3;i++){
			System.out.print("What is your product name : ");
			name = sc.next();
			System.out.print("How many your product : ");
			count = sc.nextInt();
			IN.add(new Inventory(name,i,count));
		}
		while(true){
			System.out.println("\n=====Menu=====\n1.Check Product\n2.Edit name\n3.Add a product\n4.Check All\n5.Quit");
			System.out.print("What do you want to do : ");
			choice = sc.next();
			if(choice.equals("5"))
				System.exit(0);
			else if(choice.equals("4")){
				for(Inventory a : IN){
					a.list();
					a.stock();
				}
				continue;
			}
			System.out.print("Enter the Number of your product : ");
			i = sc.nextInt();
			if(choice.equals("1")){
				IN.get(i-1).list();
				IN.get(i-1).stock();
			}
			else if(choice.equals("2")){
				System.out.println("Enter new name : ");
				String NN = sc.next();
				IN.get(i-1).edit(NN);
			}
			else if(choice.equals("3")){
				System.out.print("Enter how many you want to add : ");
				IN.get(i-1).add(sc.nextInt());
			}
			else
				System.out.println("Error");
		}
	}	
}
