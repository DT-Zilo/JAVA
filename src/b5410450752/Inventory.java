import java.util.Scanner;

public class Inventory {
	
	private int startcode = 1001;
	private String[] name = new String[3];
	private int[] num = new int[3];
	private String editname;
	private int a;
	
	public Scanner sc = new Scanner(System.in);
		
	public Inventory(String nameO , int j)
	{
		startcode = 1001;
		for(int i=0; i<3;i++)
		{
		name[i] = nameO;
		num[i] = j;
		}
		startcode++;
		
	}


	public void callName()
	{
		for(int i=0 ; i<3 ; i++)
		{
			System.out.println(name[i]);
		}
	} 
	
	public void editName()
	{
		System.out.print("Please choose object to edit : ");
		a = sc.nextInt();
		System.out.print("Edit name : ");
		editname = sc.next();
		name[a+1] = editname;
	}
	
	public void count(int select,int countt)
	{
		System.out.print("change : "+countt);
		num[select+1] = countt;
	}
	
	public void print()
	{
		for(int i=0 ; i<3 ; i++)
		{
			System.out.println("Name object : "+name[i] );
			System.out.println("Num of object : "+num[i] );
		}	
	}
}
