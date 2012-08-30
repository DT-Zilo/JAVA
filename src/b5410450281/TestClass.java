/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SCL310
 */
public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Inventory> items = new ArrayList<>();
        items.add(new Inventory(1001,"TV LED", 5));
        items.add(new Inventory(1002,"TV LCD", 10));
        items.add(new Inventory(1003,"TV PLASMA", 4));
        
        
        System.out.print("Product id : ");
        int id = sc.nextInt();
        int num;
        
        /**Search product with id**/
        for(Inventory item:items) {
            if(item.getId() == id){
                System.out.print("Add "+item.getName()+" : ");
                num = sc.nextInt();
                item.addStockWithNumber(num);
            }
        }
        
        /**Print all product**/
        for(Inventory item:items) {
            System.out.println("Name : "+item.getName()+" Stock: "+item.getNum());
        }
        
    }
   
}
