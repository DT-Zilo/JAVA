import java.util.Scanner;


public class Inventory {
	Scanner sc;
	int code,number1,number2,number3,choice,choose,n1,n2,n3;
	String name1,name2,name3;
	public Inventory(){
		Scanner sc = new Scanner(System.in);
		code = 1001;
	}
		public void inputMenu(){
			System.out.print("Please input Name of product\n");
			name1=sc.next();
			name2=sc.next();
			name3=sc.next();
			
		}
		public void fixnumber(){
			System.out.print("Choose number of Product that tou want to add more");
			switch (choose){
				case 1 : n1=sc.nextInt();
						number1=number1+n1;
						break;
				case 2 : n2=sc.nextInt();
						number2=number2+n2;
						break;
				case 3 : n3=sc.nextInt();
						number3=number3+n3;
						break;
			}
		}
		public void printMenu(){
			System.out.print("All name of Product\n");
			System.out.println(name1+"\n"+name2+"\n"+name3);
		}
		
		public void fixname(){
			System.out.print("Choose number of product that you want to fix\n");
			switch (choice){
				case 1 : name1=sc.next();
						break;
				case 2 : name2=sc.next();
						break;
				case 3 : name3=sc.next();
						break;
			}
		}
		public void inputnumber(){
			System.out.print("Input number of Product\n");
			number1=sc.nextInt();
			number2=sc.nextInt();
			number3=sc.nextInt();
		}
		public void seeall(){
			System.out.println("All name and number of product\n");
			System.out.println(code +" "+name1+" : "+number1+"\n");
			System.out.println(code+1 +" "+name2+" : "+number2+"\n");
			System.out.println(code+2 +" "+name3+" : "+number3+"\n");
		}
		public void seenumber(){
			System.out.print(number1);
			System.out.print(number2);
			System.out.print(number3);
		}
}
