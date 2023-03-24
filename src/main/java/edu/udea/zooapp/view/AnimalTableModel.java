/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udea.zooapp.view;

import edu.udea.zooapp.model.Animals;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author xaraxx
 */
public class AnimalTableModel extends AbstractTableModel {

    private List<Animals> list;
    private String[] columnNames = {"Name", "Age"};
    

    public AnimalTableModel(List<Animals> list){
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
        Animals si = list.get(rowIndex);
        switch (columnIndex) {
            case 0: 
                return si.getName();
            case 1:
                return si.getAge();
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
