/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.JBMenu;
import view.JFMainWindow;
import view.JListPeople;
import view.JTB;

/**
 *
 * @author USUARIO
 */

public class Controller implements ActionListener{
    
    private JFMainWindow jFMainWindow;
    private JBMenu jBMenu;
    private JListPeople jListPeople;
    private JTB jtb;
            
    public Controller(){
        jFMainWindow = new JFMainWindow(this);
        jBMenu = new JBMenu(this);
        jtb = new JTB(this);
        jListPeople = new JListPeople();
        
        jFMainWindow.setJMenuBar(jBMenu);
        jFMainWindow.add(jtb, BorderLayout.NORTH);
        jFMainWindow.add(jListPeople, BorderLayout.CENTER);
        
        jFMainWindow.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
               
    }
}
