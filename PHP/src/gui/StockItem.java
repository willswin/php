package gui;

/**
 * Write a description of class StockItem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

// struct, contains its name, price and unique ID
public class StockItem
{
    String name;
    float price;
    String barcode;
    int quantity;
    String category;
    Boolean obsolete;

    public StockItem(String n, float p, String id, int qu, String cat, Boolean obs)
    {
        name = n;
        price = p;
        barcode = id;
        quantity = qu;
        category = cat;
        obsolete = obs;
    }
    
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
    public String getbc() {
        return barcode;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getCategory() {
        return category;
    }
    public Boolean getObsolete() {
        return obsolete;
    }
    
    public void reduceQuantity(int sold) {
        quantity -= sold;
    }
}
