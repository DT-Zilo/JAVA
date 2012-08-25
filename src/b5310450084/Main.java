// Attribute        6
// Constructor      10
// Methods          13.66
// Main Program     40
//
// Total            69.66#

package b5310450084;

import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
    {
        int z;
        String s,y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert your product name :");
        y = sc.next();
        System.out.print("Insert number of your product :");
        z = sc.nextInt();

        Inventory a = new Inventory(1001,y,z);
        a.addProduct();

        for(int i =0;i<1;)
        {
            System.out.println("1.Add item in stock");
            System.out.println("2.Edit product name");
            System.out.println("3.Print list product");
            System.out.println("4.Exit");
            System.out.print("Select your manu :");
            s = sc.next();

            if (s.equals("1"))
            {
                a.addStock();
            }
            else if (s.equals("2"))
            {
                a.editName();
            }
            else if (s.equals("3"))
            {
                a.CallProductname();
            }
            else if (s.equals("4"))
            {
                System.out.println("Bye Bye");
                i++;
            }
            else
            {
                System.out.println("Incorrect Input");
            }
        }
    }
}
