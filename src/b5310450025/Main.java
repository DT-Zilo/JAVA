import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Inventory inven = new Inventory();
		boolean r = true;
		while(r){
		System.out.println("/// Menu for ur Product //");
		System.out.println("1. GetName and Product Key");
		System.out.println("2. ChangeName");
		System.out.println("3. Add more value");
		System.out.println("4. get Value");
		System.out.println("5. Exit");
		System.out.println("//////////////////////////");
		System.out.println("Select Choice : ");
		int check = scan.nextInt();
			switch(check){
			case 1 : inven.getProductname(); break;
			case 2 : inven.changeProductname(); break;
			case 3 : inven.addmoreValue(); break;
			case 4 : inven.getValue(); break;
			case 5 : System.exit(0); break;
			default : System.out.println("Pls Input number 1-5");
			}
			System.out.println("Do Again? Yes(1) or No(2) ");
			int choice2 = scan.nextInt();
			if(choice2 == 1){
				r = true;
			if(choice2 == 2){
				r = false;
			}
			}
		}
	}
}
