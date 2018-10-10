import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;


//FRONT-END
public class About extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
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
	public About() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel aboutPanel = new JPanel();
		contentPane.add(aboutPanel);
		aboutPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel aboutLabel = new JLabel("About the Project Management Tool (PMT)");
		aboutLabel.setHorizontalAlignment(SwingConstants.CENTER);
		aboutPanel.add(aboutLabel, BorderLayout.NORTH);
		
		JLabel aboutText = new JLabel("<html>"+"<br>"+"The “Project Management Tool (PMT): User’s Guide” will help" + "<br>" +
				"the user understand how to utilize the tool to manage their" + "<br>" + 
				"activities within a network. This guide provides an overview" + "<br>" +
				"of the program that explains the main user flows and basic" + "<br>" +
				"input/outputs. There is also information about how to set-up" + "<br>" +
				"the tool including the installation under the sections" + "<br>" +
				"‘Installation’ and ‘Getting Started’. The section titled," + "<br>" +
				"‘User Interface’, details the key features of the PMT" + "<br>" +
				"including the ‘Add Activity’, ‘Calculate Results’, and" + "<br>" +
				"Quit/Restart buttons. The guide also exemplifies successful" + "<br>" +
				"executions and error-checking messages under the section" + "<br>" +
				"‘Example Runs’. Lastly, the guide explains how to restart" + "<br>" +
				"and quit the program under the sections ‘Restarting’ and" + "<br>" +
				"‘Ending the Program’." + "<br>" +
				""+"<html>");
		aboutText.setVerticalAlignment(SwingConstants.TOP);
		aboutText.setHorizontalAlignment(SwingConstants.CENTER);
		aboutPanel.add(aboutText, BorderLayout.CENTER);
		
		JPanel aboutTeamPanel = new JPanel();
		contentPane.add(aboutTeamPanel);
		aboutTeamPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel aboutTeamLabel = new JLabel("About Team Eight");
		aboutTeamLabel.setHorizontalAlignment(SwingConstants.CENTER);
		aboutTeamPanel.add(aboutTeamLabel, BorderLayout.NORTH);
		
		JLabel aboutTeamText = new JLabel("<html>"+ "Team 8" + "<br>" +
				"Class: CSE360" + "<br>" +
				"Semester: Fall 2018" + "<br>" + "<br>" +
				"Developers:" + "<br>" +
				"Cecilia Nguyen" + "<br>" +
				"Andrew Simon" + "<br>" +
				"Jesus Soto" + "<br>" +
				"Sam Zirbel" + "<br>" +
				"<br>" +
				"Version 1.0"+"<html>");
		aboutTeamText.setHorizontalAlignment(SwingConstants.CENTER);
		aboutTeamPanel.add(aboutTeamText, BorderLayout.CENTER);
		
		JButton returnHome = new JButton("Return Home");
		aboutTeamPanel.add(returnHome, BorderLayout.SOUTH);
		returnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
	}

}
