package b5410450426;

import java.text.StringCharacterIterator;
import java.util.Scanner;


public class Inventory {



	/**
	 * @param args
	 * @param buff 
	 */
	
		
	public static void main(String[] args) {
		{
			System.out.println("please enter number of product");
			Scanner kb = new Scanner(System.in);
		    int n = kb.nextInt();
			int num[] = new int[n+1];
			num[0]=1001;
			num[1]=1002;
			num[2]=1003;

		System.out.println("please enter name of product");
		Scanner name = new Scanner(System.in);
	     String x = name.next();
			
	    
			
		}
		System.out.println("please enter choises");
		System.out.println("1=Check product");
		System.out.println("2=Edit name");
		System.out.println("3=Change number of amount");
		System.out.println("4=Check number of amount");
		Scanner kb = new Scanner(System.in);
	    int n = kb.nextInt();
	    if (n==1)
	    	System.out.println(x);
	    else if (n==2)
	    	System.out.println("please change name of product");
		Scanner name = new Scanner(System.in);
	     String x = name.next();
	    else if (n==3)
	    	System.out.println("please change number of product");
		Scanner kb = new Scanner(System.in);
	    int n = kb.nextInt();
	    else if (n==4)
	    	System.out.println(n);
	}

	
}
