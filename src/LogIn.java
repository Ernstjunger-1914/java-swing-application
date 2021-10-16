import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogIn extends JFrame{
	public LogIn() {
		JPanel panel=new JPanel();
		JLabel label=new JLabel("ID ");
		JLabel passwd=new JLabel("Password ");
		JTextField txtID=new JTextField(12);
		JPasswordField txtPasswd=new JPasswordField(12);
		JButton loginBtn=new JButton("Login");
		
		panel.add(label);
		panel.add(txtID);
		panel.add(passwd);
		panel.add(txtPasswd);
		panel.add(loginBtn);
		
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id="kgh";
				String passwd="ssd";
				
				if(id.equals(txtID.getText())&&passwd.equals(txtPasswd.getText())) {
					JOptionPane.showMessageDialog(null, "You have logged in seccessfully");
				} else {
					JOptionPane.showMessageDialog(null, "You failed to login");
				}
			}
		});
		
		add(panel);
		
		setVisible(true);
		setSize(600, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		new LogIn();
	}
}
