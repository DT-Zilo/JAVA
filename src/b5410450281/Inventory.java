/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author SCL310
 */
public class Inventory {
    private  int id;
    private String name;
    private int num;

    public Inventory(int id, String name, int num) {
        this.name = name;
        this.num = num;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }
    
    /**
     * 
     * @param num number of product must greater than zero
     */
    public void setNum(int num) {
        this.num = num;
    }

    public int getId() {
        return id;
    }
    
    /**
     * 
     * @param id id of the product must begin at 1001
     */
    public int setId() {
        return id;
    }
    /**
     * 
     * @param num number of product must greater than zero
     */
    public void addStockWithNumber(int num) {
        this.num += num;
    }
}
