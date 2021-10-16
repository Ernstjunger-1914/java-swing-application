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
		frame.setLocationRelativeTo(null);	//����� �߾ӿ� ����
		frame.setResizable(false);	//â ũ�� ���� �Ұ�
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
