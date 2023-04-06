/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udea.zooapp.view;

import edu.udea.zooapp.model.WildAnimal;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author xaraxx
 */
public class WildAnimalTableModel extends AbstractTableModel {

    private List<WildAnimal> list;
    private String[] columnNames = {"Code", "Name", "Age", "Scientific Name", "Weight", "Gender", "Status", "Pedigree", "Psycology", "Origin", "Protected Specie"};
    

    public WildAnimalTableModel(List<WildAnimal> list){
         this.list = list;
    }

    @Override
    public String getColumnName(int columnIndex){
         return columnNames[columnIndex];
    }

    @Override     
    public int getRowCount() {
        return list.size();
    }

    @Override        
    public int getColumnCount() {
        return columnNames.length; 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        WildAnimal si = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return si.getCode();
            case 1: 
                return si.getName();
            case 2:
                return si.getAge();
            case 3:
                return si.getScientificName();
            case 4: 
                return si.getWeight();
            case 5:
                return si.getGender();
            case 6:
                return si.getState();
            case 7:
                return si.getPsycology();
            case 8:
                return si.getPedigree();
            case 9:
                return si.getOrigin();
            case 10:
                return si.getProtectedSpecie();
            }
           return null;
   }

   @Override
   public Class<?> getColumnClass(int columnIndex){
          switch (columnIndex){
            case 0:
               return Integer.class;  
            case 1:
               return String.class;
            case 2:
               return Float.class;
            case 3:
                return String.class;
            case 4: 
                return Float.class;
            case 5:
                return String.class;
            case 6:
                return String.class;
            case 7:
                return String.class;
            case 8:
                return String.class;
            case 9:
                return String.class;
            case 10:
                return Boolean.class;
            }
             return null;
      }
 }
