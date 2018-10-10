import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ActivityFrame2 extends JFrame {

	private JPanel contentPane;
	private JTextField oneName;
	private JTextField onePred;
	private JTextField oneDuration;
	private JTextField twoName;
	private JTextField twoDuration;
	private JTextField threeDuration;
	private JTextField twoPred;
	private JButton addActivity1;
	private JButton addActivity2;
	private JButton addActivity3;
	private JButton addActivity4;
	private JTextField threeName;
	private JTextField fourName;
	private JTextField threePred;
	private JTextField fourDuration;
	private JTextField fourPred;
	private JPanel otherPanel;
	private JButton btnCalculateResults;
	private JTextField fiveName;
	private JTextField fiveDuration;
	private JTextField fivePred;
	private JButton fiveButton;
	
	
	//RANDOM Variables
	Vector<Action> players = new Vector<Action>();
	Action first = new Action();
	Action second = new Action();
	Action third = new Action();
	Action fourth = new Action();
	Action fifth = new Action();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ActivityFrame2 frame = new ActivityFrame2();
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
	public ActivityFrame2() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		otherPanel = new JPanel();
		contentPane.add(otherPanel);
		otherPanel.setLayout(new GridLayout(6, 4, 0, 0));
		
		JLabel NameLabel = new JLabel("Name");
		otherPanel.add(NameLabel);
		
		JLabel DurationLabel = new JLabel("Duration");
		otherPanel.add(DurationLabel);
		
		JLabel PredLabel = new JLabel("Predecessors");
		otherPanel.add(PredLabel);
		
		JLabel buttonLabel = new JLabel("click to add");
		otherPanel.add(buttonLabel);
		
		
		//FIRST OBJECT
		oneName = new JTextField();
		otherPanel.add(oneName);
		oneName.setFont(new Font("Arial", Font.PLAIN, 12));
		oneName.setHorizontalAlignment(SwingConstants.CENTER);
		oneName.setColumns(10);
		
		oneDuration = new JTextField();
		otherPanel.add(oneDuration);
		oneDuration.setFont(new Font("Arial", Font.PLAIN, 12));
		oneDuration.setHorizontalAlignment(SwingConstants.CENTER);
		oneDuration.setColumns(10);
		
		onePred = new JTextField();
		otherPanel.add(onePred);
		onePred.setFont(new Font("Arial", Font.PLAIN, 12));
		onePred.setHorizontalAlignment(SwingConstants.CENTER);
		onePred.setColumns(10);
		
		addActivity1 = new JButton("Add");
		otherPanel.add(addActivity1);
		addActivity1.setFont(new Font("Arial", Font.PLAIN, 12));
		
		addActivity1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
			String durationValue = oneDuration.getText();	
			try {
				Integer.parseInt(durationValue);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please Insert a Valid Number");
				oneDuration.setText(durationValue.substring(0,durationValue.length()-durationValue.length()));
			}
			
			//Creating a new Action object
			int duration = Integer.parseInt(durationValue);
			String predecessor = onePred.getText();
			String activityName = oneName.getText();
			first = new Action(duration, predecessor, activityName);		
			}
		});
		
		//SECOND OBJECT
		twoName = new JTextField();
		otherPanel.add(twoName);
		twoName.setFont(new Font("Arial", Font.PLAIN, 12));
		twoName.setHorizontalAlignment(SwingConstants.CENTER);
		twoName.setColumns(10);
		
		twoDuration = new JTextField();
		otherPanel.add(twoDuration);
		twoDuration.setFont(new Font("Arial", Font.PLAIN, 12));
		twoDuration.setHorizontalAlignment(SwingConstants.CENTER);
		twoDuration.setColumns(10);
		
		twoPred = new JTextField();
		otherPanel.add(twoPred);
		twoPred.setFont(new Font("Arial", Font.PLAIN, 12));
		twoPred.setHorizontalAlignment(SwingConstants.CENTER);
		twoPred.setColumns(10);
		
		addActivity2 = new JButton("Add");
		otherPanel.add(addActivity2);
		addActivity2.setFont(new Font("Arial", Font.PLAIN, 12));
		
		addActivity2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
			String durationValue = twoDuration.getText();	
			try {
				Integer.parseInt(durationValue);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please Insert a Valid Number");
				oneDuration.setText(durationValue.substring(0,durationValue.length()-durationValue.length()));
			}
			
			//Creating a new Action object
			int duration = Integer.parseInt(durationValue);
			String predecessor = twoPred.getText();
			String activityName = twoName.getText();
			second = new Action(duration, predecessor, activityName);
					
		
			}
		});
		
		
		//THIRD OBJECT
		threeName = new JTextField();
		otherPanel.add(threeName);
		threeName.setFont(new Font("Arial", Font.PLAIN, 12));
		threeName.setHorizontalAlignment(SwingConstants.CENTER);
		threeName.setColumns(10);
		
		threeDuration = new JTextField();
		otherPanel.add(threeDuration);
		threeDuration.setFont(new Font("Arial", Font.PLAIN, 12));
		threeDuration.setHorizontalAlignment(SwingConstants.CENTER);
		threeDuration.setColumns(10);
		
		threePred = new JTextField();
		otherPanel.add(threePred);
		threePred.setFont(new Font("Arial", Font.PLAIN, 12));
		threePred.setHorizontalAlignment(SwingConstants.CENTER);
		threePred.setColumns(10);
		
		addActivity3 = new JButton("Add");
		otherPanel.add(addActivity3);
		addActivity3.setFont(new Font("Arial", Font.PLAIN, 12));
		
		addActivity3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
			String durationValue = threeDuration.getText();	
			try {
				Integer.parseInt(durationValue);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please Insert a Valid Number");
				oneDuration.setText(durationValue.substring(0,durationValue.length()-durationValue.length()));
			}
			
			//Creating a new Action object
			int duration = Integer.parseInt(durationValue);
			String predecessor = threePred.getText();
			String activityName = threeName.getText();
			third = new Action(duration, predecessor, activityName);
		
			}
		});
		
		
		
		
		
		
		
		
		//FOURTH OBJECT
		fourName = new JTextField();
		otherPanel.add(fourName);
		fourName.setFont(new Font("Arial", Font.PLAIN, 12));
		fourName.setHorizontalAlignment(SwingConstants.CENTER);
		fourName.setColumns(10);
		
		fourDuration = new JTextField();
		otherPanel.add(fourDuration);
		fourDuration.setFont(new Font("Arial", Font.PLAIN, 12));
		fourDuration.setHorizontalAlignment(SwingConstants.CENTER);
		fourDuration.setColumns(10);
		
		fourPred = new JTextField();
		otherPanel.add(fourPred);
		fourPred.setFont(new Font("Arial", Font.PLAIN, 12));
		fourPred.setHorizontalAlignment(SwingConstants.CENTER);
		fourPred.setColumns(10);
		
		addActivity4 = new JButton("Add");
		otherPanel.add(addActivity4);
		addActivity4.setFont(new Font("Arial", Font.PLAIN, 12));
		
		addActivity4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
			String durationValue = fourDuration.getText();	
			try {
				Integer.parseInt(durationValue);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please Insert a Valid Number");
				oneDuration.setText(durationValue.substring(0,durationValue.length()-durationValue.length()));
			}
			
			//Creating a new Action object
			int duration = Integer.parseInt(durationValue);
			String predecessor = fourPred.getText();
			String activityName = fourName.getText();
			fourth = new Action(duration, predecessor, activityName);
		
			}
		});
		
		
		
		//FIFTH OBJECT
		fiveName = new JTextField();
		fiveName.setHorizontalAlignment(SwingConstants.CENTER);
		fiveName.setFont(new Font("Arial", Font.PLAIN, 12));
		fiveName.setColumns(10);
		otherPanel.add(fiveName);
		
		fiveDuration = new JTextField();
		fiveDuration.setHorizontalAlignment(SwingConstants.CENTER);
		fiveDuration.setFont(new Font("Arial", Font.PLAIN, 12));
		fiveDuration.setColumns(10);
		otherPanel.add(fiveDuration);
		
		fivePred = new JTextField();
		fivePred.setHorizontalAlignment(SwingConstants.CENTER);
		fivePred.setFont(new Font("Arial", Font.PLAIN, 12));
		fivePred.setColumns(10);
		otherPanel.add(fivePred);
		
		fiveButton = new JButton("Add");
		fiveButton.setFont(new Font("Arial", Font.PLAIN, 12));
		otherPanel.add(fiveButton);
		
		fiveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
			String durationValue = fiveDuration.getText();	
			try {
				Integer.parseInt(durationValue);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please Insert a Valid Number");
				oneDuration.setText(durationValue.substring(0,durationValue.length()-durationValue.length()));
			}
			
			//Creating a new Action object
			int duration = Integer.parseInt(durationValue);
			String predecessor = fivePred.getText();
			String activityName = fiveName.getText();
			fifth = new Action(duration, predecessor, activityName);
		
			}
		});
		
		
		
		
		btnCalculateResults = new JButton("Calculate Results");
		contentPane.add(btnCalculateResults, BorderLayout.SOUTH);
		
		
		btnCalculateResults = new JButton("Calculate Results");
		contentPane.add(btnCalculateResults, BorderLayout.SOUTH);
		btnCalculateResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {		
				
				//Check to see if the textfield is empty or not add to original vector
				if((oneName.getText().isEmpty()) == false) {
					players.addElement(first);
				}
				if((twoName.getText().isEmpty()) == false) {
					players.addElement(second);
				}
				if((threeName.getText().isEmpty()) == false) {
					players.addElement(third);
				} 
				if((fiveName.getText().isEmpty()) == false) {
					players.addElement(fifth);
				} 
				
				//Start adding to the orderPredecessorWith
				if((oneName.getText().isEmpty()) == false) {
					first.orderPredecessorsWith(players);
				}
				if((twoName.getText().isEmpty()) == false) {
					second.orderPredecessorsWith(players);
				}
				if((threeName.getText().isEmpty()) == false) {
					third.orderPredecessorsWith(players);
				} 
				if((fourName.getText().isEmpty()) == false) {
					fourth.orderPredecessorsWith(players);
				}
				if((fiveName.getText().isEmpty()) == false) {
					fifth.orderPredecessorsWith(players);
				} 
				
				OrderActions.orderAscending(players);
				
				OrderActions.reverseOrder(players);
				
				Vector<String> unorganizedResults = new Vector<String>();
				
				//GetOutput.calculateResultsForCurrentLargestPathAndUpdate(players, results);
				
				GetOutput.getAllOutput(players, unorganizedResults);
				
				System.out.println("Unorganized Results: ");
				System.out.println(unorganizedResults);
				
				Vector<String> results = new Vector<String>();
				
				FormatResults.orderResults(unorganizedResults, results);
				
				PrintResults.output(results);
				
			}
		});
		
	}

}
