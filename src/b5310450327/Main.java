// Attribute        0
// Constructor      0
// Methods          0
// Main Program     0
//
// Total            0#

package b5310450327;

import java.util.Scanner;

public class Main 
{
    private static int product;
    private static Scanner sc;

    public static void main(String[] args) 
    {
        sc = new Scanner(System.in);
        System.out.print("Enter Number of Product = ");
        product = sc.nextInt();


        Inventory m = new Inventory(product);

        for(int i=0 ; i<product ;i++)
        {
            m.enter(i);
        }

        m.output(product);
    }

}
