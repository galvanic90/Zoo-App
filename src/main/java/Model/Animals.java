/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author xaraxx
 */
public class Animals {
    private int code;
    private String name;
    private String scientificName;
    private float weight;
    private String gender;
    private float age;
    private String state;
    private String pedigree;
    private String psycology;
    private String origin;
    
    public Animals(){
    }

    public Animals(int code, String name, String scientificName, float weight, String gender, float age, String state, String pedigree, String psycology, String origin) {
        this.code = code;
        this.name = name;
        this.scientificName = scientificName;
        this.weight = weight;
        this.gender = gender; 
        this.age = age;
        this.state = state; 
        this.pedigree = pedigree;
        this.psycology = psycology; 
        this.origin = origin;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }

    public void setPsycology(String psycology) {
        this.psycology = psycology;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getGender() {
        return gender;
    }

    public float getAge() {
        return age;
    }

    public String getState() {
        return state;
    }

    public String getPedigree() {
        return pedigree;
    }

    public String getPsycology() {
        return psycology;
    }

    public String getOrigin() {
        return origin;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getScientificName() {
        return scientificName;
    }

    public float getWeight() {
        return weight;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Animals{");
        sb.append("code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", scientificName=").append(scientificName);
        sb.append(", weight=").append(weight);
        sb.append(", gender=").append(gender);
        sb.append(", age=").append(age);
        sb.append(", state=").append(state);
        sb.append(", pedigree=").append(pedigree);
        sb.append(", psycology=").append(psycology);
        sb.append(", origin=").append(origin);
        sb.append('}');
        return sb.toString();
    }
    
}
