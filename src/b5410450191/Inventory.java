package b5410450191;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
	ArrayList<Integer> idnum = new ArrayList<Integer>();
	ArrayList<String> idname = new ArrayList<String>();
	int  product[] = {1,5,10} ;
	private int total = 16 ;
	private int n = 0 ;
	private int mem = 0 ;


	Scanner sc = new Scanner(System.in);
	private int choose;




	public void printmenu(){

		System.out.println("=============Enter you choice=============");
		System.out.println("1. Show all Product.");
		System.out.println("2. Add Product.");
		System.out.println("3. Rename Product");
		System.out.println("4. Report Product");
		System.out.println("0. Quit.");
	}

	public void printproduct(){
		System.out.println("1. Apple");
	}


	public void productdefault(){
		idname.add("Apple");
		idname.add("Banana");
		idname.add("Coconut");
		idnum.add(1001);
		idnum.add(1002);
		idnum.add(1003);
	}
	public void runmenu(){
		System.out.println("Welcome.....");

		while(true){
			printmenu();
			System.out.print("Choose  : ");
			choose = sc.nextInt();

			switch(choose){
			case 1 :check(); 

			break;

			case 2 : addproduct();
			break;

			case 3 :
				rename();
				break;

			case 4 :
				report();
				break;


			default : System.out.print("End of Program ..");
			System.exit(0);


			}
		}	
	}
	private void addproduct(){
		System.out.print("What product did you want to add  (enter 1,2,3)  ");
		n = sc.nextInt();
		switch(n){
		case 1 : System.out.print(idnum.get(0)+"  "+idname.get(0) +" add ...");
		mem = sc.nextInt();
		product[0] = product[0]+mem ;
		total = total +product[0] ;

		System.out.println(idnum.get(0)+"  "+idname.get(0)+" have " + product[0]);
		break;

		case 2 : System.out.print(idnum.get(1)+"  "+idname.get(1)+" add ...");
		mem = sc.nextInt();
		product[1] = product[1]+mem ;
		total = total +product[1] ;
		System.out.println(idnum.get(1)+"  "+idname.get(1)+" have " +product[2]);
		break;

		case 3 : System.out.print(idnum.get(2)+"  "+idname.get(2)+" add ...");
		mem = sc.nextInt();
		product[2] = product[2]+mem ;
		total = total +product[2] ;
		System.out.println(idnum.get(2)+"  "+idname.get(2)+" have " + product[2]);
		break;
		default : System.out.println("Error...");
		System.exit(0);		

		}

	}

	private void check(){
		System.out.println(idnum.get(0)+"  "+idname.get(0)+" have " + product[0]);
		System.out.println(idnum.get(1)+"  "+idname.get(1)+" have " + product[1]);
		System.out.println(idnum.get(2)+"  "+idname.get(2)+" have " + product[2]);
	}


	private void rename(){
		System.out.print("What product did you want to rename..  (enter 1,2,3) ");
		n = sc.nextInt();
		switch(n){
		case 1 : 
			idname.set(0, sc.next());
			System.out.println("You have been rename to"  +idname.get(0));
			break;

		case 2 : 
			idname.set(1, sc.next());
			System.out.println("You have been rename to"  +idname.get(1));
			break;

		case 3 : 
			idname.set(2, sc.next());
			System.out.println("You have been rename to"  +idname.get(2));
			break;
		default : System.out.println("Error...");
		System.exit(0);		

		}

	}

	private void report(){
		check();
		System.out.println("Total is : " + total);
	}




}
