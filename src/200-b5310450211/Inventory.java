package 200-b5310450211;


import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {

	ArrayList<String> nameItem = new ArrayList<String>();
	ArrayList<Integer> valItem = new ArrayList<Integer>();
	Integer menuC,ValItemEdit,nl,menuEdit,n=1;
	Boolean b = true;
	String nameItemEdit;
	Scanner sn = new Scanner(System.in);
	int i = 0 ;
	int anl;
	int a = i ;
	

	public void inputItem(){
		while (b){
			System.out.println(":::Enter your choie :::");
			menuJa();
			menuC=sn.nextInt();
			switch (menuC) {
			case 1: 
				System.out.println("Enter name to Inventory : ");
				nameItem.add(sn.next()) ;
				System.out.println("Enter ? ea");
				valItem.add(sn.nextInt());
				System.out.println(nameItem.get(i));
				System.out.println(valItem.get(i));
				n = i+1001;
				System.out.println("Your numberItemList : " + n);
				i++;
				
			break;
				
			case 2: 
				System.out.println("numberItemList to Edit :");
				nl = sn.nextInt();
				/*System.out.println("::edit::");
				System.out.println("1.name");
				System.out.println("2.item ? ea");
					if(menuC.equals("1")){
						System.out.println("input you name item :");
						nameItemEdit = sn.next() ;
						nameItem.remove(nl);
						nameItem.add(nl,nameItemEdit);
					} else {			
						System.out.println("input you name item :");
						ValItemEdit = sn.nextInt() ;
						valItem.remove(nl);
					
					
					}*/
				
				
				
			break;
				
			case 3: System.out.println("This your List& Item Inventory");
			for(a=0;a<i;a++){
			System.out.print(nameItem.get(a));
			System.out.println("      "+valItem.get(a));
			anl = a+1001;
			System.out.println("Your numberItemList : " + anl);
			}
			System.out.println("Inventory have Item : "+i);
			break;
			
			case 4: System.out.print("bye !");
			
			b = false;
			break;

			default:
				System.out.println("You is incorrect open new java !!");
				b = false;
				break;
			} 
						
		}
			

	}
	
	public void menuJa(){
		
		System.out.println("1.inputitem");
		System.out.println("2.edit");
		System.out.println("3.list & Item Inventory");
		System.out.println("4.quit");
		
		
		
	}
	 
}
