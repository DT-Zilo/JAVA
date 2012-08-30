import java.util.Scanner;


public class Inventory {
	private int  j,k,m;
	Scanner sc = new Scanner(System.in);
	String[] nameproduct = new String[3];
	Integer[] productnumber = new Integer[3];
	Integer[] howmanyproduct = new Integer[3];
	
	public Inventory(){
		
		productnumber[0] = 1001;
		howmanyproduct[0] = 0;
		nameproduct[0] = null;
		productnumber[1] = 1001+1;
		howmanyproduct[1] = 0;
		nameproduct[1] = null;
		productnumber[2] = 1001+2;
		howmanyproduct[2] = 0;
		nameproduct[2] = null;}
	
	public void getname(){
		System.out.println("== List of Product ==");
		System.out.println(productnumber[0]+". "+nameproduct[0]);
		System.out.println(productnumber[1]+". "+nameproduct[1]);
		System.out.println(productnumber[2]+". "+nameproduct[2]);
		System.out.println("=====================");
	}
	public void editName(){
		System.out.println("");
		System.out.print("Enter name of product 1 : ");
		nameproduct[0] = sc.nextLine();
		System.out.print("Enter name of product 2 : ");
		nameproduct[1] = sc.nextLine();
		System.out.print("Enter name of product 3 : ");
		nameproduct[2] = sc.nextLine();
		System.out.println("");
	}		
	public void addProduct(){
		System.out.println("");
		System.out.print("Enter number of  "+nameproduct[0]+" do you want to add : ");
		j = sc.nextInt();
		howmanyproduct[0] = howmanyproduct[0]+j;
		System.out.print("Enter number of  "+nameproduct[2]+"  do you want to add : ");
		k = sc.nextInt();
		howmanyproduct[1] = howmanyproduct[1]+k;
		System.out.print("Enter number of  "+nameproduct[0]+" do you want to add : ");
		m = sc.nextInt();
		howmanyproduct[2] = howmanyproduct[2]+m;	
		System.out.println("");
	}
	public void printNumProduct(){
		System.out.println("");
		System.out.println("Remain  "+productnumber[0]+". "+nameproduct[0]+ "  :  "  +howmanyproduct[0]);
		System.out.println("Remain  "+productnumber[0]+". "+nameproduct[1]+ "  :  "  +howmanyproduct[1]);
		System.out.println("Remain  "+productnumber[0]+". "+nameproduct[2]+ "  :  "  +howmanyproduct[2]);
		System.out.println("");
	}
	
	
		

	
}

	