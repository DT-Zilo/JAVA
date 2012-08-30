import java.util.ArrayList;
import java.util.Scanner;


public class Inventory {
	
	private ArrayList <String> name = new ArrayList<String>();
	private ArrayList <Integer> amount = new ArrayList<Integer>();
	private ArrayList <Integer> serial = new ArrayList<Integer>();
	
	Scanner sc = new Scanner(System.in);
	int b=1001;
	int c=0;
	public Inventory(){
		
		serial.add(b);
		
		
	}
	
	
	
	public  void callName(){
		for(String a : name){
		System.out.println(a);
		
		}
	}
	public void addAmount(int x){
		
		amount.set(c,x);
		b+=1;
		c+=1;
	}
	
	public void addItem(String a){
				
		
		name.add(a);
		serial.add(b+1);
		
		
		}
		
	
	public void showAmount(){
		
		 for(int d=0 ;d<=3;d++){
				
		System.out.println(name.get(b));
		System.out.println(amount.get(b));
	}
	 }
	
	

}
