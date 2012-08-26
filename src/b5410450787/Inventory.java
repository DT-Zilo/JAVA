package b5410450787;

import java.util.ArrayList;
import java.util.Scanner;


public class Inventory {

	String name;
	int i=0,j=1,k;
	
	ArrayList code = new ArrayList();
	ArrayList product = new ArrayList();
	ArrayList value = new ArrayList();
	Scanner sc = new Scanner(System.in);
	public Inventory(){
		
		while(i<=2){
			code.add(1001+i);
			System.out.print("Enter Name Produce "+j+" .");
			product.add(sc.nextLine());
			System.out.println("How many product?");
			value.add(sc.nextLine());
			i++;
			j++;
		}
	}
	public void Callname(){
		System.out.println(code.get(0)+" : "+ product.get(0));
		System.out.println(code.get(1)+" : "+ product.get(1));
		System.out.println(code.get(2)+" : "+ product.get(2));
		
	}
	public void Editname(){
		System.out.println("Enter number product you want change Name.");
		System.out.println("1."+product.get(0));
		System.out.println("2."+product.get(1));
		System.out.println("3."+product.get(2));
		j=sc.nextInt();
		System.out.println("Change "+product.get(j-1)+" to ?");
		name=sc.next();
		product.set(j-1,name);
		
	}
	public void Increase(){
		System.out.println("Enter number product you want increase value.");
		System.out.println("1."+product.get(0));
		System.out.println("2."+product.get(1));
		System.out.println("3."+product.get(2));
		j=sc.nextInt();
		System.out.println("How many product you want increase?");
		k=sc.nextInt();
		
		value.set(j-1,(int)value.get(j-1)+k);
	}
	public void Check(){
		System.out.println(product.get(0)+" has "+value.get(0));
		System.out.println(product.get(1)+" has "+value.get(1));
		System.out.println(product.get(2)+" has "+value.get(2));
	}
	
}
