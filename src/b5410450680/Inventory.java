import java.util.Scanner;


public class Inventory {
	private Scanner sc;
	int pass = 1001;
	String[] name;
	int how;
	int x;
	public Inventory() {
		
		sc= new Scanner(System.in);
	    
		x = sc.nextInt();
		for(int i = 0;i<x;i++){
			
			name[i]  = sc.next();
		    how = sc.nextInt();
			
		
			
		}
		for(int k =0;k<x;k++){
			pass = pass+1;
					
		}
	}

	public void name(){
		for(int k = 0;k<x;k++)
			name[k] = sc.next();
		System.out.println("Name 1 " + name[0]);
		System.out.println("Name 2 " + name[1]);
		System.out.println("Name 3 " + name[2]);
				
	}
	
	public String changename(String newname,int k){
		
		newname = name[k];
		
		return newname;
		
		
	}
	
	
	
	public  void plas(){
		int j = sc.nextInt();
		
	 how = j+how;
	 
	 System.out.println("changeamourt = " + how);
	 
		
	}
	public int doohow(){
		
		return how;
	}
	public void print(){
		for(int k = 0;k<x;k++)
		System.out.println("Name"+k+"= "+ name[k]);
		System.out.println("changeamourt = "+how);
	}

	
}

