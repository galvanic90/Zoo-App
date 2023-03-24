/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udea.zooapp.controller;

import edu.udea.zooapp.model.Animals;
import edu.udea.zooapp.helper.PersistenceHelper;
import java.util.List;

/**
 *
 * @author xaraxx
 */
public class LogisticController {
    PersistenceHelper peristence = new PersistenceHelper();
    
    List<Animals> animals;

    public LogisticController(List<Animals> animals) {
        this.animals = animals;
    }
    
    public void createAnimal (Animals animal){
        animals.add(animal);  
        peristence.save(animals, "animals.json");
            
    }
    
    public List<Animals> getAnimals() {
        return animals;
    }
    
}
