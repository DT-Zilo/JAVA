package b5310450661;

import java.util.Scanner;
public class Inventory {
	public Scanner sc = new Scanner(System.in);
	public int code; // 6 point
	String a = new String(); 
	int i;
	int x[];
	int y;
	public String name[]; // 2 point
	public int number; // 6 point
	public Inventory(){ // 0 point
		
		for (i = 0 ; i<3 ; i++)
		{
			System.out.print("Code = ");
			x[i] = sc.nextInt();
			System.out.print("Name = ");
			name[i] = sc.next();
			System.out.print("Number = ");
			y = sc.nextInt();
		}

	}
public void name(int h) // 4.33 point
{
	System.out.println("Code =" + x[i]);
	System.out.println("Name =" + name[i]);
	System.out.println("Number =" + h);

}
public void editName()
{
	
	
}
public int addNumber(int s) // 0 point
{
	s = sc.nextInt();
	return s;

}
public int number(int t) // 0 point
{
	int sum = y-t;
	return sum;

}
}
