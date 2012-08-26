// Attribute        12
// Constructor      12
// Methods          4.33
// Main Program     0
//
// Total            28.33#

package b5310450521;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int amount = 0;
        String name;
        int sum = 0;
        int count = 1001;
        Scanner tb = new Scanner(System.in);
        for (int k = 0; k < 3; k++) {
            System.out.println("Please enter number ");
            count = tb.nextInt();
            count = count + 1;

            System.out.println("Name product");
            name = tb.next();


            System.out.println("How many product");
            amount = tb.nextInt();
            sum = sum + amount;
        }
        Inventory a = new Inventory(count, sum, amount);
        a.getprint();

    }
}
