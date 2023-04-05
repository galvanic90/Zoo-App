/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udea.zooapp.controller;

import edu.udea.zooapp.helper.PersistenceHelper;
import edu.udea.zooapp.model.DomesticAnimal;
import edu.udea.zooapp.model.WildAnimal;
import java.util.List;

/**
 *
 * @author xaraxx
 */
public class LogisticController {
    PersistenceHelper persistence = new PersistenceHelper();
    
    List<WildAnimal> wildAnimals;
    List<DomesticAnimal> domesticAnimals;

    public LogisticController(List<WildAnimal> wildAnimals) {
        this.wildAnimals = wildAnimals;
    }
    
    public void createWildAnimal (WildAnimal wildAnimal){
        wildAnimals.add(wildAnimal);  
        persistence.save(wildAnimal, "wild-animals.json");
            
    }
    
    public List<WildAnimal> getWildAnimals() {
        return wildAnimals;
    }
    
    public void createDomesticAnimal(DomesticAnimal domesticAnimal){
        domesticAnimals.add(domesticAnimal);
        persistence.save(domesticAnimal, "domestic-animals.json");
    }
    
}
