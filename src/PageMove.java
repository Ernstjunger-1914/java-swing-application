import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PageMove {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageMove window = new PageMove();
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
	public PageMove() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Page Move");
		frame.setBounds(100, 100, 800, 600);
		frame.setLocationRelativeTo(null);	//모니터 중앙에 띄우기
		frame.setResizable(false);	//창 크기 조절 불가
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel endpage = new JPanel();
		frame.getContentPane().add(endpage);
		endpage.setBounds(0, 0, 794, 565);
		endpage.setLayout(null);
		
		JButton lastbtn = new JButton("LAST");
		lastbtn.setBounds(0, 0, 97, 23);
		lastbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		endpage.add(lastbtn);
		
		JPanel startpage = new JPanel();
		startpage.setBounds(0, 0, 794, 565);
		frame.getContentPane().add(startpage, BorderLayout.NORTH);
		
		JButton nextbtn = new JButton("NEXT");
		startpage.add(nextbtn);
		
		endpage.setVisible(false);
		
		lastbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				startpage.setVisible(true);
				endpage.setVisible(false);
			}
		});
		nextbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				startpage.setVisible(false);
				endpage.setVisible(true);
			}
		});
	}
}
