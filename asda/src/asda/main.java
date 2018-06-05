package asda;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import classes.RadioL;

public class main {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	RadioL _radio=new RadioL();
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("ukljuci");
		JButton btnNewButton_3 = new JButton("-F");
		btnNewButton_3.setEnabled(false);
		JButton btnNewButton_1 = new JButton("Iskluci");
		btnNewButton_1.setEnabled(false);
		JButton btnNewButton_2 = new JButton("+F");
		btnNewButton_2.setEnabled(false);
		JButton btnNewButton_4 = new JButton("+V");
		btnNewButton_4.setEnabled(false);
		JButton btnNewButton_5 = new JButton("-V");
		btnNewButton_5.setEnabled(false);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(215, 86, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(215, 156, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNewButton_1.setEnabled(true);
				btnNewButton_3.setEnabled(true);
				btnNewButton_2.setEnabled(true);
				btnNewButton_4.setEnabled(true);
				btnNewButton_5.setEnabled(true);
				btnNewButton.setEnabled(false);
				_radio.stateOn();
				textField.setText(String.valueOf(_radio.getJacinaFrekvencije()));
				textField_1.setText(String.valueOf(_radio.getJacinaZvuka()));
			}
		});
		btnNewButton.setBounds(41, 66, 89, 23);
		frame.getContentPane().add(btnNewButton);
	
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNewButton_1.setEnabled(false);
				btnNewButton_3.setEnabled(false);
				btnNewButton_2.setEnabled(false);
				btnNewButton_4.setEnabled(false);
				btnNewButton_5.setEnabled(false);
				btnNewButton.setEnabled(true);
				_radio.stateOFF();
				textField.setText(String.valueOf(_radio.getJacinaFrekvencije()));
				textField_1.setText(String.valueOf(_radio.getJacinaZvuka()));
			}
		});
		btnNewButton_1.setBounds(41, 127, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				textField.setText(String.valueOf(_radio.frequnecy()));
			}
		});
		btnNewButton_2.setBounds(41, 199, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
				textField.setText(String.valueOf(_radio.frequnecyminus()));
			}
		});
		btnNewButton_3.setBounds(41, 260, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
	
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_1.setText(String.valueOf(_radio.volume()));
			}
		});
		btnNewButton_4.setBounds(41, 322, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_1.setText(String.valueOf(_radio.volumeminus()));
			}
		});
		btnNewButton_5.setBounds(41, 381, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		

	}
}
