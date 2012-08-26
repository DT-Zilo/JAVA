// Attribute        18
// Constructor      18
// Methods          0
// Main Program     0
//
// Total            36#

package b5310450513;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int id = 0;
        String name = null;
        int count = 0;

        Inventory z = new Inventory(id, name, count);
        z.menu();

        Inventory y = new Inventory(id, name, count);


        Scanner x = new Scanner(System.in);
        System.out.print("*** Please enter idcode : ***");
        id = x.nextInt();

        System.out.print("Are you want to buy ?: book/magazine/comic");
        name = x.next();

        System.out.print("How many count are you want ?: ");
        count = x.nextInt();


        int book = 100;
        int mag = 100;
        int comic = 100;

        y.Stock(id, count, book, mag, comic);

        y.printstock(id, name, book, mag, comic);

    }
}
