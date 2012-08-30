import java.util.ArrayList;
import java.util.Scanner;


public class Inventory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> c = new ArrayList<Integer>();
	    Scanner sc = new Scanner(System.in);
	    Constructor x = new Constructor();
	    
		b.add(1001);
		b.add(1002);
		b.add(1003);
		
		for(int i=0;i<=2;i++){
			System.out.printf("Enter Name" +b.get(i) +":" );
		String name = sc.nextLine();
			a.add(name);}
		
		for(int i=0;i<=2;i++){
			System.out.printf("Enter Num" +b.get(i) +":" );
			int num = sc.nextInt();
				c.add(num);}
		
		
		int j = 0;
		while(j!=5){
			System.out.println("Your order" );
			System.out.println("1:เรียกดูชื่อสินค้า" );
			System.out.println("2:แก้ไขชื่อสินค้า" );
			System.out.println("3:เพิ่มจำนวนสินค้า" );
			System.out.println("4:เรียกดูจำนวนสินค้า" );
			System.out.println("5:ออกจากโปรแกรม" );
			System.out.printf("Enter your do"+":" );
			int play = sc.nextInt();
		switch(play){
		case 1:
			x.name(a,b,c);
			break;
		case 2:
			x.addName(a,b,c);
			break;
		case 3:
			x.addNum(a,b,c);
			break;
		case 4:
			x.num(a,b,c);
			break;
		case 5:
			System.exit(play);
			break;
	
		}}
		

	}

}
