package b5310450084;

import java.util.ArrayList;
import java.util.Scanner;


public class Inventory 
{
    public ArrayList<Integer> code = new ArrayList<Integer>(); // 2 point
    public ArrayList<String> ProductName = new ArrayList<String>(); // 2 point
    public ArrayList<Integer> stock = new ArrayList<Integer>(); // 2 point
    
    Scanner sc = new Scanner(System.in);

    public Inventory(int x,String y,int z) // 10 point
    {
        this.code.add(x);
        this.ProductName.add(y);
        this.stock.add(z);
    }
    
    public void addProduct() 
    {
        code.add(1002);
        code.add(1003);
        
        for(int i=0;i<2;i++)
        {
            System.out.print("Insert your product Name :");
            ProductName.add(sc.next());
            System.out.print("Insert number of your product :");
            stock.add(sc.nextInt());
        }
    }

    public void CallProductname() // 4.333333 point
    {
        for(int i=0;i<ProductName.size();i++)
            System.out.println(code.get(i)+" "+ProductName.get(i)+" "+stock.get(i));
    }
    
    public void addStock() // 5 point
    {
        String x;
        CallProductname();
        System.out.print("Input your product code for add item stock :");
        x = sc.next();
            
        if(x.equals("1001"))
        {
            System.out.print("add :");
            stock.set(0, stock.get(0)+sc.nextInt());
        }
        else if(x.equals("1002"))
        {
            System.out.print("add :");
            stock.set(1,stock.get(1)+sc.nextInt());
        }
        else if(x.equals("1003"))
        {
            System.out.print("add :");
            stock.set(2, stock.get(2)+sc.nextInt());
        }
        else
            System.out.println("Input Incorrect");

    }
    
    public void editName() // 4.333333 point
    {
        String x;
        CallProductname();
        System.out.print("Input your product code for edit name:");
        x = sc.next();
        
        if(x.equals("1001"))
        {
            System.out.print("edit :");
            ProductName.set(0, sc.next());
        }
        else if(x.equals("1002"))
        {
            System.out.print("edit :");
            ProductName.set(1, sc.next());;
        }
        else if(x.equals("1003"))
        {
            System.out.print("edit :");
            ProductName.set(2, sc.next());
        }
        else
            System.out.println("Input Incorrect");

    }
}

