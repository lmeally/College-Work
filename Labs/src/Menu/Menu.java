package Menu;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}
	
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
	 public void Connect()
	    {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            con = DriverManager.getConnection("jdbc:mysql://localhost/customerpurchases", "root","");
	        }
	        catch (ClassNotFoundException ex) 
	        {
	          ex.printStackTrace();
	        }
	        catch (SQLException ex) 
	        {
	        	   ex.printStackTrace();
	        }

	    }

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 668, 535);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer Purchases\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(167, 24, 307, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(12, 128, 332, 211);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Customer ID\r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(23, 56, 99, 16);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Menu\r\n");
		lblNewLabel_1.setBounds(134, 0, 56, 25);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Customer Name\r\n");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(23, 85, 116, 16);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Customer Address\r\n");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_1_1.setBounds(23, 114, 129, 16);
		panel.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Customer Email\r\n");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_1_1_1.setBounds(23, 143, 149, 16);
		panel.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Customer Phone Number\r\n");
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_1_1_1_1.setBounds(23, 172, 170, 16);
		panel.add(lblNewLabel_2_1_1_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(134, 56, 116, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(144, 83, 116, 22);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(156, 112, 116, 22);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(134, 141, 116, 22);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(194, 170, 116, 22);
		panel.add(textField_4);
		
		JButton btnNewButton = new JButton("Add Customer\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(482, 128, 128, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnViewCustomer = new JButton("View Customer");
		btnViewCustomer.setBounds(482, 163, 128, 25);
		frame.getContentPane().add(btnViewCustomer);
		
		JButton btnAddProduct = new JButton("Add Product");
		btnAddProduct.setBounds(482, 201, 128, 25);
		frame.getContentPane().add(btnAddProduct);
		
		JButton btnViewCustomer_1 = new JButton("View Customer");
		btnViewCustomer_1.setBounds(482, 239, 128, 25);
		frame.getContentPane().add(btnViewCustomer_1);
		
		JButton btnViewCustomer_1_1 = new JButton("View Products");
		btnViewCustomer_1_1.setBounds(482, 277, 128, 25);
		frame.getContentPane().add(btnViewCustomer_1_1);
		
		JButton btnViewCustomer_1_1_1 = new JButton("Create Invoice");
		btnViewCustomer_1_1_1.setBounds(482, 315, 128, 25);
		frame.getContentPane().add(btnViewCustomer_1_1_1);
	}
}
