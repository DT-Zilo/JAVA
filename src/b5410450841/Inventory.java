import java.util.Scanner;


public class Inventory {

	public String name1,name2,name3 ;
	public int account1,account2,account3 ; 
	public int total1,total2,total3 ;
	public Scanner sc ;
	public Inventory(){
		sc = new Scanner(System.in);
		account1 = 1001;
		account2 = 1002;
		account3 = 1003;
		System.out.print("name1 = ");
		name1 = sc.next();	
		System.out.print("name2 = ");
		name2 = sc.next();
		System.out.print("name3 = ");
		name3 = sc.next();	
		total1 = 0 ;
		total2 = 0 ;
		total3 = 0 ;
	}
	public void nlist(){
		System.out.print("1."+name1);
		System.out.println("  account = 1001");
		System.out.print("2."+name2);
		System.out.println("  account = 1002");
		System.out.print("3."+name3);
		System.out.println("  account = 1003");
	
		}
	
	
	public void nname(){
		nlist();
		System.out.println("New name 1 or 2 or 3 = ");
		int cn = sc.nextInt();
		switch(cn){
		case 1 :System.out.print("Old = "+name1+" New = ");
				name1 = sc.next();
		break;
		case 2 : System.out.print("Old = "+name2+" New = ");
				 name2 = sc.next();
		break;
		case 3 :System.out.print("Old = "+name3+" New = ");
				name3 = sc.next();
		break;
		}
	}
	
	public void ntotal(){
		System.out.print("1."+name1);
		System.out.println("  account = 1001");
		System.out.println("Total = "+total1);
		System.out.print("2."+name2);
		System.out.println("  account = 1002");
		System.out.println("Total = "+total2);
		System.out.print("3."+name3);
		System.out.println("  account = 1003");
		System.out.println("Total = "+total3);
		System.out.print("new total number = ");
		int nt = sc.nextInt();
		int q,w,e;
		switch(nt){
		case 1 :System.out.print("Old = "+total1+" New = ");
				q = sc.nextInt();
				total1 = total1 + q;
		break;
		case 2 : System.out.print("Old = "+total2+" New = ");
				w = sc.nextInt();
				total2 = total2 + w;
		break;
		case 3 :System.out.print("Old = "+total3+" New = ");
				e = sc.nextInt();
				total3 = total3 + e;
		break;
		}
	}
	
	public void printtotal(){
		System.out.print("1."+name1);
		System.out.println("  account = 1001");
		System.out.println("Total = "+total1);
		System.out.print("2."+name2);
		System.out.println("  account = 1002");
		System.out.println("Total = "+total2);
		System.out.print("3."+name3);
		System.out.println("  account = 1003");
		System.out.println("Total = "+total3);
	}
	public void printMenu(){
		System.out.println("+++++++++++Menu++++++++++");
		System.out.println("1.nlist");
		System.out.println("2.nname");
		System.out.println("3.ntotal");
		System.out.println("4.printtotal");
		System.out.println("5.End");
	}
}	