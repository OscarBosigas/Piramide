package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class JListPeople extends JPanel {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DefaultTableModel dtm;
	private JScrollPane jsp;
	private JTable jtPeople;
	
	public JListPeople(){
		initComponents();
	}
	
	public void initComponents(){
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.setBackground(Color.decode("#00000"));
		
		dtm = new DefaultTableModel();
		titles();
		
		Font fontHeader = new Font("Franklin Ghotic Demi" , Font.ITALIC ,14);
				
		jtPeople = new JTable();
		jtPeople.setModel(dtm);
		jtPeople.getTableHeader().setReorderingAllowed(false);
		jtPeople.getTableHeader().setBackground(Color.decode("#282E33"));
		jtPeople.getTableHeader().setForeground(Color.white);
		jtPeople.getTableHeader().setFont(fontHeader);
		jtPeople.setBackground(Color.white);
		jtPeople.setBorder(null);
		
		jsp = new JScrollPane(jtPeople);
		jsp.setForeground(Color.white);
		jsp.setBorder(null);
		jsp.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		add(jsp, BorderLayout.PAGE_END);
		this.setBorder(null);
	}
	
    /*	public void refreshWindow(SimpleList<Person> personList, short x) {
		dtm.setRowCount(0);
		Node<Person> head = personList.getHead();
		while (head != null) {
			dtm.addRow(head.getInfo().toVectorString(x));
			head = head.getNext();
		}
	}
        */
		
	/*public void addPersonToList(Person person, short age){
		dtm.addRow(person.toVectorString(age));
	}
	*/
	public void titles(){
		String [] headers= {"Identificacion", "Nombres" , "Apellidos",
				"Genero", "Telefono", "Referidos"};
		dtm.setColumnIdentifiers(headers);
	}
	
}
