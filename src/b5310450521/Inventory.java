package b5310450521;

import java.util.Scanner;

public class Inventory {

    int s; // 6 point
    int u; // 6 point
    int n; 

    public Inventory(int sum, int count, int amount) // 12 point
    {

        s = sum;
        u = count;
        n = amount;


    }

    public void name(String name) // 4.33 point
    {
        for (int k = 0; k < 3; k++) {
            System.out.println("Name product" + name);
        }
    }

    public void count(int amount) // 0 point
    {
        int n = 0;
        n = n + amount;
        System.out.println("How many product" + amount);


    }

    public void getprint() // 0 point
    {
        for (int k = 0; k < 3; k++) {
            System.out.println("Please enter number ");
        }
        System.out.println("Name product");
        System.out.println("How many product");








    }
}
