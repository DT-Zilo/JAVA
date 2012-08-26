package b5310450882;

import java.util.ArrayList;
import java.util.Scanner;


public class Inventory {
	private ArrayList<String> id;
	private String name1;
	private String name2;
	private String name3;
	private int num;
	private Scanner sc;
	private int add1;
	private int add2;
	private int add3;
	private int sum1;
	private int sum2;
	private int sum3;
	
	public Inventory(){
		this.sc = new Scanner(System.in);
		this.id = new ArrayList<String>();
		this.id.add(0,"1001");
		this.num = 3;
		this.sum1 = 0;
		this.sum2 = 0;
		this.sum3 = 0;
		
	}
		public void nameItem(){
			System.out.println("I have List : "+this.num);
			
			System.out.print("Name 1 : ");
			this.name1 = sc.next();
			
			System.out.print("Name 2 : ");
			this.name2 = sc.next();
			
			System.out.print("Name 3 : ");
			this.name3 = sc.next();
			
			}
		
		public void newName(){
			System.out.print("New Name 1 : ");
			this.name1 = sc.next();
			
			System.out.print("New Name 2 : ");
			this.name2 = sc.next();
			
			System.out.print("New Name 3 : ");
			this.name3 = sc.next();
		}
		
		public void addItem(){
			System.out.print("Do you want add Item1? : ");
			this.add1 = sc.nextInt();
			this.sum1 = this.add1;
			
			System.out.print("Do you want add Item2? : ");
			this.add2 = sc.nextInt();
			this.sum2 = this.add2;
			
			System.out.print("Do you want add Item3? : ");
			this.add3 = sc.nextInt();
			this.sum3 = this.add3;
		}
		
		public void print(){
			
			System.out.print("Name Item 1 : "+this.name1);
			System.out.println("  Item in stock : "+this.sum1);
			
			System.out.print("Name Item 2 : "+this.name2);
			System.out.println("  Item in stock : "+this.sum2);
			
			System.out.print("Name Item 3 : "+this.name3);
			System.out.println("  Item in stock : "+this.sum3);
		}
			
}
	
	

