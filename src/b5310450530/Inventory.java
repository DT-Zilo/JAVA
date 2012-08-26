package b5310450530;

import java.util.Scanner;

public class Inventory {
	 Scanner sc = new Scanner(System.in);
	 int [] code   = new int[3];
	 String[] name = new String[3];
	 int [] count = new int [40];
	public Inventory(){
		int i = 0;
		int k = 1;
		while(i<3){
			
		System.out.println("input code and name ");
		code[i] = sc.nextInt();
		name[i] = sc.next();
		i++;}
	}
		//����ª����Թ���
		public void printname() {
					int i = 0;
					while(i<3){
				System.out.println("name : " +name[i] );
				i++;
								}
		}
		//�٨ӹǹ�Թ���
		public void printstock(){
			int s;
			System.out.println("input stock");
			s = sc.nextInt();
			System.out.println("stock is "+s);
			
		}
		//�����Թ���
		public void addstock(){
			
			int i=0;
			System.out.println("add stock ");
			this.printname();
			int n = sc.nextInt();
			System.out.println("older stock");
			int s = sc.nextInt();
			switch(n){
				case 1 :System.out.println("you want add");
				if (s>count[0]){
					count[0] = count[0]+s;
				}
				else{
				count[0] = count[0]-s;
			}
				break;
			 case 2 :System.out.println("you want add");
				if (s>count[0]){
					count[1] = count[1]+s;
				}
			
			else{
				count[1] = count[1]-s;
			} break;
			 case 3 :System.out.println("you want add");
				if (s>count[0]){
					count[2] = count[2]+s;
				}
			
			else{
				count[2] = count[2]-s;
			} break;
			}			
		}
		//������Թ���
				public void changename(){
					int k = 0;
					 
					while(k<3){
						System.out.println("change name");
						String e1 = sc.next();
						name[k]= e1;
								k++;
					}
					}
					public void printall(){
						System.out.println("stock");
						int i = 0;
						System.out.println("code");
						while(i<3){
							System.out.println(name[i]+" " +code[i]+" "+count[i]);
							
							
						}
					}
				
}
		
	