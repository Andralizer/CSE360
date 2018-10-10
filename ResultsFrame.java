import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;

public class ResultsFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JTextArea resultsField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResultsFrame frame = new ResultsFrame();
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
	public ResultsFrame() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel resultsTitle = new JLabel("Here are your results!");
		resultsTitle.setFont(new Font("Arial", Font.BOLD, 12));
		resultsTitle.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(resultsTitle, BorderLayout.NORTH);
		
		resultsField = new JTextArea();
		resultsField.setFont(new Font("Arial", Font.BOLD, 12));
		resultsField.setEditable(false);
		contentPane.add(resultsField, BorderLayout.CENTER);
		resultsField.setColumns(10);
	}

}
