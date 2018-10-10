import java.awt.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel mainPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		mainPane = new JPanel();
		mainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPane);
		mainPane.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel1 = new JPanel();
		mainPane.add(panel1);
		
		JButton helpButton = new JButton("Help");
		helpButton.setFont(new Font("Arial", Font.PLAIN, 12));
		helpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Help addGui = new Help();
				addGui.setVisible(true);
			}
		});
		panel1.add(helpButton);
		
		JButton aboutButton = new JButton("About");
		aboutButton.setFont(new Font("Arial", Font.PLAIN, 12));
		panel1.add(aboutButton);
		aboutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About addGui = new About();
				addGui.setVisible(true);
			}
		});
		
		JButton exitButton = new JButton("Exit");
		exitButton.setFont(new Font("Arial", Font.PLAIN, 12));
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		panel1.add(exitButton);
		
		
		JButton startButton = new JButton("Start");
		startButton.setFont(new Font("Arial", Font.PLAIN, 13));
		mainPane.add(startButton);
		
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ActivityFrame addGui = new ActivityFrame();
				addGui.setVisible(true);
			}
		});
	}

}
