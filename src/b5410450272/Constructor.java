import java.util.Scanner;


public class Constructor {

	public int codeItem;
	public String Name1,Name2,Name3;
	public int item1=0,item2=0,item3=0;
	Scanner sc = new Scanner(System.in);
	public int newitem;
	
	public void ShowName(){
		System.out.print("Enter code: ");
		codeItem=sc.nextInt();
		
		switch(codeItem){
		
		case 1001 :{ System.out.print("Code:1001,Name: ");Name1=sc.next();break;}
		case 1002 :{ System.out.print("Code:1002,Name: ");Name2=sc.next();break;}
		case 1003 :{ System.out.print("Code:1003,Name: ");Name3=sc.next();break;}
		default : { System.out.println(" =3= ");break;}
		
		}
		
	}
	
	public void Edit(){
		
		
		
	}
	
	public void Add(){
		switch(codeItem){
		
		case 1001 :{ System.out.print("Code:1,Add: ");newitem=sc.nextInt();item1=item1+newitem;
					System.out.println(Name1+" : "+item1);break;}
		
		case 1002 :{ System.out.print("Code:2,Add: ");newitem=sc.nextInt();item2=item2+newitem;
					System.out.println(Name2+" : "+item2);break;}
		
		case 1003 :{ System.out.print("Code:2,Add: ");newitem=sc.nextInt();item3=item3+newitem;
					System.out.println(Name3+" : "+item3);break;}
		
		default : { System.out.print("=3=");break;}
		
		}
			
		}
		
	
	
	public void ShowItem(){
		
		
		System.out.println(Name1+" Instock: "+item1);
		System.out.println(Name2+" Instock: "+item2);
		System.out.println(Name3+" Instock: "+item3);
		
	}
	
	
}
