// Attribute        10
// Constructor      0
// Methods          18
// Main Program     25
//
// Total            53#

package b5310450441;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("Welcome to vending");
        lnventory c = new lnventory();
        c.printname(); 
        c.editname();
        c.Buy(); // 15 point
        c.Checkstock(); // 10 point
    }
}
