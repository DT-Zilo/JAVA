import java.util.Scanner;


public class inventory {
	public Scanner sc;
	public int code;
	public int value;
	public String name;
	public int number;
	public int a[] = new int[3];
	public String b[] = new String[3];
	public int c[] = new int[3];
	public int list;
	public inventory(){
		sc = new Scanner(System.in);
		code = 1001;}
	public void add(){
		
		for(int i= 0;i<3;++i){
			name = sc.next();
			b[i] = name;
			value = sc.nextInt();
			a[i] = value;
			c[i] = code+i;	}
	}
		public void getname(){
			System.out.println("what unit:");
			number = sc.nextInt();
			int x = number;
			System.out.println(b[x]);
			
		}
       public void changename(){
    	   System.out.println("what unit:");
    	   number = sc.nextInt();
    	   int x = number;
    	   b[x] = name;
    	   System.out.println("new name is:"+b[x]);
    	   
       }
       public void addvalue(){
    	   System.out.println("what unit do you want to add:");
    	   number = sc.nextInt();
    	   int x = number;
    	   a[x] = a[x]+value;
    	   System.out.println("new value is:"+a[x]);
       }
       public void getvalue(){
    	   System.out.println("what unit do you want to see:");
    	   number = sc.nextInt();
    	   int x = number;
    	   System.out.println(b[x]+"value is: "+a[x]);
    	   
       }
       public void print(){
    	   for(int i=0;i<3;++i){
    		   System.out.println(b[i]+"\n"+a[i]);
    		   
    	   }
    	  
    		   
    	   }
       public void menu(){
    	   System.out.println("choose what do you want to do");
    	   System.out.println("1.Change name\n2.Add value\n3.See item value\n4.Print\n5.Exit");
    	   inventory p = new inventory();
    	   while(true){
    	   list = sc.nextInt();
    	   switch(list){
    	   case 1 : p.getname();
    	   break;
    	   case 2 : p.addvalue();
    	   break;
    	   case 3 : p.getvalue();
    	   break;
    	   case 4 : p.print();
    	   break;
    	   case 5 : System.out.println("Exit");
    	   System.exit(0);
    	   break;
    	   default : System.out.println("Error choose new");
    	   break;
    	   }
    	   }
    	   
    	   
       }
    	   
       }

