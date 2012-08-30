import java.util.Scanner;
public class main {

	
	public static void main(String[] args) {
		String product[] = new String[3];
		product[0] = "soap";
		product[1] = "shampoo";
		product[2] = "toothpaste";
		int num[] = new int[3];
		num[0] = 0;
		num[1] = 0;
		num[2] = 0;
		
		System.out.println("product 1 = soap");
		System.out.println("product 2 = shampoo");
		System.out.println("product 3 = toothpaste");
		int x,i;
		System.out.println("choose a product");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		Inventory in = new Inventory();
		String y;
		
		if(x==1){
			 System.out.println("1.call");
			 System.out.println("2.rename");
			 System.out.println("3.add");
			 System.out.println("4.number");
			 System.out.println("5.exit");
			 i = sc.nextInt();
			 while(i!=5){
				 
				 i = sc.nextInt();
				 if(i==1){
					 in.call(x);
				 }
				 if(i==2){
					 System.out.printf("Rename a product");
					 y = sc.nextLine();
					 in.rename(x, product, y);
				 }
				 if(i==3){
					 in.add(x, num);
				 }
				 if(i==4){
					 
				 }

			 }}

		if(x==2){
			 System.out.printf("1.call");
			 System.out.printf("2.rename");
			 System.out.printf("3.add");
			 System.out.printf("4.number");
			 System.out.printf("5.exit");
			 i = sc.nextInt();
 while(i!=5){
				 
				 i = sc.nextInt();
				 if(i==1){
					 in.call(x);
				 }
				 if(i==2){
					 System.out.printf("Rename a product");
					 y = sc.nextLine();
					 in.rename(x, product, y);
				 }
				 if(i==3){
					 in.add(x, num);
				 }
				 if(i==4){
					
				 }

			}}

		if(x==3){
			 System.out.printf("1.call");
			 System.out.printf("2.rename");
			 System.out.printf("3.add");
			 System.out.printf("4.number");
			 System.out.printf("5.exit");
			 i = sc.nextInt();
			 while(i!=5){
				 
				 i = sc.nextInt();
				 if(i==1){
					 in.call(x);
				 }
				 if(i==2){
					 System.out.printf("Rename a product");
					 y = sc.nextLine();
					 in.rename(x, product, y);
				 }
				 if(i==3){
					 in.add(x, num);
				 }
				 if(i==4){
					
				 }

		}}
		
	}}

