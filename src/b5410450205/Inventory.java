package lab;


import java.util.Scanner;




public class Inventory {

	public double code;
	public String name;
	public int num;
	
	public Inventory(){
		
		code =1001;
		name ="";
		num =0;

	}
	
	public String callname(){
		String r;
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<3;i++){
			System.out.println("Please enter name ");	
			r =sc.next();
			System.out.println(r);
		}
		
		String a;
		Inventory in = new Inventory();
		a= in.changename();	
		return a;
	}
	
	public String changename(){
		
		
		String d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter change name ");	
		d = sc.next();
		
		return d;
	}
	
	public int changenum(){
		int a;
		System.out.println("Changenum ");
		Scanner sc = new Scanner(System.in);
		a =sc.nextInt();
		num += a;
		
		return num;
		
	}
	
	
	public void callnum(){
	
		
		System.out.println("Call num"+num);
		
	}
	
	
	
	
}
