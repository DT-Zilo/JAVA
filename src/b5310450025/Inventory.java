import java.util.ArrayList;
import java.util.Scanner;


public class Inventory {
	Scanner sc = new Scanner(System.in);
	ArrayList<String> name = new ArrayList<String>(); // 2
	ArrayList<Integer> key = new ArrayList<Integer>(); // 2
	ArrayList<Integer> value = new ArrayList<Integer>(); // 2
	int countkey = 1000;
	public Inventory(){ // 6
		System.out.println("How many product that u want to Input : ");
		int x = sc.nextInt();
		for(int j=0;j<x;j++){
			key.add(countkey++);
		}
		for(int i=0;i<x;i++){
		System.out.println("Product name : ");
		String nameinput = sc.next();
		name.add(nameinput);
		System.out.println("Value(Can input only Integer): ");
		int val = sc.nextInt();
		value.add(val);
							}
		
		}
	public void getProductname() { // 4.33
		System.out.println("Product Key: "+key+" Product name :"+name);
	}
	public void changeProductname() { // 4.33
			System.out.println("Product name :"+name);
			System.out.print("Choose Position [1,2,3,4,...] of Product that u wanna change :");
			int choose = sc.nextInt();
			choose = choose-1;
			name.get(choose);
			System.out.print("Input New name :");
			String newc = sc.next();
			name.set(choose, newc);
			}
	public void addmoreValue(){ // 5
		System.out.println("///Add Product Value//");
			System.out.println("Choose Position [1,2,3,4,...] of Product: "+name);
			int choosenum = sc.nextInt();
			choosenum = choosenum -1 ;
			System.out.println("How many Value you want to add more: ");
			int valuen = sc.nextInt();
			int add = value.get(choosenum);
			add = add+valuen;
			value.set(choosenum, add);
							}
			
	public void getValue(){ // 4.33
			System.out.println("Product name :"+name+" has : "+value+" ea.");}
	}


