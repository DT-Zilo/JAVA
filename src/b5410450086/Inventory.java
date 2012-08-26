package b5410450086;

import java.util.Scanner;

public class Inventory {

	int codeitem1,codeitem2,codeitem3;
	String[] nameitem={"","",""};
	int numberitem1, numberitem2, numberitem3;

	Scanner sc = new Scanner(System.in);

	public Inventory(int code1,int code2,int code3, String item1, String item2, String item3,int numberitem1, int numberitem2, int numberitem3){

		codeitem1 = code1;
		codeitem2 = code2;
		codeitem3 = code3;
		nameitem[0] = item1;
		nameitem[1] = item2;
		nameitem[2] = item3;
		this.numberitem1 = numberitem1;
		this.numberitem2 = numberitem2;
		this.numberitem3 = numberitem3;
	}

	public void callname(){
		System.out.println("item name is:"+nameitem[0]);
		System.out.println("item name is:"+nameitem[1]);
		System.out.println("item name is:"+nameitem[2]);
	}


	public void editname(){
		String x, y, z;
		System.out.print("Enter you choose codeitem edit name:"); //������͡��Դ�Թ��ҷ�������¹����
		int i = sc.nextInt();
		if(i==1001){
			System.out.print("Enter you name:"); //�����ӹǹ�Թ���
			x = sc.next();
			this.nameitem[0] = x;
		}
		else if(i==1002){
			System.out.print("Enter you name:");
			y = sc.next();
			this.nameitem[1] = y;
		}
		else if(i==1003){
			System.out.print("Enter you name:");
			z = sc.next();
			this.nameitem[2] = z;
		}
	}

	public void additem(){
		int x = 0, y=0, z=0;
		System.out.print("Enter you choose codeitem add:"); //������͡��Դ�Թ��ҷ��������ҡ code
		int i = sc.nextInt();
		if(i==1001){
			System.out.print("Enter you number add item:"); //�����ӹǹ�Թ���
			x = sc.nextInt();
			this.numberitem1 = this.numberitem1+x;
		}
		else if(i==1002){
			System.out.print("Enter you number add item:");
			y = sc.nextInt();
			this.numberitem2 = this.numberitem2+y;
		}
		else if(i==1003){
			System.out.print("Enter you number add item:");
			z = sc.nextInt();
			this.numberitem3 = this.numberitem3+z;
		}
	}

	public void numberitem(){
		System.out.println("number of item "+nameitem[0]+" is "+this.numberitem1);
		System.out.println("number of item "+nameitem[1]+" is "+this.numberitem2);
		System.out.println("number of item "+nameitem[2]+" is "+this.numberitem3);

	}

}
