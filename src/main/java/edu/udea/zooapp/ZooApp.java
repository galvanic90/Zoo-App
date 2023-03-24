/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.udea.zooapp;

import edu.udea.zooapp.controller.LogisticController;
import edu.udea.zooapp.model.Animals;
import edu.udea.zooapp.view.MainJFrameView;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xaraxx
 */
public class ZooApp {

    public static void main(String[] args) {
        System.out.println("Starting app!");
        List<Animals> animals = new ArrayList<>();
        LogisticController logisticController = new LogisticController(animals);
        MainJFrameView mainView = new MainJFrameView(logisticController);
        mainView.setVisible(true);
        System.out.println("Stopping app!");
    }
}
