/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author xaraxx
 */
public class Food {
    private float price;
    private float quantity;
    private String storage; 
    
    public Food(){
    }

    public Food(float price, float quantity, String storage) {
        this.price = price;
        this.quantity = quantity;
        this.storage = storage;
    }

    
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Food{" + "price=" + price + ", quantity=" + quantity + ", storage=" + storage + '}';
    }
    
   
}
