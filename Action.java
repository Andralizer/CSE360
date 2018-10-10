import java.util.*;

public class Action {

	private int duration;
	
	private String name;
	
	private Vector<String> predecessors = new Vector<String>();
	
		private int predecessorNumber;
	
	private int labelNumber = 0;
	
	private Vector<Integer> predecessorOrder = new Vector<Integer>();
	
	// VV Initializers
	
 	Action(){
		
		duration = 0;
		
		predecessors.setSize(1);
		
		return;
		
	}
	
	Action(int setDuration){
		
		duration = setDuration;
		
		predecessors.setSize(1);
		
		return;
		
	}
	
	Action(int setDuration, String commaSeparatedActionString){
		
		duration = setDuration;
		
		addPredecessors(commaSeparatedActionString);
		
		return;
		
	}
	
	Action(int setDuration, String commaSeparatedActionString, String newName){
		
		duration = setDuration;
		
		addPredecessors(commaSeparatedActionString);
		
		name = newName;
		
		return;
		
	}
	
	// VV duration Methods
	
	public void setDuration(int newDuration) {
		
		duration = newDuration;
		
		return;
		
	}
	
	public int getDuration() {
		
		return duration;
		
	}
	
	public void printDuration() {
		
		System.out.print(name);
		System.out.println(" Action Object Duration: ");
		System.out.println(duration);
		System.out.println();
		
		return;
		
	}

	// VV name Methods
	
	public void setName(String newName) {
		
		name = newName;
		
		return;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public void printName() {
		
		System.out.println("Action Object Name: ");
		System.out.println(name);
		System.out.println();
		
	}
	
	// VV predecessors Methods
	
	public void addPredecessors(String commaSeparatedActionString) {
		
		predecessors.setSize(0);
		
		String predecessorStrings[] = (commaSeparatedActionString.split(","));

		predecessorNumber = (commaSeparatedActionString.split(",")).length;

		int i = 0;
		
		for (i = 0; i < predecessorNumber; i = i + 1) {
			
			predecessors.add(predecessorStrings[i]);
			
		}
		
		return;
		
	}
	
	public String getPredecessorAtIndex(int index) {
		
		return predecessors.get(index);
		
	}
	
	public Vector<String> getPredecessors() {
		
		return predecessors;
		
	}
	
	public void printPredecessors() {
		
		System.out.print(name);
		System.out.println(" Action Object Predecessors: ");
		System.out.println(predecessors);
		System.out.println();
		
		return;
		
	}
	
	public void printPredecessorAt(int index) {
		
		System.out.print(name);
		System.out.print(" Action Object Predecessor At Index ");
		System.out.print( (index - 1) );
		System.out.println(": ");
		System.out.println(predecessors.get(index - 1));
		System.out.println();
		
		return;
		
	}
	
	public void deleteLargestPredecessor() {
		
		int predecessorCount = predecessors.size();
		
		int i = 0;
		
		int maxDuration = 0;
		
		int maxIndex = -1;
		
		int activeDuration = 0;
		
		for (i = 0; i < predecessorCount; i = i + 1) {
			
			activeDuration = predecessorOrder.get(i);
			
			if (activeDuration > maxDuration) {
				
				maxDuration = activeDuration;
				
				maxIndex = i;
				
			}
			
		}
		
		predecessors.remove(maxIndex);
		
		predecessorOrder.remove(maxIndex);
		
		return;
		
	}
	
	// VV labelNumber Methods
	
	public void setLabelNumber(int newLabel) {
		
		labelNumber = newLabel;
		
		return;
		
	}
	
	public int getLabelNumber() {
		
		return labelNumber;
	
	}
	
	public void printLabelNumber() {
		
		System.out.print(name);
		System.out.println(" Action Object Label Number: ");
		System.out.println(labelNumber);
		System.out.println();
		
		return;
		
	}
	
	// VV predecessorOrder Methods
	
	public void setPredecessorDurationTo(int index, int orderNumber) {
		
		predecessorOrder.setElementAt(orderNumber, index);
		
		return;
		
	}
	
	public int getPredecessorDurationAt(int index) {
		
		return predecessorOrder.get(index);
		
	}

	public Vector<Integer> getPredecessorOrder(){
		
		return predecessorOrder;
		
	}
	
	public void printPredecessorDurationAt(int index) {
		
		int here = index - 1;
		
		System.out.print(name);
		System.out.print(" Action Object Predecessor Order At Index ");
		System.out.print(here);
		System.out.println(" :");
		System.out.println(predecessorOrder.get(here));
		System.out.println();
		
		return;
		
	}
	
	public void printPredecessorDurations() {
		
		System.out.print(name);
		System.out.println(" Action Object Predecessor Order: ");
		System.out.println(predecessors);
		System.out.println(predecessorOrder);
		System.out.println();
		
		return;
		
	}
	
	// VV Action Methods
	
 	public void printAction() {
		
		printDuration();
		
		printPredecessors();
		
		return;
		
	}

	// VV Order Predecessors By Length
	
	public void orderPredecessorsWith(Vector<Action> these){
		
		int i = 0;
		int j = 0;
		
		predecessorOrder.setSize(predecessorNumber);
		
		for (i = 0; i < (these.size()); i = i + 1) {
			
			for (j = 0; j < predecessorNumber; j = j + 1) {
			
				if ( ((these.get(i)).getName()).equals(predecessors.get(j)) ) {
					
					predecessorOrder.setElementAt( ((these.get(i)).getDuration()), j);
					
				}
		
			}
			
		}
		
		return;
		
	}

}
