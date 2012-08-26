package b5310450777;

import java.util.Scanner;


public class Inventory {
	public int code;
	public String[] myProduct = new String[3];
	public int[] howManyinthisProduct = new int[3];
	

	public Inventory() {
		Scanner sc = new Scanner(System.in);
	}
	
		public void seeName(){
			for(int i=0;i<3;i++){
			System.out.println("�Թ���: " + myProduct[i]);
				}
			}
		public void editName(){
		}
		
	public void plusOrder(){
		for(int i=0;i<3;i++){
		Scanner sc = new Scanner(System.in);
			System.out.print("Enter product: ");
			myProduct[i] = sc.next();
				this.code = 1001+i;
			System.out.print("How many: ");
		    howManyinthisProduct[i] = sc.nextInt();
		    
		}
		for(int i=0;i<3;i++){
			code=1001+i;
			System.out.println("�Թ���:" + myProduct[i]+"("+code+")" +"�������:" + howManyinthisProduct[i]+ "���");
		}
	}
			public void seeHowmany(){
				for(int i=0;i<3;i++){
					System.out.println("�������: " + howManyinthisProduct[i]);
					}
				}
			}


