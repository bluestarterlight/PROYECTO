package api16042018;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


/**

 * La clase abonados es una extension de la clase del tipo frame que utilizo para conectarla a la base de datos SQL e iniciar la sesion con id abonados y contraseņa

 * @author: Eugeni
 * 
 */



public class Abonados extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the frame.
	 */
	public Abonados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVolver = new JButton("Iniciar sesion");
		btnVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				compraBonos a = new compraBonos();
				dispose();
				a.setVisible(true);
				
				
				
			}
		});
		btnVolver.setBounds(147, 115, 131, 39);
		contentPane.add(btnVolver);
		
		JButton btnComprarBono = new JButton("Nuevo Abonado");
		btnComprarBono.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Registro a = new Registro();
				dispose();
				a.setVisible(true);
				
				
			}
		});
		btnComprarBono.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnComprarBono.setBounds(147, 164, 131, 39);
		contentPane.add(btnComprarBono);
		
		textField = new JTextField();
		textField.setBounds(146, 77, 132, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(147, 43, 132, 20);
		contentPane.add(textField_1);
		
		JLabel lblAbonadoId = new JLabel("Abonado id");
		lblAbonadoId.setBounds(54, 46, 68, 14);
		contentPane.add(lblAbonadoId);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(54, 80, 68, 14);
		contentPane.add(lblPassword);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				menu a = new menu();
				dispose();
				a.setVisible(true);
				
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(147, 214, 131, 36);
		contentPane.add(btnNewButton);
	}
}
