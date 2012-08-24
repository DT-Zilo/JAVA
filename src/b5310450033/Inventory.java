package b5310450033;

import java.util.Scanner;


public class Inventory {
	Scanner sc = new Scanner(System.in);
	
	int[] code = new int[3] ;
	
	
	String name;
	int total ;
	
	
	public Inventory(String x,int y){
		code[0]=1001;
		this.name = x;
		this.total = y;
			for(int i=0;i<y;i++){
				code[i]= code[0]+i;
				System.out.println(code[i]);
			}
	}
	
	public String callname(){
		return this.name;
	}
	
	public String editname(){
		this.name = sc.next();
		return this.name;
	
	}
	public int edittotal(){
		int addtotal = sc.nextInt();
		this.total = this.total+addtotal;
		return this.total;

	}
	public int calltotal(){
		return this.total;
	}

	


}
