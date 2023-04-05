/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udea.zooapp.model;

/**
 *
 * @author xaraxx
 */
public class DomesticAnimal extends Animals {
    private String product;

    public DomesticAnimal() {
    }

    public DomesticAnimal(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DomesticAnimal{");
        sb.append("product=").append(product);
        sb.append('}');
        return sb.toString();
    }
    
    
}
