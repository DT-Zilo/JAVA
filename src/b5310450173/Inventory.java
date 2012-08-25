package b5310450173;

import java.util.Scanner;

public class Inventory 
{
    int a ; // 6 point
    int b; // 6 point
    int c; // 0 point
    
    public Inventory(int count,int number1,int sum)
    {
        a = sum ; // 0 point
        b = count; // 6 point
        c = number1; // 6 point
    }
    
    public void Name(String name) // 0 point
    {
	for(int i = 0 ; i < 3 ; i++)
            System.out.println("Name product "+name);
    }
    
    public void Product(String name) // 0 point
    {
        System.out.print("Name Again ");
    }
    
    public void Count(int count) // 0 point
    {
	for(int i = 0 ; i < 3 ; i++)
            System.out.println("number "+count);
    }

    public void getprint() // 0 point
    {
	for(int i = 0 ; i < 3 ; i++)
            System.out.println("number "+b);
	
        System.out.println("All product "+a);
    }
}

