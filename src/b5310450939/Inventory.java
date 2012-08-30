// 19

package b5310450939;


import java.util.Scanner;
import java.util.ArrayList;

public class Inventory {
	private Scanner sc;
	private int start;
	private int chnum,anum,bnum,acode;
	private String chname,aname;
	
	ArrayList<String> name = new ArrayList<String>();
	ArrayList<Integer> code = new ArrayList<Integer>();
	

	public void Constructor()
	{
		System.out.println("What number of product :");
		Scanner scan = new Scanner(System.in);
		start = scan.nextInt();
		int i=0;
		while(i<start)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("name product"+(i+1)+ ":");
			name.add(sc.next());
			code.add(1001+i);
			i++;
			
		}
		
	}
	
	public void printName()
	{
		for(int i=0;i<start;i++)
		{
			System.out.println(name.get(i));
		}
	}
	
	public void changeName()
	{
		System.out.println("What would you change number :");
		Scanner sc = new Scanner(System.in);
		chnum = sc.nextInt();
		System.out.println("What would you change name :");
		chname = sc.next();
		name.set(chnum,chname);
		
	}
	
	public void addNumber()
	{
		System.out.println("What would you add number product :");
		Scanner sc = new Scanner(System.in);
		anum = sc.nextInt();
		bnum = anum+start;
		for(int j=1;j<=anum;j++)
		{
			System.out.println("name :");
			aname =sc.next();
			name.add(start+j,aname);
			code.add(1001+start+j);
		}
	}
	public void printResult()
	{
		System.out.println("Product :");
		bnum = anum+start;
		for(int i=0;i<bnum;i++)
		{
			System.out.println(name.get(i)+"\t"+code.get(i));
		}
	}
		
	
	

}
