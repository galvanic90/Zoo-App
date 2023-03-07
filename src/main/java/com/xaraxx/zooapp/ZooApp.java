/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.xaraxx.zooapp;

import Controller.LogisticController;
import Model.Animals;
import View.MainJFrameView;
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
