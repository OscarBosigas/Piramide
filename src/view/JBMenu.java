package view;

import java.awt.Color;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import controller.Controller;

public class JBMenu extends JMenuBar{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Controller controller;
	private JMenu jMFile;
	private JMenuItem jmiAdd, jmiEdit, jmiDelete, jmiExit,  jmiSearch;
					  
	
	public JBMenu(Controller controller){
		this.controller = controller;
		setBackground(Color.decode("#00000"));
		initComponents();
	}
	
	public void initComponents(){
	
		jMFile = new JMenu("Archivo");
		jMFile.setForeground(Color.white);
		
		jmiAdd = new JMenuItem("Agregar persona");
		jmiAdd.addActionListener(controller);
		jmiAdd.setIcon(new ImageIcon(getClass().getResource("/images/Boy.png")));
		jmiAdd.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,java.awt.event.InputEvent.CTRL_DOWN_MASK));
		jmiAdd.setActionCommand("agregar");
		
		jmiDelete =  new JMenuItem("Eliminar");
		jmiDelete.addActionListener(controller);
		jmiDelete.setActionCommand("eliminar");
		jmiDelete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,java.awt.event.InputEvent.CTRL_DOWN_MASK));
		jmiDelete.setIcon(new ImageIcon(getClass().getResource("/images/Delete.png")));
		
		jmiEdit = new JMenuItem("Editar");
		jmiEdit.addActionListener(controller);
		jmiEdit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,java.awt.event.InputEvent.CTRL_DOWN_MASK));
		jmiEdit.setActionCommand("editar");
		jmiEdit.setIcon(new ImageIcon(getClass().getResource("/images/edit.png")));
				
		jmiExit =  new JMenuItem("Salir");
		jmiExit.addActionListener(controller);
		jmiExit.setActionCommand("salir");
		jmiExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4,java.awt.event.InputEvent.ALT_DOWN_MASK));
		jmiExit.setIcon(new ImageIcon(getClass().getResource("/images/Delete.png")));
		
		jmiSearch = new JMenuItem("Buscar");
		jmiSearch.addActionListener(controller);
		jmiSearch.setActionCommand("buscar");
		jmiSearch.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,java.awt.event.InputEvent.CTRL_DOWN_MASK));
		jmiSearch.setIcon(new ImageIcon(getClass().getResource("/images/search.jpg")));
				
		jMFile.add(jmiAdd);
		jMFile.add(jmiEdit);
		jMFile.add(jmiDelete);
		jMFile.add(jmiSearch);
		jMFile.add(jmiExit);
                
		add(jMFile);
		
	}
	
}
