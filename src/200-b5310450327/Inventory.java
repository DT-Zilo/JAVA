package 200-b5310450327;

import java.util.Scanner;


public class Inventory {
	private int[] num;
	private String[] codeProduct;
	private String[] name;
	private Scanner sc;
	private int i=1;
	private int check;
	
	public Inventory(int x){
		codeProduct = new String[x];
		name = new String[x];
		num = new int[x];
		sc = new Scanner(System.in);
		}
	
	public void Name (int x){
		System.out.println("Name : " + name[x]);
		
	}
	
	public void editName(int x){
		System.out.println("New name of Product"+(x+1)+" : ");
		name[x] = sc.next();
	}
	public void enter(int x){
		System.out.print("Code of Product"+i+" : " );
		codeProduct[x] = sc.next();
		System.out.print("Name "+i+" :  ");
		name[x] = sc.next(); 
		System.out.print("Number of Product"+i+" : ");
		num[x] = sc.nextInt(); 
		System.out.println("Do you change Number of Product?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		System.out.println("Answer");
		check = sc.nextInt();
		if (check==1){
			this.addProduct(x);
		}
		
		i++;
		
	}
	public void addProduct(int x){
		System.out.print("New Number of Product["+(x+1)+"] : ");
		num[x] = sc.nextInt();
	}
	
	public void output(int x){
		for(int i=0 ; i<x ; i++){
			System.out.println("Name of Product"+(i+1)+" : "+name[i]);
			System.out.println("Number "+(i+1)+" : "+num[i]);
			System.out.println();
			
			
		}
			
	}


	
}

