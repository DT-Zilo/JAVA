//Attribute: 0
//Constructor: 0
//Method: 0
//Main: 0
//
//Total: 0

package b5410450388;

import java.util.Scanner;

public class Inventory {

	private int code1,code2,code3;
	private String name1,name2,name3;
	private int stock1,stock2,stock3,x,y,z;
	private boolean check;
	private Scanner sc;
	
	public static void main(String[] args) {
		Inventory obj = new Inventory();
		obj.List();
		obj.ChangeCode();
		obj.ChangeStock();
		obj.List();
	}
	public Inventory(){
		
		this.code1 = 1001;
		this.name1 = "Pokemon";
		this.stock1 = 100; 
		this.code2 = 1002;
		this.name2 = "Digimon";
		this.stock2 = 550;
		this.code3 = 1003;
		this.name3 = "Cartoon";
		this.stock3 = 150;
	
		
		
		}
	public void List(){
		
		System.out.println("Code : "+code1+"   Name : "+name1+"  In stock : "+stock1);
		System.out.println("Code : "+code2+"   Name : "+name2+"  In stock : "+stock2);
		System.out.println("Code : "+code3+"   Name : "+name3+"  In stock : "+stock3);
	}
		public void ChangeCode(){
		Scanner sc = new Scanner(System.in);
		check = true;
		while(check){
		System.out.print("Change Name for Code(1001,1002,1003) : ");
		 x = sc.nextInt();
		if(x==1001||x==1002||x==1003)
		check = false;
			}
		
		
		switch(x){
		case 1001	:	System.out.print("Code : "+x+"   New Name : ");
					name1 = sc.next();break;
		case 1002	:	System.out.print("Code : "+x+"   New Name : ");
					name2 = sc.next();break;
		case 1003	:	System.out.print("Code : "+x+"   New Name : ");
					name3 = sc.next();break;
		default	:	break;}
		
		}
		public void ChangeStock(){
		Scanner sc = new Scanner(System.in);
		check = true;
		while(check){
		System.out.print("Change Stock for Code(1001,1002,1003) : ");
		y = sc.nextInt();
		if(y==1001||y==1002||y==1003)
			check = false;}
		
		switch(y){
		case 1001	:	System.out.print("Code : "+y+"   "+name1+" Get : ");
					z = sc.nextInt();stock1 = stock1+z;break;
		case 1002	:	System.out.print("Code : "+y+"   "+name2+" Get : ");
					z = sc.nextInt();stock2 = stock2+z;break;
		case 1003	:	System.out.print("Code : "+y+"   "+name3+" Get : ");
					z = sc.nextInt();stock3 = stock3+z;break;
		default	:	break;
		}
		
		}
		
		
	}




