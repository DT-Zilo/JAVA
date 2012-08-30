import java.util.Scanner;


public class Inventory {
	
	
	private int x ;
	private Scanner sc;
	public int[] code = new int[3],item = new int[3];
	String[] Name = new String[3];
	
	public  Inventory(){
		
		System.out.println("Name product 1: ");
		Name[0]=sc.next();
		System.out.println("Name product 2: ");
		Name[1]=sc.next();
		System.out.println("Name product 3: ");
		Name[2]=sc.next();
		
		for(int i = 0;i<1;i++){
	    code[i]=1001;
	    code[i+1]=code[0]+1;
	    code[i+2]=code[1]+1;
	    
		}
		System.out.println("Product= "+3);
			
		}
			
	 public void Nameitem(){
		for(int i=0;i<3;i++){
			System.out.println("Name item: " +code[i]);
		}
	 }
		
	
	public void Edititem(int x , String y){
		
		Name[x] = y;
		
	
		
		
	}
	public void Additem(int x){
		System.out.println("add item: ");
		item[x]= sc.next();
		code[x]= 1001+x;
		
		
		
		}
		
		public void Showitem(int x,int z){
			item[x] = z;
			
			
		
		
	}

	
	
		

	}


