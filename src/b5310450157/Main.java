// Attribute        6
// Constructor      0
// Methods          13
// Main Program     15
//
// Total            34#

package b5310450157;

import java.util.Scanner;


public class Main 
{
    private static int data;
    private static Scanner sc;

    public static void main(String[] args) 
    {
        sc = new Scanner(System.in);
        System.out.print("Enter Data : ");
        data = sc.nextInt();

        Inventory in = new Inventory(data);

        for(int i=0;i<data;i++)
        {
            in.input(i);
        }

        in.resultData(data);
    }
}
