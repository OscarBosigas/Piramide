package view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JToolBar;

import controller.Controller;

public class JTB extends JToolBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton add, edit, delete, search;	
	private JSeparator  separator1;
	private Controller controller;
	
	public JTB(Controller controller){
		this.controller = controller;
		setLayout( new FlowLayout());
		setFloatable(false);
		setBackground(Color.white);
		initComponents();
	}
	
	public void initComponents(){
			
		separator1 = new JSeparator();

		
		add = new JButton();
		add.setToolTipText("Agregar");
		add.setIcon(new ImageIcon((getClass().getResource("/images/Boy.png"))));
		add.addActionListener(controller);
		add.setActionCommand("agregar");
				
		edit = new JButton();
		edit.setToolTipText("Editar");
		edit.setIcon(new ImageIcon((getClass().getResource("/images/edit.png"))));
		edit.addActionListener(controller);
		edit.setActionCommand("editar");
		
		delete = new JButton();
		delete.setToolTipText("Eliminar");
		delete.setIcon(new ImageIcon((getClass().getResource("/images/Delete.png"))));
		delete.addActionListener(controller);
		delete.setActionCommand("eliminar");
		
		search = new JButton();
		search.setToolTipText("Buscar");
		search.setIcon(new ImageIcon((getClass().getResource("/images/search.jpg"))));
		search.addActionListener(controller);
		search.setActionCommand("buscar");
				
		add(add);
		add(edit);
		add(search);
		add(delete);
		
	}

}
