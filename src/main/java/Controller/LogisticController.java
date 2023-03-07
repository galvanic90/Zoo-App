/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Animals;
import java.util.List;

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
    
    
    public List<Animals> getAnimals() {
        return animals;
    }
    
}
