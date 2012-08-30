import java.util.Scanner;

public class MainInventory {

	public static void main(String[] args) {
		
		Inventory object = new Inventory(null, 0);
		Scanner sc = new Scanner(System.in); 
		int choice;
		String name[] = new String[3];
		int count[] = new int[3];
		int a,counttt;
		
		while(true)
		{
			System.out.println("--------------Menu--------------");
			System.out.println("  1. Create object ");
			System.out.println("  2. Edit object");
			System.out.println("  3. Show all objectname and object ");
			System.out.println("  4. End of program");
			System.out.println("--------------------------------");
			System.out.print("Please choose number : ");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1 : 
				{		
						for(int i = 0 ; i<3 ; i++){
						System.out.print("Please enter name : ");
						name[i] = sc.next();
						System.out.print("Please enter num of object : ");
						count[i] = sc.nextInt();
						object = new Inventory(name[i],count[i]);}
						break;
					
				}
				case 2 : 
				{	
					System.out.print("Please choose num to + : ");
					a = sc.nextInt();
					System.out.print("Change : ");
					counttt = sc.nextInt();
					object.count(a,counttt);
					break;
				}
				case 3 : 
				{	
					object.print();
					break;
				}
				case 4 : 
				{	
					System.out.print("Thank you ");
					System.exit(0);
				}
			}
			
		}

	}

}
