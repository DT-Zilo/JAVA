//Attribute: 15
//Constructor: 15
//Method: 39
//Main: 45

package b5410450329;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	private static Scanner sc;

	public static void main(String[] args){
    	sc = new Scanner(System.in);
		ArrayList<Inventory> cs = new ArrayList<Inventory>();
      	
		String name;
        
      	for(int i=1;i<=3;i++){
		 System.out.print("Input name = ");
		name = sc.next();
		cs.add(new Inventory(name, i));
      	}
      	System.out.println();
      	
      	
      	for(int i=0;i<3;i++){
   		 System.out.print("Input amount = ");
   		cs.get(i).addAmount(sc.nextInt());
			
	}
 	    
      	
      	for(int i=0;i<3;i++){
   		 System.out.println("product :  "+(i));
   		 System.out.println("Id :"+cs.get(i).getId());
   		 System.out.println("Name :  "+ cs.get(i).getName());
   		 System.out.println("Amount product is : "+ cs.get(i).getAmount());
   		 System.out.println();

			}

	
	}

}
