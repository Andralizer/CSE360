import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

public class Help extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help frame = new Help();
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
	public Help() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel Help = new JLabel("Help");
		Help.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(Help, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JLabel mainText = new JLabel("<html>"+"On the main page you will find buttons for:\r\n" + "<br>" +
				"About\r\n" + "<br>" +
				"Exit\r\n" + "<br>" +
				"Start\r\n" + "<br>" +
				"\r\n" + "<br>" +
				"The 'Exit' button does the following:\r\n" + "<br>" +
				"Exits the application\r\n" + "<br>" +
				"Discards entered node information\r\n" + "<br>" +
				"\r\n" + "<br>" +
				"The 'Start' button has two functions: \r\n" + "<br>" + 
				"- Discards all previously entered node information\r\n" + "<br>" +
				"- Allows for the beginning of a new Network Diagram\r\n" + "<br>" +
				"\r\n" + "<br>" +
				"The ‘About’ button opens a new page and displays the following:\r\n" + "<br>" +
				"- Application development team number\r\n" + "<br>" +
				"- Application development team\r\n" + "<br>" +
				"- Application version\r\n" + "<br>" +
				"- Application description\r\n" + "<br>" +
				"- Done button & when pressed returns user to main page\r\n" + "<br>" +
				"\r\n" + "<br>" +
				"The Start Button opens the page to create a new node for \r\n" + "<br>" +
				"the Network Diagram Activity entering page\r\n" + "<br>" +
				"- A text field to enter the name of the activity\r\n" + "<br>" +
				"- A text fied to enter the activity duration in integers\r\n" + "<br>" +
				"- A text field to enter the predecessor of an activity\r\n" + "<br>" +
				"- A add button which allows the user to enter another activity\r\n" + "<br>" +
				"- A view results button which allows the user to open a new page\r\n" + "<br>" +
				"to display all the paths of a network diagram\r\n" + "<br>" +
				"\r\n" + "<br>" + "<html>");
		scrollPane.setViewportView(mainText);
		
		JButton returnHome = new JButton("Return Home");
		contentPane.add(returnHome, BorderLayout.SOUTH);
		returnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
	}

}
