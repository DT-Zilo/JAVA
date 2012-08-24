package 200-b5310450521;
import java.util.Scanner;
public class Inventory {
	
	int s;
	int u;
	int n;
    
public Inventory(int sum,int count,int amount){

	s = sum;
	u = count;
	n = amount;
	
	
}
public void name (String name){
	for (int k=0 ; k<3 ;k++)
		System.out.println("Name product"+name);
}

public void count (int amount){
	int n=0;
	n= n+ amount ;
	System.out.println("How many product"+amount);

	
}
public void getprint(){
	for (int k=0 ; k<3 ;k++)
		System.out.println("Please enter number ");
	 	System.out.println("Name product");
	 	System.out.println("How many product");

	
	
	
	
	
	
	
	}
	
}
	


