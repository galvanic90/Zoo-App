/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.udea.zooapp.view;

import edu.udea.zooapp.controller.LogisticController;
import edu.udea.zooapp.model.WildAnimal;
import javax.swing.JOptionPane;

/**
 *
 * @author xaraxx
 */
public class CreateWildAnimalPanel extends javax.swing.JPanel {

    
    LogisticController logistic;
    /**
     * Creates new form LogisticView
     */

    /**
     * Creates new form CreateAnimalPanel
     * @param logistic
     */
    public CreateWildAnimalPanel(LogisticController logistic) {
        initComponents();
        this.logistic = logistic;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        labelName = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        lableAge = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        jLabelScientName = new javax.swing.JLabel();
        inputCientifName = new javax.swing.JTextField();
        stateJLabel = new javax.swing.JLabel();
        lableGender = new javax.swing.JLabel();
        labelWeight = new javax.swing.JLabel();
        inputName1 = new javax.swing.JTextField();
        jSpinnerAge = new javax.swing.JSpinner();
        maleOpt = new javax.swing.JRadioButton();
        femaleOpt = new javax.swing.JRadioButton();
        stateJComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPanePedigree = new javax.swing.JTextPane();
        pedigreeJLabel = new javax.swing.JLabel();
        jTextFieldOrigin = new javax.swing.JTextField();
        jLabelOrgini = new javax.swing.JLabel();
        jComboBoxDangerousness = new javax.swing.JComboBox<>();
        jLabelDangerousness = new javax.swing.JLabel();
        jLabelPsycology = new javax.swing.JLabel();
        jTextFieldPsycology = new javax.swing.JTextField();

        labelName.setText("Nombre");

        lableAge.setText("Edad");

        btnCreate.setText("Crear");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabelScientName.setText("Nombre Científico. ");

        stateJLabel.setText("Estado ");

        lableGender.setText("Género");

        labelWeight.setText("Peso");

        genderButtonGroup.add(maleOpt);
        maleOpt.setText("Macho");

        genderButtonGroup.add(femaleOpt);
        femaleOpt.setText("Hembra");

        stateJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Embarazo", "Enfermedad", "Discapacidad", "Saludable", "Óptimo", " " }));
        stateJComboBox.setPreferredSize(new java.awt.Dimension(64, 24));

        jTextPanePedigree.setPreferredSize(new java.awt.Dimension(64, 24));
        jScrollPane1.setViewportView(jTextPanePedigree);

        pedigreeJLabel.setText("Pedigree");

        jLabelOrgini.setText("Orígen");

        jComboBoxDangerousness.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Extremo", "Alto", "Medio", "Bajo" }));
        jComboBoxDangerousness.setPreferredSize(new java.awt.Dimension(64, 24));

        jLabelDangerousness.setText("Nivel de Peligrosidad");

        jLabelPsycology.setText("Sicología");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPsycology)
                                .addGap(175, 175, 175)
                                .addComponent(jTextFieldPsycology))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDangerousness)
                                .addGap(99, 99, 99)
                                .addComponent(jComboBoxDangerousness, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelOrgini)
                                .addGap(190, 190, 190)
                                .addComponent(jTextFieldOrigin))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pedigreeJLabel)
                                .addGap(176, 176, 176)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lableAge)
                                    .addComponent(labelName)
                                    .addComponent(jLabelScientName))
                                .addGap(110, 110, 110)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputCientifName)
                                    .addComponent(inputName)
                                    .addComponent(jSpinnerAge)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lableGender)
                                    .addComponent(labelWeight))
                                .addGap(186, 186, 186)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputName1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(maleOpt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                                        .addComponent(femaleOpt))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(stateJLabel)
                                .addGap(184, 184, 184)
                                .addComponent(stateJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(labelName))
                    .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lableAge))
                    .addComponent(jSpinnerAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelScientName)
                    .addComponent(inputCientifName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelWeight)
                    .addComponent(inputName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lableGender))
                    .addComponent(maleOpt)
                    .addComponent(femaleOpt))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(stateJLabel))
                    .addComponent(stateJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pedigreeJLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelOrgini)
                    .addComponent(jTextFieldOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDangerousness)
                    .addComponent(jComboBoxDangerousness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPsycology, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPsycology))
                .addGap(6, 6, 6)
                .addComponent(btnCreate))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        WildAnimal wildAnimal = new WildAnimal();
        wildAnimal.setName(inputName.getText());
        wildAnimal.setAge(Float.parseFloat(jSpinnerAge.getValue().toString()));
        wildAnimal.setState(stateJComboBox.getSelectedItem().toString());
        wildAnimal.setPedigree(jTextPanePedigree.getText());
        wildAnimal.setPsycology(jTextFieldPsycology.getText());
        wildAnimal.setOrigin(jTextFieldOrigin.getText());
        wildAnimal.setDangerousness(jComboBoxDangerousness.getSelectedItem().toString());
        wildAnimal.setGender(getGender());
        logistic.createWildAnimal(wildAnimal);
    }//GEN-LAST:event_btnCreateActionPerformed

    private String getGender() {
        if(maleOpt.isSelected()) {
            return "Male";
        } else if (femaleOpt.isSelected()) {
            return "Female";
        } else {
            JOptionPane.showMessageDialog(this, "Por favor selecciona un genero");
            throw new IllegalArgumentException("Gender is not valid, choose one");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JRadioButton femaleOpt;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JTextField inputCientifName;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputName1;
    private javax.swing.JComboBox<String> jComboBoxDangerousness;
    private javax.swing.JLabel jLabelDangerousness;
    private javax.swing.JLabel jLabelOrgini;
    private javax.swing.JLabel jLabelPsycology;
    private javax.swing.JLabel jLabelScientName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerAge;
    private javax.swing.JTextField jTextFieldOrigin;
    private javax.swing.JTextField jTextFieldPsycology;
    private javax.swing.JTextPane jTextPanePedigree;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelWeight;
    private javax.swing.JLabel lableAge;
    private javax.swing.JLabel lableGender;
    private javax.swing.JRadioButton maleOpt;
    private javax.swing.JLabel pedigreeJLabel;
    private javax.swing.JComboBox<String> stateJComboBox;
    private javax.swing.JLabel stateJLabel;
    // End of variables declaration//GEN-END:variables
}
