// 19

package b5410450108;

import java.util.Scanner;


public class Inventory {

	private Scanner sc;
	private int code=1001;
	private String name[]; // 2
	private int amount; // 6
	private int sum=0; // 6
	
	public Inventory(){
		sc = new Scanner(System.in);
		for(int i=0;i<=3;i++){
		System.out.println("Enter Product name");
		name[i+1] = sc.next(); // error
		System.out.println("Enter amount of Product");
		amount =sc.nextInt();
			sum = amount+sum;
			code++;
		}
		
		
		
	}
	public void Name(){ // 0
		System.out.println("Product name is "+name);
	}
	public void EditName(){ // 0
		
	}
	public void AmountPlus(){ // 5
		int change = sc.nextInt();
		amount = amount+change;
		sum = sum+change;
	}
	public void Amount(){ // 0
		System.out.println("Current amount of all product = "+sum);
	}
	
}
	

