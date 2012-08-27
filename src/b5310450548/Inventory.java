package b5310450548;

import java.util.Scanner;

public class Inventory {

    public String product1;
    public String product2; // 2 point
    public String product3;
    public int productcode1;
    public int productcode2; // 2 point
    public int productcode3;
    public int productnum1;
    public int productnum2; // 2 point
    public int productnum3;
    public int productnum1_keep;
    public int productnum2_keep;
    public int productnum3_keep;
    public int i;
    private Scanner sc;

    public Inventory() { // 6 point
        sc = new Scanner(System.in);

        System.out.println("Please insert name of product1:");
        product1 = sc.nextLine();
        System.out.println("Please insert number of product1:");
        productnum1 = sc.nextInt();
        productcode1 = 1001;

        System.out.println("Please insert name of product2:");
        product2 = sc.nextLine();
        System.out.println("Please insert number of product2:");
        productnum2 = sc.nextInt();
        productcode2 = 1002;

        System.out.println("Please insert name of product3:");
        product3 = sc.nextLine();
        System.out.println("Please insert number of product3:");
        productnum3 = sc.nextInt();
        productcode3 = 1003;

    }

    public void Callproduct() { // 4.33 point
        System.out.println("---List name of product---");
        System.out.println("1. " + product1);
        System.out.println("2. " + product2);
        System.out.println("3. " + product3);
        System.out.println("--------------------------");
    }

    public void Renameproduct() { // 4.33 point
        System.out.println("What product that you want to rename");
        i = sc.nextInt();

        switch (i) {
            case 1:
                System.out.println("Please input new name of product1");
                product1 = sc.nextLine();
                break;

            case 2:
                System.out.println("Please input new name of product2");
                product2 = sc.nextLine();
                break;

            case 3:
                System.out.println("Please input new name of product3");
                product3 = sc.nextLine();
                break;

        }
    }

    public void Plusproduct() { // 5 point
        productnum1_keep = productnum1;
        productnum2_keep = productnum2;
        productnum3_keep = productnum3;
        System.out.println("What product that you want to plus");
        i = sc.nextInt();
        switch (i) {
            case 1:
                System.out.println("Please input number that you want to plus of product1");
                productnum1 = sc.nextInt();
                productnum1 = productnum1 + productnum1_keep;
                break;

            case 2:
                System.out.println("Please input number that you want to plus of product2");
                productnum2 = sc.nextInt();
                productnum2 = productnum2 + productnum2_keep;
                break;

            case 3:
                System.out.println("Please input number that you want to plus of product3");
                productnum3 = sc.nextInt();
                productnum3 = productnum3 + productnum3_keep;
                break;

        }
    }

    public void ReportPruductNumber() { // 4.33 point
        System.out.println("----------");
        System.out.println("Number of our products is");
        {
            if (productnum1 == 1) {
                System.out.println(product1 + " have " + productnum1 + " item");
            } else if (productnum1 == 0) {
                System.out.println("No item");
            } else {
                System.out.println(product1 + " have " + productnum1 + " items");
            }
        }

        {
            if (productnum2 == 2) {
                System.out.println(product2 + " have " + productnum2 + " item");
            } else if (productnum2 == 0) {
                System.out.println(product2 + " is no item");
            } else {
                System.out.println(product2 + " have " + productnum2 + " items");
            }
        }

        {
            if (productnum3 == 1) {
                System.out.println(product3 + " have " + productnum3 + " item");
            } else if (productnum3 == 0) {
                System.out.println(product3 + " is no item");
            } else {
                System.out.println(product3 + " have " + productnum3 + " items");
            }
        }

        System.out.println("----------");
    }
}
