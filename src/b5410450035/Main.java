// 14.33

import java.util.Scanner;


public class Main {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] Name = new String[3];
	    Inventory ac = new Inventory();
	    
		for(int i = 0;i<3;i++){
				ac.Additem(i);
				
				
			}
			ac.Edititem(sc.nextInt(),sc.next());
			
			ac.Showitem(int x,int y);
			
		}

	}


