// 64

import java.util.Scanner;
public class main {
	static int choice,code,number1,number2,number3;
	static String name1,name2,name3;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Inventory a=new Inventory();
		a.inputMenu();
		a.inputnumber();
		System.out.print("Choose this\n");
		System.out.print("1.Product\n");
		System.out.print("2.fix name of product\n");
		System.out.print("3.fix number of product\n");
		System.out.print("4.See number of product\n");
		while(true){
		switch(choice){
		case 1 : a.printMenu();break;
		case 2 : a.fixname();break;
		case 3 : a.fixnumber();break;
		case 4 : a.seenumber();break;
		default : a.seeall();
				 System.exit(0);
		}
		
		}
	}
}
