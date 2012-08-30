import java.util.Scanner;


public class Inventory {
	
	private int[] courseProduct;
	private String[] nameProduct;
	private int[] totalProduct;
	private int i; 
	public Scanner sc;
	
	public Inventory() {
		
		sc = new Scanner(System.in);
		courseProduct = new int[i];
		nameProduct = new String[i];	
		totalProduct = new int[i] ;
		
		courseProduct[0] = 1001;
		courseProduct[1] = 1002;
		courseProduct[3] = 1003;	
				
		
		
		System.out.println("nameProduct :");
		
		for (i=0 ; i < 3 ;i++ ){
			
			nameProduct[i] = sc.next();
		
		System.out.println("totalProduct :");
			
			for (i=0 ; i < 3 ;i++ ){
				
				totalProduct[i] = sc.nextInt();
				
			}	
			
			
			
			
		}
        
		
	}

	
		
	
	
	
	public void getName(int i){
		
		System.out.println("Name Product :");
		
		for (i=0 ; i<3 ; i++){
			
			System.out.println(nameProduct[i]);
			
		}
	}
	
	public void editNameProduct(){
		
		System.out.println("please enter name product :");
		
		
		for (i=0 ; i<3 ; i++){
			
			nameProduct[i] = sc.next();
			
		}
		
		
		
	}
	
	public void addTotalproduct(){
		
		System.out.println("please enter total product :");
		
		
		for (i=0 ; i<3 ; i++){
			
			totalProduct[i] = sc.nextInt();
			
			totalProduct[i] += totalProduct[i];
			
		}
		
		
	}
	
	public void getTotalproduct(){
		
    for (i=0 ; i<3 ; i++){
			
			System.out.println(totalProduct[i]);
			
      }
	}
	
	public void printProduct(){
		
		System.out.println("Name Product");
		
        for (i=0 ; i<3 ; i++){
			
			System.out.print(nameProduct[i]);	
			
        }
        
        System.out.println("Total Product");
		
        for (i=0 ; i<3 ; i++){
			
			System.out.print(totalProduct[i]);
	
     
        }

        
        
        
        
	}
        
}
