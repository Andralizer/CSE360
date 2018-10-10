import java.util.*;

public class OrderActions {

	static void orderAscending(Vector<Action> these) {
		
		int i = 0;
		int j = 0;
		
		int rootNumbered = 0;
		
		int order = 1;
		
		String activeOrderCheck = (these.get(i)).getName();
		int activeOrderCheckIndex = -1;
		
		while (order < 5) {
					
			System.out.println("Entered While\n");

			for (i = 0; i < these.size(); i = i + 1) {
				
				System.out.print("The Active Object Is : ");
				System.out.println( activeOrderCheck );
				System.out.print("Considering Object: ");
				System.out.println( ((these.get(i))).getName() );
				System.out.println();
				
				// VV If There Are No Predecessors
				if ( ((these.get(i)).getPredecessorAtIndex(0)) == null && rootNumbered == 0){
					
					System.out.print("No Predecessor For: ");
					System.out.println( (these.get(i)).getName() );
					System.out.println();
					
					// VV If Number Label Hasn't Been Set
					if ( ((these.get(i)).getLabelNumber()) == 0) {
						
						(these.get(i)).setLabelNumber(order);
						
						order = order + 1;
						
						(these.get(i)).printLabelNumber();
						
						activeOrderCheck = ((these.get(i))).getName();
						
						activeOrderCheckIndex = i;
						
						rootNumbered = 1;
						
						System.out.println("BREAK");
						System.out.println("\n");
						
						break;
						
					}
					
				}
				
				if ( ((these.get(i)).getPredecessorAtIndex(0)) != null){
				
					// VV For The Predecessors In J
					for (j = 0; j < ((these.get(i)).getPredecessors()).size(); j = j + 1) {
						
						System.out.print("*** Predecessor Of ");
						System.out.print( ((these.get(i))).getName() );
						System.out.print(" Is : ");
						System.out.println(((these.get(i))).getPredecessorAtIndex(j));
						System.out.print("Checking For Predecessors That Are: ");
						System.out.println(activeOrderCheck);
						System.out.println();
						
						// VV If A Predecessor Of An Element == the last Ordered Action
						if ( ((these.get(i))).getPredecessorAtIndex(j).equals(activeOrderCheck) ) {
							
							System.out.print("+++ Granting Object Label To ");
							System.out.println( ((these.get(i))).getName() );
							System.out.println();
							
							(these.get(i)).setLabelNumber(order);
							
							order = order + 1;
							
							these.get(i).printLabelNumber();
							
							System.out.println("=================\n");
														
							break;
							
						}
						
					}
					
				}
				
			}
			
			if (rootNumbered != 1) {
			
				activeOrderCheckIndex = activeOrderCheckIndex + 1;
				
				activeOrderCheck = ((these.get(activeOrderCheckIndex))).getName();
				
			}
			
			rootNumbered = 2;
				
		}
		
		return;
		
	}

	static void reverseOrder(Vector<Action> these) {
		
		int numberOfEntries = these.size();
		
		System.out.println();
		System.out.println("ENTERED IN REVERSE ORDER FUNCTION");
		System.out.println("=================================");
		System.out.println();
		
		System.out.print("Number Of Input Entries: ");
		System.out.println(numberOfEntries);
		System.out.println();
		
		int i = 0;
		
		int activeSwitch = numberOfEntries + 1;
		
		int newNumber = -1;
		
		int negativeLabel = 0;
		
		while (activeSwitch > 0) {
		
			printLabelNumbers(these);
		
			activeSwitch = activeSwitch - 1;
			
			for (i = 0; i < numberOfEntries; i = i + 1) {
				
				if ( (these.get(i)).getLabelNumber() == activeSwitch ) {
					
					(these.get(i)).setLabelNumber(newNumber);
					
					newNumber = newNumber - 1;
										
					break;
					
				}
				
			}
		
		}
		
		for (i = 0; i < numberOfEntries; i = i + 1) {
			
			negativeLabel = (these.get(i)).getLabelNumber();
			
			negativeLabel = negativeLabel * -1;
			
			(these.get(i)).setLabelNumber(negativeLabel);
			
		}
		
		printLabelNumbers(these);
		
		return;
		
	}

	static void printLabelNumbers(Vector<Action> these) {
		
		int numberOfEntries = these.size();
		
		int i = 0;
		
		System.out.println("Label Number Output: ");

		for (i = 0; i < numberOfEntries; i = i + 1) {
			
			System.out.print( (these.get(i)).getName() );
			System.out.print("\t : ");
			System.out.println( (these.get(i)).getLabelNumber() );
			
		}
		
		System.out.println();
		
		return;
		
	}
	
}
