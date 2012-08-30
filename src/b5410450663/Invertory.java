import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Invertory {

	public String[] name = {"","",""};
	public String[] code = {"1001","1002","1003"};
	public Array[] total = new Array[3];
	
	
	
	public void Invertory(){
		
	Scanner w = new Scanner(System.in);
	System.out.print("NameProduct1 : ");
	String np1 = w.next();
	System.out.println("CodeProduct1 : "+code[0]);
	System.out.print("TotalProduct1 : ");
	int tp1 = w.nextInt();
	
	
	
	System.out.print("NameProduct1 : ");
	String np2 = w.next();
	System.out.println("CodeProduct2 : "+code[1]);
	System.out.print("TotalProduct2 : ");
	int tp2 = w.nextInt();
	
	
	
	System.out.print("NameProduct3 : ");
	String np3 = w.next();
	System.out.println("CodeProduct3 : "+code[2]);
	System.out.print("TotalProduct3 : ");
	int tp3 = w.nextInt();
	
	
	
	}
	
	
	
	public void Choose(){
		
		
		Scanner u = new Scanner(System.in);
		Manu();
		System.out.print("What would you choose : ");
		
		int ch = u.nextInt();
		
		
			switch(ch){
			
			case 1 : {CallName();break;}

			case 2 :{ChangeName();break;}
			
			case 3 :{AddTotal();break;}
			
			case 4 :{CallProduct();break;}
			}
			
			
			
			
			
			
		}

		
		
		

		

		
		
		
		
		
	
	
	
	
	
	
	
	public void CallName(){
		System.out.println("NameProduct1 ="+name[0]);
		System.out.println("NameProduct2 ="+name[1]);
		System.out.println("NameProduct3 ="+name[2]);
		
	}
	
	
	public void ChangeName(){
		Scanner t = new Scanner(System.in);
		
		System.out.print("What product you change : ");
		int m = t.nextInt();
		int n = m-1;
		name[n] = t.next();
		
	}
	
	
	public void AddTotal(){
		Scanner t = new Scanner(System.in);
		System.out.print("What product to Addtotal : ");
		int h = t.nextInt();
		System.out.print("How many you want Add : ");

		
	}
	
	
	public void CallProduct(){
		System.out.println("TotalProduct1 ="+total[0]);
		System.out.println("TotalProduct2 ="+total[1]);
		System.out.println("TotalProduct3 ="+total[2]);
	}
	
	
	public void Manu(){
		System.out.println("Welcome to Store");
		System.out.println("What would you choose?");
		System.out.println("1. SeeNameProduct");
		System.out.println("2. ChangeNameProduct");
		System.out.println("3. AddProduct");
		System.out.println("4. SeeTotalProduct");
		System.out.println("Q. Exit");	
	}
	
	
	
	
	
}
