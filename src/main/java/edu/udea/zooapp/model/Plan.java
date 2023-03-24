/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udea.zooapp.model;

/**
 *
 * @author xaraxx
 */
public class Plan {
    private String name;
    private float price;
    private String durationTime;
    private String benefits;
    
    public Plan(){
    }

    public Plan(String name, float price, String durationTime, String benefits) {
        this.name = name;
        this.price = price;
        this.durationTime = durationTime;
        this.benefits = benefits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDurationTime() {
        return durationTime;
    }

    public void setDurationTime(String durationTime) {
        this.durationTime = durationTime;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    @Override
    public String toString() {
        return "Plan{" + "name=" + name + ", price=" + price + ", durationTime=" + durationTime + ", benefits=" + benefits + '}';
    }
    
    
}
