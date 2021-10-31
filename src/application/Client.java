package application;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import application.ClientApp.ImagePnael;

public class Client {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client window = new Client();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Client() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		// frame.setBounds(100, 100, 450, 300);
		ImagePnael mainPanel = new ImagePnael(new ImageIcon("C:/Users/WORK/eclipse-workspace/Swing/image/main_panel.jpg").getImage());
		frame.setSize(mainPanel.getWidth(), mainPanel.getHeight());
		frame.setResizable(false);	//size control block
		frame.add(mainPanel);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel main = new JPanel();
		frame.getContentPane().add(main);
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
			// 이미지의 넓이
			return img.getWidth(null);
		}

		public int getHeigth() {
			//이미지의 높이
			return img.getHeight(null);
		}
		
		public void paintComponent(Graphics g) {
			g.drawImage(img, 0, 0, null);
		}
	}
}
