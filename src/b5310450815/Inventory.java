package b5310450815;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Scanner;


public class Inventory {
	public static void main(String[] args) {
		int barcode = 1001;
		int num = 0 ;
		String Product ="";
		for(barcode=1001 ;barcode<=1003;barcode++){
		System.out.println("Barcode : "+ barcode);
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Product : ");
		Product = in.next();
		System.out.print("Enter Number : ");
		num = in.nextInt();	
		barcode = barcode+1;
		}
		
		ccase(barcode, Product, num);
		}
	
	public static void ccase(int barcode,String product,int num){
		Scanner in = new Scanner(System.in);
		System.out.println("What you do?");
		System.out.println("1.see product");
		System.out.println("2.edit product");
		System.out.println("3.edit numproduct");
		System.out.println("4.see number of product");
		System.out.println("5.exit");
		int d = in.nextInt();
		if(d==1){
			cpro(d, product, d);
		}
		else if(d==2){
			editp();
		}
		else if(d==3){
			editnum();
		}
		else if(d==4){
			cnum();
		}
		else if(d==5){
			System.out.println("Byeee");
			System.exit(0);
		}
		}
	private static void cnum() {
		// TODO Auto-generated method stub
		
	}
	private static void editnum() {
		System.out.println("Barcode ?");
		Scanner in = new Scanner(System.in);
		int b = in.nextInt();
		
		
	}
	private static void editp() {
		System.out.println("Barcode ?");
		Scanner in = new Scanner(System.in);
		int b = in.nextInt();
		
	}
	private static void cpro(int barcode,String product,int num) {
		System.out.println(barcode+product+num);
		
	}
	}
	
