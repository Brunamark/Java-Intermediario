package entities;
/*
 * The Product class simulates a product stock in a store
 */

public class Product {

    private String name;
    private double price;
    private int quantity;


    public Product() {
        this.name = "";
        this.price = 0;
        this.quantity = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    /**
     * @return double total value in stock
     */
    public double totalValueInStock() {
        return this.price * this.quantity;
    }

    /**
     * This method add quantity in stock product
     * 
     * @param quantity
     */
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    /**
     * This method remove quantity in stock product
     * 
     * @param quantity
     */
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString(){
        return this.name
            + ", $ "
            + String.format("%.2f", this.price)
            + ", "
            + this.quantity
            + " units, Total: $ "
            + String.format("%.2f",totalValueInStock());
    }
}
