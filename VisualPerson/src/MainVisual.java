import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class MainVisual extends JFrame {

	/**
	 * @param args
	 */
	PersonHashMap myMap = new PersonHashMap();
	JTextField fNameField = new JTextField("First Name",20);
	JTextField lNameField = new JTextField("Last Name",20);
	JTextField ageField = new JTextField("Age",20);
	String[] comboContent = {"","Male","Female"};
	JComboBox genderCombo = new JComboBox(comboContent);
	JButton addButton = new JButton("Add");
	JTextField mailField = new JTextField("Mail",20);
	JButton printButton = new JButton("Print");
	JButton printAll = new JButton("Print All");
	
	public MainVisual(){
		super();
		init();
	}// end constructor
	
	public void init(){
		this.setSize(300, 300);
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		this.add(fNameField);
		this.add(lNameField);
		this.add(ageField);
		this.add(mailField);
		this.add(genderCombo);
		this.add(addButton);
		this.add(printButton);
		this.add(printAll);
		addButton.addActionListener(new AddAction());
		printButton.addActionListener(new PrintAction());
		printAll.addActionListener(new PrintAllAction());
	}// end init()
	
	public void clearForm(){
		fNameField.setText("");
		lNameField.setText("");
		mailField.setText("");
		ageField.setText("");
		genderCombo.setSelectedIndex(0);
	}
	
	class PrintAllAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//myMap.printAllPerson();
			myMap.sortedPrint();
		}
		
	}
	
	class PrintAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String mail = mailField.getText();
			myMap.printPersonInfo(mail);
		}
		
	}
	
	class AddAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String fName = fNameField.getText();
			String lName = lNameField.getText();
			String mail = mailField.getText();
			char gender;
			int age = Integer.parseInt(ageField.getText());			
			int index = genderCombo.getSelectedIndex();
			if(index == 1) {
				gender = 'm';
			}// end if clause
			else{
				gender = 'f';
			}// end clause
			
			Person temp = new Person(fName,lName,gender,age,mail);
			myMap.addPerson(temp);
			clearForm();
		}// end acctionPerformed		
	}// end class AddAction
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainVisual myFrame = new MainVisual();
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
