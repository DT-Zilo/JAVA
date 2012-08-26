package b5410450728;

import java.util.Scanner;
import java.util.ArrayList;

public class Inventory {

	private static int codestart = 1001;
	ArrayList prcode = new ArrayList();
	ArrayList prname = new ArrayList();
	ArrayList pramt = new ArrayList();
	
	static int i=0;
	Scanner sc = new Scanner(System.in);
	
	
	public Inventory(int k){
		for(int y=0;y<3;y++){
		prcode.add(codestart+this.i);
		System.out.print("Enter Product Name : ");
		prname.add(sc.next());
		System.out.print("Enter "+prname.get(i)+"'s amount : ");
		pramt.add(sc.nextInt());
		this.i++;	
		
		}
	}
	
	
	public void checkPrname(){
		for(int k=0;k<i;k++){
		System.out.println("Product number : "+(k+1)+" [Code : "+prcode.get(k)+"] , Name = "+prname.get(k));
		}
		
	}
	
	public void editPrname(){
		System.out.print("Enter number of product (1-3) you want to change : ");
		int k = sc.nextInt();
		k = k-1;
		System.out.print("Enter new name : ");
		String l = sc.next();
		prname.set(k,l);
	}
	
	
	public void addAmt(){
		System.out.print("Enter number of product (1-3) you want to add amount : ");
		int g = sc.nextInt();
		g = g-1;
		System.out.print("Enter amount you want to increase : ");
		int w = sc.nextInt();
		pramt.set(g,(int)pramt.get(g)+w);
	
	}
	
	public void checkAmt(){
		for(int k=0;k<i;k++){
			System.out.println("Product number : "+(k+1)+" [Code : "+prcode.get(k)+"] , Amount = "+pramt.get(k));
			}
			
		}
	
	
	
}
