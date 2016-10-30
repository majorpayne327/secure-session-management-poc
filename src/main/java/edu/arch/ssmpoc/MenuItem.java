package edu.arch.ssmpoc;

/**
 * Created by Andy on 10/30/16../..
 */
public class MenuItem {
    public String name;
    public double price;
    public int inventory;
    public MenuItem(String name, double price, int inventory){
        this.name = name;
        this.price = price;
        this.inventory = inventory;
    }
    public int getInventory(){

        return this.inventory;
    }

}
