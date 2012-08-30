package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
	private int x,c,u,sum;
	private ArrayList<String> name;
	private ArrayList<Integer> id;
	private String str,str1,str2;
	private Scanner sc;
public Inventory(){
		name = new ArrayList<String>();
		id = new ArrayList<Integer>();
		int x,c=0,u,sum=0;
		String str1,str2,str;
		sc = new Scanner(System.in);
}
public void IDitem(){
		System.out.println("Enter ID item 1 : ");
		this.id.add(0,sc.nextInt());
		System.out.println("Enter ID item 2 : ");
		this.id.add(1,sc.nextInt());
		System.out.println("Enter ID item 3 : ");
		this.id.add(2,sc.nextInt());
		}

public void Nameitem(){
		System.out.println("Enter Name item 1 : ");
		this.name.add(0,sc.next());
		System.out.println("Enter Name item 2 : ");
		this.name.add(1,sc.next());
		System.out.println("Enter Name item 3 : ");
		this.name.add(2,sc.next());
		}
public void Xitem(){
		x = name.size();
		System.out.println("Your item have : "+ x);
		}

public void callitem(){
		while(x>c){
		System.out.println("Your item name is " +name.get(c));
		c++;	}
		}
public void editname(){
		System.out.println("Enter new name 1 : ");
		str = sc.next();
		System.out.println("Enter new name 2 : ");
		str1 = sc.next(); 
		System.out.println("Enter new name 3 : ");
		str2 = sc.next(); 		
		}
public void itemnew(){
		System.out.println("Enter item you wanna add : ");
		u = sc.nextInt();
		sum = x+u;
		}			
public void call(){
		System.out.println("All Item You have : "+ sum);
		}

public void Allcall(){
		System.out.println();
		System.out.println("########################################");
		System.out.println("Name your Item 1 :"+str);
		System.out.println("Name your Item 2 :"+str1);
		System.out.println("Name your Item 3 :"+str2);
		
		System.out.println("All Item You have : "+ sum);
		System.out.println("########################################");
		}
}

	



