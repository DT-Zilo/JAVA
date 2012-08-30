package product;

import java.util.Scanner;

public class Inventory {
	private int[] courseNumber;
	private String[] name;
	private int[] totalProduct;
	private Scanner sc;
	private int change;
	int choice;
	private String nameChange;
	
	public Inventory(){
		
		sc = new Scanner(System.in);
		
		int[] courseNumber = new int[3];
		String[] name = new String[3];
		int[] totalProduct = new int[3];
		courseNumber[0] = 1001;
		courseNumber[1] = 1002;
		courseNumber[2] = 1003;
		name[0] = "paper";
		name[1] = "pen";
		name[2] = "pencil";
		totalProduct[0] = 3;
		totalProduct[1] = 3;
		totalProduct[2] = 3;
		

		
		}
	public void printProduct(int choice){
		this.choice = choice;
		
	if(choice == courseNumber[0] ){
			
		System.out.println(name[0]);
			
	}
				
	else if(choice == courseNumber[1] ){
		
			
		System.out.println(name[1]);
		
	}	
			
	else if(choice == courseNumber[2] ){
					
		System.out.println(name[2]);
			
	}
	}
		
			
		
	

	public void editProduct(int choice){
		 this.choice = choice;
		switch(choice){
		
		case 1001 :
			
			System.out.print(" Please enter youe name to replace : ");
			nameChange = sc.next();
			
			name[0] = nameChange;
			
			
			break;
			
		case 1002 :
			System.out.print(" Please enter youe name to replace : ");
			nameChange = sc.next();
			
			name[1] = nameChange;
			
			break;
			
		case 1003 :
			System.out.print(" Please enter youe name to replace : ");
			nameChange = sc.next();
			
			name[2] = nameChange;
			
			break;
			
		}
		
	}
	
	
	public void setProduct(int choice){
		
		this.choice = choice;
		switch(choice){
		
		case 1001 :
			
			System.out.print("Change to ");
			change = sc.nextInt();
			
			totalProduct[0] += change;
			break;
			
		case 1002 :
			
			System.out.print("Change to ");
			change = sc.nextInt();
			
			totalProduct[1] += change;
			break;
			
		case 1003 :
			
			System.out.print("Change to ");
			change = sc.nextInt();
			
			totalProduct[2] += change;
			break;
			
			
		}
		
	}
	
	
    public void printTotalproduct(){
    	
    	System.out.println(" Product : " + name[0] + ",total :" + totalProduct[0]);
    	System.out.println(" Product : " + name[1] + ",total :" + totalProduct[1]);
    	System.out.println(" Product : " + name[2] + ",total :" + totalProduct[2]);
    	
    	
    	
    }
}
