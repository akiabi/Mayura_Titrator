package main.java;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import Login.trial;

//import login.trial;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import java.awt.Desktop;  


public class open_rinse_counter extends JPanel implements ItemListener {

	static JFrame frame  = new JFrame();
	static JPanel p = new JPanel();
	static JButton btn_rinse;
	static JComboBox cb_sop12;
	static JLabel sop;
	
	
	@SuppressWarnings("removal")
	public static void initialize() {
		frame.getContentPane().invalidate();
		frame.getContentPane().validate();
		frame.getContentPane().repaint();
    }
	
	public static void main(String[] args) {
	
					frame.setBounds(100, 200, 400, 250);
					frame.add(p);
			   		frame.getContentPane().add(new open_rinse_counter());
					frame.setTitle("rinse Cycle Count");
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
					frame.setVisible(true);
					frame.repaint();
					ImageIcon img = new ImageIcon(("C:\\SQLite\\logo\\logo.png"));
					frame.setIconImage(img.getImage());

					
//					frame.addWindowListener(new java.awt.event.WindowAdapter() {
//					    @Override
//					    public void windowClosing(java.awt.event.WindowEvent windowEvent)
//					    {
//					            System.out.println("Closing rinseing");
//					    }
//					});
					
					
				
					
					
	}


	
	public open_rinse_counter() {
		
		setLayout(null);

		
		sop = new JLabel("Please select the number of rinse cycle");
		sop.setFont(new Font("Times New Roman", Font.BOLD, 18));
		sop.setBounds(40, 20, 375, 21);
		add(sop);
		
		
	
		String[] counts = {"1","2","3","4","5","6","7","8","9","10"};
		cb_sop12 = new JComboBox(counts);
		cb_sop12.setBounds(100, 60, 200, 30);
		add(cb_sop12);
		
		cb_sop12.setSelectedItem("1");
		
		
		btn_rinse = new JButton("Rinse");
		btn_rinse.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_rinse.setBounds(150, 150, 100, 40);
		add(btn_rinse);
		
		
		btn_rinse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button pressed ");
				menubar.rinse_cycle_count(cb_sop12.getSelectedItem().toString());
				frame.dispose();
				frame = new JFrame();
		        p=new JPanel();
		        p.revalidate();
		        p.repaint();
			}
		});		
		
		initialize();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
}