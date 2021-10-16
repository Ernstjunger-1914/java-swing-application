import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JButton;

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
	}

}
