package com.monocept.model.UI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	private JLabel label;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI frame = new LoginUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LoginUI() {

		final long serialVersionUID = 1L;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 190, 1014, 597);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(423, 13, 273, 93);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(481, 170, 281, 68);
		contentPane.add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(481, 286, 281, 68);
		contentPane.add(passwordField);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(250, 166, 193, 52);
		contentPane.add(lblUsername);

		JLabel lblPassword = new JLabel("Password");

		lblPassword.setBounds(250, 286, 193, 52);
		contentPane.add(lblPassword);

		btnNewButton = new JButton("Login");
		btnNewButton.setBounds(545, 392, 162, 73);
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String userName = textField.getText();
				String password = passwordField.getText();

				String dbURL = "jdbc:mysql://localhost:4040/user";
				String username = "root";
				String psw = "abhi@4105";
				try (Connection conn = DriverManager.getConnection(dbURL, username, psw)) {
					String sql = "SELECT * FROM USER WHERE UNAME = ? AND PSW = ?";

					PreparedStatement statement = conn.prepareStatement(sql);

					statement.setString(1, userName);
					statement.setString(2, password);
					ResultSet rs = statement.executeQuery();
					if (rs.next()) {
						dispose();
						JOptionPane.showMessageDialog(btnNewButton, "Login successfull");
					} else {
						JOptionPane.showMessageDialog(btnNewButton, "Wrong Username & Password");
					}
				} catch (SQLException sqlException) {
					sqlException.printStackTrace();
				}
			}
		});
		contentPane.add(btnNewButton);

		label = new JLabel("");
		label.setBounds(0, 0, 1008, 562);
		contentPane.add(label);
	}

}
