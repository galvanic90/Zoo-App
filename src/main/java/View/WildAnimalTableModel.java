/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.WildAnimal;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author xaraxx
 */
public class WildAnimalTableModel extends AbstractTableModel {

    private List<WildAnimal> list;
    private String[] columnNames = {"Name", "Age", "Scientific Name", "Weight", "Gender", "Status", "Pedigree", "Psycology", "Origin"};
    

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
                return si.getName();
            case 1:
                return si.getAge();
            case 2:
                return si.getScientificName();
            case 3: 
                return si.getWeight();
            case 4:
                return si.getGender();
            case 5:
                return si.getState();
            case 6:
                return si.getPsycology();
            case 7:
                return si.getPedigree();
            case 8:
                return si.getOrigin();
            }
           return null;
   }

   @Override
   public Class<?> getColumnClass(int columnIndex){
          switch (columnIndex){
             case 0:
               return String.class;
             case 1:
               return Float.class;
             }
             return null;
      }
 }
