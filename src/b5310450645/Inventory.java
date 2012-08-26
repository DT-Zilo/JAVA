package b5310450645;

import java.util.Scanner;


public class Inventory {

	public int[] pisePro ;
	Scanner sc = new Scanner(System.in);
	public int i=0, n=0 , m=0 ;
	public int nPise;
	public int coPro;
	String[] namPro = new String[50];
	String[] codPro = new String[4];
	String[] naPro = new String[50];
	String[] gnamPro = new String[50];
	
	
	public Inventory(){
		
		System.out.println("--Enter Detail Product--");
			while(i<3)
			{
				codPro[i]= sc.next();
				namPro[i] = sc.next();
				pisePro[i] = sc.nextInt();
				
				i++;
			}
	}
	
	public void getName(){
			i=0;
			System.out.print("Enter Number Product : ");
			gnamPro[n] = sc.next();
			
				while(i<3){
					if(gnamPro[n] == namPro[i])
						m = i;
					else	
						n=i;		
					i++;
				}		
			System.out.println(namPro[m]);
			}
	
	
	public void getEditName(){
		i=0;
		System.out.print("Enter Number Product : ");
		gnamPro[n] = sc.next();
		
				while(i<3){
					if(gnamPro[n] == namPro[i])
						namPro[i]= gnamPro[n] ;
					else	
						n=i;		
					i++;
					}			
			}
	
	public void getAddPise(){
		i=0;
		System.out.print("Enter Number Product : ");
		gnamPro[n] = sc.next();
		
		System.out.println("Enter Pise Add : ");
		nPise=sc.nextInt();
		i=0;		
		n=coPro;
		
		while(i<3){
			
			if(gnamPro[n] == namPro[i])
				pisePro[i] = pisePro[i]+nPise;
			else
				n=1;
			i++;			
				}
	}
	
	
	public void getTotal(){
		i=0;
		System.out.print("Enter Number Product : ");
		gnamPro[n] = sc.next();
		
			while(i<3){
			if(gnamPro[n] == namPro[i])
				m=i;
			else
				n=1;
			i++;			
				}
			System.out.println("Tatal Product : " + pisePro[m] );
	}
		
}

