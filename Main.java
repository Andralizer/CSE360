import java.util.*;

public class Main {
	
	public static void main(String args[]) {
		
		Action one = new Action();
		
		//needed 
		one.setName("one");
		
		one.printDuration();
		one.printPredecessors();
		
		one.setDuration(8);
		
		Action two = new Action(4);
		
		two.setName("two");
		
		two.printAction();
		
		two.addPredecessors("one");
		
		Action three = new Action(1, "one");
		
		three.setName("three");
		
		three.printAction();
		
		three.printPredecessorAt(1);
		
		Vector<Action> players = new Vector<Action>();
		
		players.addElement(one);
		players.addElement(two);
		players.addElement(three);
		
		Action four = new Action(3, "three,two", "four");
		
		four.printAction();
		
		players.addElement(four);

		System.out.println("Players Action Vector:");
		System.out.println(players);
		System.out.println();
		
		three.orderPredecessorsWith(players);
		
		three.printPredecessorDurations();
		
		four.orderPredecessorsWith(players);
		two.orderPredecessorsWith(players);
		one.orderPredecessorsWith(players);
		
		one.printPredecessorDurations();
		two.printPredecessorDurations();
		three.printPredecessorDurations();
		four.printPredecessorDurations();
		
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
	
}
