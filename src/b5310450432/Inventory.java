package b5310450432;

import java.util.Scanner;


public class Inventory 
{
	
    Scanner sc = new Scanner(System.in);
    int code[] = new int[10]; // 2 point
    String name[]= new String[10]; // 2 point
    int all[] = new int[10]; // 2 point
    int sss[] = new int[10];
    
    public Inventory( ) // 0 point
    {	
    }

    public void kty()
    {
	int count[] = new int [10];
	for(int j=0;j<3;j++)
        {
            System.out.print("Enter code :");
            code[j] = sc.nextInt();
            System.out.print("Enter name :");
            name[j] = sc.next();
            System.out.print("all of stock:");
            all[j] = sc.nextInt();
            System.out.print("your chould:");
            sss[j] = sc.nextInt();
            count[j] = all[j]-sss[j];
	}
	
        for(int k=0;k<3;k++)
        {
            System.out.println("name ="+name[k]);
            System.out.println("instock ="+count[k]);
        }   
    }
}
