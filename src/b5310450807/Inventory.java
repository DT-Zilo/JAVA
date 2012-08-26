package b5310450807;

import java.util.Scanner;


public class Inventory {
	private String name;
	private int n;
	private int[]code;
	private int i=1;
	private int choice;
	private String namepair;
	private int sum ;
	private int out=99999;
	Scanner sc = new Scanner(System.in);
	
	
	public Inventory(){

	
	}
	
	public void menu(){
System.out.print("Choice1=Namesinka Choice2=Pairnamesinka Choice3=AddSinka Choice4=NumSinka :");
		
		for(i=1;i<=4;i++){
			choice = sc.nextInt();
		if(choice==1){
			nameSinka();
		}
		if(choice==2){
		    pairName();
		}
		if(choice==3){
			addSinka();
		}
		if(choice==4){
			numSinka();
		}
		else{
			System.out.println("Choice False");
		}
		System.out.println("Put choice again");
		
		}
		
	}
	public void nameSinka(){
		
		System.out.println("Put NameSinka 3 name:");
		for(i=1;i<=3;i++){
			name=sc.next();
		}
	}
	
	public void pairName(){
		System.out.println("Put NamenewSinka:");
		 namepair = sc.next();
		
	}
	
	public void addSinka(){
		System.out.println("If out loof put 99999");
		System.out.print("Put Num Sinka:");
		
		if(n<99999){
		n=sc.nextInt();
		sum=sum+n;
		
		}
		System.out.println("Sum =" + sum);
	}
	
	public void numSinka(){
		System.out.println("NumSinka= " + sum);
		addSinka();
		
	}
	

}
