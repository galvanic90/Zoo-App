/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Animals;
import Model.WildAnimal;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author xaraxx
 */
public class LogisticController {
    List<Animals> animals;

    public LogisticController(List<Animals> animals) {
        this.animals = animals;
    }
    
    public void createAnimal (Animals animal){
        animals.add(animal);
    }
    
    public void createWildAnimal (WildAnimal animal){
        animals.add(animal);
        try {
            new Gson().toJson(animal, new FileWriter("salvajes.json"));
            System.out.println("Animal ");
        } catch (IOException ex) {
            Logger.getLogger(LogisticController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public List<Animals> getAnimals() {
        return animals;
    }
    
}
