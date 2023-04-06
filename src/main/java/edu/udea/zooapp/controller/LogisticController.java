/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udea.zooapp.controller;

import com.google.gson.reflect.TypeToken;
import edu.udea.zooapp.helper.PersistenceHelper;
import edu.udea.zooapp.model.DomesticAnimal;
import edu.udea.zooapp.model.WildAnimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xaraxx
 */
public class LogisticController {
    PersistenceHelper persistence = new PersistenceHelper();
    
    List<WildAnimal> wildAnimals;
    List<DomesticAnimal> domesticAnimals;

    static final String WILD_ANIMALS_FILE = "wild-animals.json";
    static final String DOMESTIC_ANIMALS_FILE = "domestic-animals.json";

    
    public LogisticController(List<WildAnimal> wildAnimals) {
        this.wildAnimals = wildAnimals;
    }
    
    public void createWildAnimal (WildAnimal wildAnimal){
        loadWildAnimals();
        wildAnimals.add(wildAnimal);  
        persistence.save(wildAnimals, WILD_ANIMALS_FILE);
            
    }
    
    public List<WildAnimal> getWildAnimals() {
        return wildAnimals;
    }
    
    public void loadWildAnimals () {
        wildAnimals = persistence.load(WILD_ANIMALS_FILE, new TypeToken<ArrayList<WildAnimal>>() {}.getType());
    }
    
    public void createDomesticAnimal(DomesticAnimal domesticAnimal){
        domesticAnimals.add(domesticAnimal);
        persistence.save(domesticAnimal, DOMESTIC_ANIMALS_FILE);
    }
    
}
