package b5310450459;

import java.util.ArrayList;
import java.util.Scanner;


public class Inventory 
{
    private Scanner sc;
    private String name; // 6 point
    int code = 1001; // 6 point
    ArrayList<String> x = new ArrayList<String>(); 
    ArrayList<Integer> n = new ArrayList<Integer>(); // 2 point
 
    public void Constructor()
    {
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<3;i++)
        {
            System.out.print("Please enter Name: ");
            name = sc.next();
            x.add(name);
            System.out.print("Please enter Number: ");
            int num = sc.nextInt();
            n.add(num);
        }
   }
 
    public void Callname() // 4.33 point
    {
        for(int i=0;i<3;i++)
        {
            System.out.println(i+"."+x.get(i));
        }
    }
 
    public void Editname() // 4.33 point
    {
        for(int i=0;i<3;i++)
        {
            System.out.print("Please enter Editname: ");
            name = sc.next();
            x.set(i,name);
        }
    }
 
    public void Addstore() // 5 point
    {
        for(int i=0;i<3;i++)
        {
            System.out.print("Please enter Number: ");
            int num = sc.nextInt();
            n.set(i+1,num);
        }
    }

    public void Callstore() // 4.33 point
    {
        for(int i=0;i<3;i++)
        {
            System.out.print((i+1)+"."+x.get(i)+" have "+(n.get(i)+1)+"  ");
        }
    }
}
