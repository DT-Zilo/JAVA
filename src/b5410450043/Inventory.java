package Tests;

import java.util.Scanner;

public class Inventory {
 
	public int[] code = new int[3],item = new int[3];
	public String[] nameItem = new String[3];
	public int number;
	Scanner sc = new Scanner(System.in);
	public Inventory(){
		code[number] = 1001;
		item[number] = 0;
	}
	
	public void add(int x){
		System.out.print("Name : ");
		nameItem[x] = sc.nextLine();
		code[x] = 1001+x;

	}
	
	public void showName(){
	 for (int i = 0; i < 3; i++) {
		 System.out.println("Name : "+nameItem[i]+" Code : "+code[i]+" Stock : "+item[i]);
		
	}
 }
	public void fixName(int i , String x){
		nameItem[i] = x;
		
	}
	public void addItem(int x,int i){
		item[i] = item[i]+x;
		
	}
	
	public void fixItem(int i , int x){
		item[i] = x;
	}
	
}
