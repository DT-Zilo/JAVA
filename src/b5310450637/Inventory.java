package b5310450637;

import java.util.ArrayList;
import java.util.Scanner;


public class Inventory {

	private Scanner sc;
	ArrayList<String> x = new ArrayList<String>(10); // 2 point
	public int id = 1001; // 6 point
	public int[] amount = new int [999]; // 2 point
	public String name;    


	
	

	public void Inventory(){
		for (int i =0 ;i <3 ; i++){
			System.out.println("id :"+id);
			id++;
		System.out.println("Enter product name: ");
		sc = new Scanner(System.in);
		x.add(sc.next());
		
		System.out.println("Enter amount of product: ");
		amount[i] = sc.nextInt();
		}
	}
	
	
	public void callProduct(){ // 4.33 point
			System.out.println(x.get(0));
			System.out.println(x.get(1));
			System.out.println(x.get(2));
			
		}
	
	
	public void editName(){
		
	}
	public void addAmount(){ // 0 point
		for (int i =0 ;i <3 ; i++){
		System.out.println("Enter new amount of product: ");
		amount[i] = sc.nextInt();
		}
	}
	public int amountTotal;
	public void callAmount(){ // 0 point
		amountTotal=amount[0]+amount[1]+amount[2];
		System.out.println("Total amount of product: "+ amountTotal);
	}
	public void printResult(){ // 4.33 point
		for (int i =0 ;i <3 ; i++)
		System.out.println(x.get(i)+","+amount[i]);
		
	}




}
