package b5410450736;

import java.util.Scanner;
public class Inventory {
	public Scanner sc;
	public int idA;
	public int idA_1;
	public int idA_2;
	public int idA_3;
	public String nameA;
	public int numberA;
	public int sum = 0;
	
	public Inventory(){
		sc = new Scanner(System.in);
		this.idA = 0;
		this.idA_1 = 1;
		this.idA_2 = 1;
		this.idA_3 = 1;
		this.nameA = "";
		this.numberA =0;	
	}
	
	public void checkA() {
		System.out.println("==== Enter idA ===");
		System.out.println("1.1001");
		System.out.println("2.1002");
		System.out.println("3.1003");
		System.out.println("============");
		this.idA= sc.nextInt();
		while(true){
			switch (idA) {
			case 1:System.out.println("Enter name1001 :");
			          this.nameA= sc.next();break;
			case 2:System.out.println("Enter name1002 :");
					  this.nameA= sc.next();break;
			case 3:System.out.println("Enter name1003 :");
	                  this.nameA= sc.next();break;
			default:
				break;
			}
			this.edit();
			}	
	}
	
	public String edit() {
		
		System.out.println("new NAme ");
		return this.nameA = sc.next();
		}
	
	public int chose() {
		sum =0;
		switch (idA) {
		case 1:System.out.println(this.idA_1+=sum);sum++;break;
		case 2:System.out.println(this.idA_1+=sum);sum++;break;
		case 3:System.out.println(this.idA_3+=sum );sum++;break;
		default:
			break;
		}
		return idA;
	}
	
	public void displayA() {
		System.out.println("Name"+this.nameA);
		System.out.println("");System.exit(0);
		
		
		
	}
}
