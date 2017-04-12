/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author USUARIO
 */
public class JFMainWindow extends JFrame {
    
    private Controller controller;
            
    public JFMainWindow(Controller controller){
        this.controller = controller;
        init();
    }
    
    public void init(){
        this.setTitle("Multinacional");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        Image icono = Toolkit.getDefaultToolkit().getImage(("src/images/empresa.jpg"));
	this.setIconImage(icono);
        
        this.setLayout(new BorderLayout());
    }
}
