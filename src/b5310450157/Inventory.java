package b5310450157;

import java.util.Scanner;


public class Inventory {
	private Scanner sc;
	private String[] name;
	private String[] code;
	private int[] count;
	private int i=1,check;
	public Inventory(int x) {
		sc = new Scanner(System.in);
		code = new String[x];
		name = new String[x];
		count = new int[x];
	}
	
	public void getname(int x){
		System.out.println("Name Data : "+name[x]);
	}
	
	public void editname(int x){
		System.out.print("New Name of Data ["+(x+1)+"] : ");
		name[x] = sc.next();
	}
	
	public void input(int x){
		System.out.print("Code["+i+"] : ");
	    code[x] = sc.next();
	    
	    System.out.print("Name of Data["+i+"] : ");
		name[x] = sc.next();
		
		System.out.print("Number of Data["+i+"] : ");
		count[x] = sc.nextInt();
		System.out.println("You will edit number of data ?");
		System.out.println("                              1) yes.");
		System.out.println("                              2) no.");
		System.out.print("Your answer : ");
		check = sc.nextInt();
		if(check==1){
			this.editData(x);
		}
		
		i++;
		
	}
	
	public void editData(int x){
		System.out.print("New Number of Data["+(x+1)+"] : ");
		count[x] = sc.nextInt();
		
	}
	
	public void resultData(int x){
		for(int i=0;i<x;i++){
			System.out.println("Name Data["+(i+1)+"] : "+name[i]);
			System.out.println("Number of Data["+(i+1)+"] : "+count[i]);
			System.out.println();
		}
	}
	

}
