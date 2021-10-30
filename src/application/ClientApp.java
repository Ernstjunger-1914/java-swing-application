package application;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ClientApp {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientApp window = new ClientApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ClientApp() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		// frame.setBounds(100, 100, 450, 300);
		ImagePnael mainPanel=new ImagePnael(new ImageIcon("./image/main_panel.jpg").getImage());
		frame.add(mainPanel);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);	//size control block
		frame.setSize(mainPanel.getWidth(), mainPanel.getHeight());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class ImagePnael extends JPanel {
		private Image img;
		
		public ImagePnael(Image img) {
			this.img=img;
			setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
			setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
			setLayout(null);
		}

		public int getWidth() {
			return img.getWidth(null);
		}

		public int getHeigth() {
			return img.getHeight(null);
		}
		
		public void paintComponent(Graphics g) {
			g.drawImage(img, 0, 0, null);
		}
	}

}
