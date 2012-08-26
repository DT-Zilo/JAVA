package b5310450661;

import java.util.Scanner;
public class Inventory {
	public Scanner sc = new Scanner(System.in);
	public int code;
	String a = new String();
	int i;
	int x[];
	int y;
	public String name[];
	public int number;
	public Inventory(){
		
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
public void name(int h)
{
	System.out.println("Code =" + x[i]);
	System.out.println("Name =" + name[i]);
	System.out.println("Number =" + h);

}
public void editName()
{
	
	
}
public int addNumber(int s)
{
	s = sc.nextInt();
	return s;

}
public int number(int t)
{
	int sum = y-t;
	return sum;

}
}
