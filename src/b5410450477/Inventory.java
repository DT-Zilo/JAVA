// Attribute        18
// Constructor      0
// Methods          0
// Main Program     0
//
// Total            18#

package b5410450477;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory 
{
    private int id; // 6 point
    private String name; // 6 point
    private int total; // 6 point
    Scanner sc = new Scanner(System.in);
    ArrayList<Inventory> a = new ArrayList<Inventory>();
    a.add(new ArrayList<Inventory>);
    
    public Inventory() // 0 point
    {
        id = 1001;
        name = "";
        total = 0;
    }	
	
    public void Menu()
    {
        System.out.println("1. New menu.");
        System.out.println("2. Show name.");
        System.out.println("3. Edit name.");
        System.out.println("4. Add menu.");
        System.out.println("5. Show menu.");
        System.out.println("6. End menu.");
    }
	
    int c= sc.nextInt();
	
    while(true)
    {
        switch(c)
        {
            case 1:
            {
                public void newMenu()
                {	
                    if(a>0)
                    {   
                        a.add(new ArrayList<Inventory>);
                        id+=1;
                        System.out.println("Name :");
                        name=sc.nextInt();
                        System.out.println("How many :");
                        total=sc.nextInt();
                    }
                    else
                    {
                        System.out.println("Name :");
                        name = sc.next();
                        System.out.println("How many :");
                        total=sc.nextInt();
                    }			
                }
            } 
            break;
        }

        case 2:
                {
                    public void showName()
                    {
                        for(Inventory n: a)
                        {
                            System.out.println("id :"+id+"name :"+name+"total :"+total);
                            id++;
                        }
                    }
                }
                break;
        case 3:
                {
                    public void editName()
                    {	
                        System.out.println("Edit name in id :");
                        id =sc.nextInt();
                        int index= id %1000-1;
                        System.out.println("New Name :");
                        a.set(index,sc.next());
                    }
                }
            break;
        case 4:
                {
                    public void addMenu()
                    {
                        System.out.println("Edit total in id :");
                        id =sc.nextInt();
                        int index= id %1000-1;
                        System.out.println("New Total :");
                        a.set(index,sc.nextInt());
                    }
                }
            break;
        case 5:
                {
                    public void showTotal()
                    {
                        System.out.println("id :"+id+"name :"+name+"total :"+total);
                    }
                }
                break;
        case 6:
                {
                    System.exit(0);
                }
    }	
}