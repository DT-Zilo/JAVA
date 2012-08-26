package b5310450483;

import java.util.Scanner;


public class Inventory 
{

    private int code; // 6 point
    private Scanner sc;
    private String name1; // 2 point
    private String name2;
    private String name3;
    private int num =  3; // 6 point
    int []namelist = new int [num];
	
    public void constructor()
    {
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<num;i++)
        {
            System.out.println("code namber "+(i+1)+":");
            code = sc.nextInt();
        }
        
        for(int i=0;i<num;i++)
        {
            System.out.println("code namber "+(i+1)+":");
            name1 = sc.next();
        }
        
        for(int i=0;i<num;i++)
        {
            System.out.println("code namber "+(i+1)+":");
            num = sc.nextInt();
        }
    }
	
    public void callname()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter "+num+" list");
        for(int i=0;i<num;i++)
        {
            System.out.print("name "+(i+1)+":");
            name1 = sc.next();
        }
    }
	
    public void edit() // 4.33 point
    {
        Scanner aa = new Scanner(System.in);
        for(int i=0;i<num;i++)
        {
            System.out.print("edit name"+(i+1)+":");
            name2 = aa.next();
        }
    }
	
    public void add() // 5 point
    {
        Scanner bb = new Scanner(System.in);
        for(int i=0;i<num;i++)
        {
            System.out.print("add name"+(i+1)+":");
            name3 = bb.next();
	}
    }
	
    public void callnum() 
    {
        System.out.println("name :"+name3+"");
    }	
}
