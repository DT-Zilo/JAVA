package inven;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Inventory {
	int i=0;
	
	
	public void Inventory(){
		
		Scanner sc = new Scanner (System.in);
		if(i<3){
		
		while(true){
			
		
		
		
		System.out.println("Enter Namecode : ");  //รหัสสินค้า
		int code = sc.nextInt();
		
		System.out.println("Enter Name Object"); //ชื่อสินค้า
		String name = sc.next();
		
		
		System.out.println("Enter Number of : "); // จำนวนสินค้า
		int num = sc.nextInt();
		
			
		int cd1[i] = code;
		
		String nm1[i] = name;
		
		int num1[i] = num;
		
		i++;
		}
		}
		
	}
	
	public void ShowName(){
	System.out.println("your object");
	System.out.println(num1[0]+num1[1]+num1[2]);
	
	}
	
	
	private void EditName(){
		ArrayList<Integer> cd = new ArrayList<Integer>();
		ArrayList<String> nm = new ArrayList<String>();
		ArrayList<Integer> no = new ArrayList<Integer>();
		
		
		cd.remove(0);
		cd.remove(1);
		cd.remove(2);
	}
	
	
	public void AddOB(){
		
	}
		
	
	
	}

		
	
		
	
		
	
		



