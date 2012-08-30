import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class main {

	
	public static void main(String[] args) {
		

		
		ArrayList<Integer> code =new ArrayList<Integer>() ;
		ArrayList<String> name=new ArrayList<String>();
		ArrayList<Integer> total=new ArrayList<Integer>();
		int i;
		String j,s;
		code.add(1001);
		code.add(1002);
		code.add(1003);
		total.add((int) 0);
		total.add((int) 0);
		total.add((int) 0);
		 Scanner sc = new Scanner(System.in);
		for(i=0;i<=2;i++)
			{
		System.out.printf("Enter name code %d:",code.get(i));
		j = sc.nextLine();
		name.add(i,j);
			}
		int sa = 1;
		do{
			
		
			
		System.out.print("1.เรียกดูชื่อสินค้า \n2.แก้ไขชื่อสินค้า\n3.เพิ่มจำนวนสินค้า \n4.เรียกดูจำนวนสินค้า\n >>> :");
		int oper =sc.nextInt();
		
		if(oper==1)
		{
			System.out.print("Enter code :  ");
			 Scanner sc1 = new Scanner(System.in);
			int a =sc1.nextInt();
			  if(a==1001){
				  System.out.printf(" ชื่อสินค้า : %s\n",name.get(0));
				  
			   }
			  else if (a==1002){
				  System.out.printf(" ชื่อสินค้า : %s\n",name.get(1));
				  
			  }
			  else if (a==1003){
				  System.out.printf(" ชื่อสินค้า : %s\n",name.get(2));
				  
			  }
			  else
				  System.out.println(" ERROR :  not code ");
			  
		}
		       
		else if(oper==2) {
			System.out.print("Enter code :  ");
			 Scanner sc2 = new Scanner(System.in);
			int b=sc2.nextInt();
			  if(b==1001){
				  System.out.print("Enter new name 1001 :");
				    String k =sc2.next();
				   name.add(0,k);
				   
			   }
			  else if (b==1002){
				  System.out.print("Enter new name 1002 :");
				  String k =sc2.next();
				   name.add(1,k);
				   
			  }
			  else if (b==1003){
				  System.out.print("Enter new name 1003 :");
				  String k =sc2.next();
				   name.add(2,k);
				   
			  }
			  else
				  System.out.println(" ERROR :  not code ");			   
			  	
			  
		}
			
		else if(oper==3){ 
			System.out.print("Enter code :  ");
			 Scanner sc3 = new Scanner(System.in);
			int c=sc3.nextInt();
			  if(c==1001){
				  System.out.print("Enter price :  ");
				   int totals=sc3.nextInt();
				   total.add(0,totals);
				   System.out.println("total price :  "+total.get(0));
				   
			   }
			  else if (c==1002){
				  System.out.print("Enter price :  ");
				  int totals=sc3.nextInt();
				   total.add(1,totals);
				   System.out.println("total price :  "+total.get(1));
				   
			  }
			  else if (c==1003){
				  System.out.print("Enter price :  ");
				  int totals=sc3.nextInt();
				   total.add(2,totals);
				   System.out.println("total price :  "+total.get(2));
				   
			  }
			  else
				  System.out.println(" ERROR :  not code ");			   
			  	
		}
		else if(oper==4){  
			System.out.print("Enter code :  ");
			 Scanner sc4 = new Scanner(System.in);
			int d=sc4.nextInt();
			  if(d==1001){
				  System.out.println("All PRICE : "+total.get(0));
				   
			   }
			  else if (d==1002){
				  System.out.println("All PRICE : "+total.get(1));
				   
			  }
			  else if (d==1003){
				  System.out.println("All PRICE : "+total.get(2));
				   
			  }
			  else
				  System.out.println(" ERROR :  not code ");			   
			  	
		}
		else 
		
			 System.out.println(" ERROR!!!!!!!!!");
		
		System.out.println("##############################\n");			   

		System.out.println("1.continue : 1\n2.exit program : 0");			   
	  	sa=sc.nextInt();
	  	System.out.println("###############################\n");			 
	}while (sa==1);
		
}

	}



