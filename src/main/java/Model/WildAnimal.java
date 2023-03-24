/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


/**
 *
 * @author xaraxx
 */
public class WildAnimal extends Animals {
    
    private String dangerousness;

    public WildAnimal() {
    }

    public WildAnimal(String dangerousness, int code, String name, String scientificName, float weight, String gender, float age, String state, String pedigree, String psycology, String origin) {
        super(code, name, scientificName, weight, gender, age, state, pedigree, psycology, origin);
        this.dangerousness = dangerousness;
    }

    public String getDangerousness() {
        return dangerousness;
    }

    public void setDangerousness(String dangerousness) {
        this.dangerousness = dangerousness;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WildAnimal{");
        sb.append("dangerousness=").append(dangerousness);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
