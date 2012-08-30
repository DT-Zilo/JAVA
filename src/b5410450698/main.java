import java.util.Scanner;


public class main {

	
	public static void main(String[] args) {
		String product [] = new String[3];
		 product[0] = "Iphone";
		 product[1] = "Ipad";
		 product[2] = "Ipod";
		 
		 int num[] = new int[3];
		 num[0] = 0;
		 num[1] = 0;
		 num[2] = 0;
	
		
	System.out.println("product 1 is Iphone");
	System.out.println("product 2 is Ipad");
	System.out.println("product 3 is Ipod");
	
	int x,j;
	System.out.println("Please choose a product");
	Scanner sc = new Scanner(System.in);
	j = sc.nextInt();
	Inventory inven = new Inventory();
	String z;

	if(j == 1){
		System.out.println("call");
		System.out.println("rename");
		System.out.println("add");
		System.out.println("number");
		System.out.println("end");
		x = sc.nextInt();
		
		while (x!=5){
			x = sc.nextInt();
			if (x==1){
				inven.call(x);
			}
			if (x==2){
				System.out.println("Rename a product");
				z = sc.nextLine();
				inven.rename(x,product, z);
			}
			if (x==3){
				inven.add(x,num);
			}
			if (x==4){
				inven.call(x);
			}
			
		}
		
	}
	if(j == 2){
		System.out.println("call");
		System.out.println("rename");
		System.out.println("add");
		System.out.println("number");
		System.out.println("end");
		x = sc.nextInt();
		
		while (x!=5){
			x = sc.nextInt();
			if (x==1){
				inven.call(x);
			}
			if (x==2){
				System.out.println("Rename a product");
				z = sc.nextLine();
				inven.rename(x,product, z);
			}
			if (x==3){
				inven.add(x,num);
			}
			if (x==4){
				inven.call(x);
			}
			
		}
		
	}
	if(j == 3){
		System.out.println("call");
		System.out.println("rename");
		System.out.println("add");
		System.out.println("number");
		System.out.println("end");
		x = sc.nextInt();
		
		while (x!=5){
			x = sc.nextInt();
			if (x==1){
				inven.call(x);
			}
			if (x==2){
				System.out.println("Rename a product");
				z = sc.nextLine();
				inven.rename(x,product, z);
			}
			if (x==3){
				inven.add(x,num);
			}
			if (x==4){
				inven.call(x);
			}
			
		}
		
	}
	
	}

}
