/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HardwareStore;

/**
 *
 * @author Xavier
 */
public class Tool {
    ///Atributes
    int id;
    String description;
    float price;
    int stock;
    boolean discount;

    public Tool() {
    }

    public Tool(int id, String description, float price, int stock, boolean discount) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isDiscount() {
        return discount;
    }
    public void setDiscount(boolean discount) {
        this.discount = discount;
    }
      
}
