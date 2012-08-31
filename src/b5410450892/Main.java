// 169

import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Inventory[] bell = new Inventory[3];
		for(int i = 0 ; i<3 ;i++){ //ǹ�Ѻ���
			
		System.out.print("Enter name Product "+(i+1)+" : ");
		String n ;
		n = sc.next();
		bell[i] = new Inventory(i,n);
		
		System.out.print("Edit Name Product (y/n) : "); //��ͧ���������Թ����ա��� ?
		String c ;
		c = sc.next();
		if(c.equals("y")){
			System.out.print("New name :");
			String n1;
			n1 = sc.next();
			bell[i].editName(n1);
		}
		
		System.out.print("Add Number Product :"); // ����� �ӹǹ�Թ���
		int add;
		add = sc.nextInt();
		bell[i].addProdouct(add);
		
		System.out.print("Add Product (y/n) :"); //��ͧ�����������ǹ�Թ����ա��� ?
		String d;
		d = sc.next();
		if(d.equals("y")){
			System.out.print("Add Number Product :");
			int add1;
			add1 = sc.nextInt();
			bell[i].addProdouct(add1);
		}
		System.out.println("*************************************");
		}//for
		System.out.println("*********** SHOW LIST ***************");
		for(int i=0 ; i<3 ; i++){ //ǹ�ʴ����
			
			System.out.println("Name Product "+(i+1)+" : "+bell[i].dooName());
			System.out.println("Code Product "+(i+1)+" : "+bell[i].doocode());
			System.out.println("Amount Product "+(i+1)+" : "+bell[i].dooProduct());
			System.out.println("-----------------------------------------");
			
			
		}
		
	}

}
