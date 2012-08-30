import java.util.Scanner;

public class Inventory {
	
	public Scanner sc = new Scanner(System.in);
	public Scanner xx = new Scanner(System.in);

	private String name ;
	
	public int code;
	public int i;
	public int sum = 0;
	
   public Inventory() {
	   while(true){
		   System.out.println("Enter code_product"); 
		   code= sc.nextInt();
		   System.out.println("Enter name_product"); 
		   name= xx.nextLine();
		   System.out.println("Enter count_product"); 
		   i = sc.nextInt();
		   
				
			
	   }
	   
  
	 
   }
	
   public void printResult_name(){
	   System.out.println("name_product "+name);
	   
   }
   
   public void upProduct(){
		sum=sum+i;
		System.out.println("count_product "+sum);
		
	}
	

	public void showNumber(){
		System.out.println("count_product "+i);
		
		
	}
	public void showcode(){
		System.out.println("code_product "+code); 
	}

}
