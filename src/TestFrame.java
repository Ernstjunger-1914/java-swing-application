import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestFrame {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		JPanel btnPanel=new JPanel();
		JLabel label=new JLabel("Input txt");
		JButton btn1=new JButton("Click");
		JButton btn2=new JButton("Exit");
		JTextArea txtArea=new JTextArea();
		JTextField txtField=new JTextField(200);
		
		panel.setLayout(new BorderLayout());
		
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		panel.add(label, BorderLayout.NORTH);
		panel.add(btn1, BorderLayout.WEST);
		panel.add(txtArea, BorderLayout.CENTER);
		//panel.add(new JLabel("This is Java Swing"));
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(txtArea.getText());
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
			
		frame.add(panel);
		
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(840, 840/12*9));
		frame.setSize(840, 840/12*9);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
