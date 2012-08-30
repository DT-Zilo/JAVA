// 70

import java.util.ArrayList;
import java.util.Scanner;


public class Inventory {
static int amount;
static int num2;
int seriala = 1001 ;
String name;
static String name2;
static Scanner sc = new Scanner(System.in);
static ArrayList<String> ch = new ArrayList<String>(); // 2
static ArrayList<Integer> num = new ArrayList<Integer>(); // 2
static ArrayList<Integer> id = new ArrayList<Integer>(); // 2
	/**
	 * @param args
	 */
	public static void main(String[] args) { // 40
		// TODO Auto-generated method stub
		

		new Inventory();
		while(true){
	System.out.println("###### Cataloge ###### \n# 1.Call Name Item\n# 2.Edit item\n# 3.Add item\n# 4.Call Item Amount \n# 5.Exit");
	int choice = sc.nextInt();
	switch(choice){
	case 1: callItem();break;
	case 2: reItem();break;
	case 3: addItem();break;
	case 4: checkItem();break;
	case 5: System.exit(0);break;
	}
	}
		
		
	}
	public Inventory(){	for(int i=0;i<3;i++){
		System.out.print("Item Name "+(i+1)+" :");
		name = sc.next();
		ch.add(name); 
		System.out.print("Item amount"+(i+1)+" :");
		amount = sc.nextInt();
		num.add(amount);
		id.add(seriala);
		seriala++;
		}
		
		
	}
	
	public static void callItem(){ // 4.33
		for (String a : ch)
		System.out.println(a);
	
	}
	public static void reItem(){ // 4.33
		System.out.println("which you want to edit");int i=1;
		for(String c : ch){
			System.out.println(i+". "+c);i++;}
		int b = sc.nextInt();
		switch(b){
			case 1 :System.out.print("Change Name : "); name2 = sc.next(); ch.set(0, name2);break;
			case 2 :System.out.print("Change Name : "); name2 = sc.next(); ch.set(1, name2);break;
			case 3 :System.out.print("Change Name : "); name2 = sc.next(); ch.set(2, name2);break;
		}
		/*if (id.contains(se)){
			
		}*/
	}
	public static void addItem(){ // 5
		System.out.println("which you want to edit");int i=1;
		for(String c : ch){System.out.println(i+". "+c);i++;}
		int b = sc.nextInt();
		switch(b){
		case 1 : System.out.println("Add Amount : ");num2 = sc.nextInt(); num.set(0, amount+num2);break;
		case 2 : System.out.println("Add Amount : ");num2 = sc.nextInt(); num.set(1, amount+num2);break;
		case 3 : System.out.println("Add Amount : ");num2 = sc.nextInt(); num.set(2, amount+num2);break;
	}
		
	}
	public static void checkItem(){ // 4.33
		for(int i=0;i<3;i++){
			System.out.println(id.get(i)+"\t"+ch.get(i)+"\t"+num.get(i));
		}
		
	}
}
