import java.util.*;

public class GetOutput {

	static void getAllOutput(Vector<Action> these, Vector<String> results) {
		
		int predecessorTotal = findPredecessorTotalForObjectVector(these);
		
		int outputTotal = predecessorTotal + 1;
		
		int i = 0;
		
		for (i = 0; i < outputTotal; i = i + 1) {
			
			calculateResultsForCurrentLargestPathAndUpdate(these, results);
			
		}
		
		return;
		
	}
	
	static void calculateResultsForCurrentLargestPathAndUpdate(Vector<Action> these, Vector<String> results) {
		
		System.out.println();
		System.out.println("CALCULATING PATH LENGTH");
		System.out.println("=======================");
		System.out.println();
		
		int pathLength = 0;
		
		int i = 0;
		
		int topOfPath = findTopIndex(these);
		
		int activeIndex = topOfPath;
		
		int largestPredecessorIndex = -1; // findLargestPredecessorIndex(these, topOfPath);
		
		int numberOfActions = these.size();
		
		int calculatingPathLength = 1;
		
		Action activeAction = null;
		
		int activeDuration = -1;
		
		int durationOfTop = (these.get(topOfPath)).getDuration();
		
		String activeName = null;
		
		String outputName = null;
		
		String resultLength = null;
		
		//printPathLength(pathLength);
			
		System.out.print("Duration Of Top: ");
		System.out.println(durationOfTop);
		System.out.println();
		
		while (calculatingPathLength == 1) {
			
			for (i = 0; i < numberOfActions; i = i + 1) {
				
				if (i == activeIndex) {
					
					activeAction = these.get(i);
					
					activeName = activeAction.getName();
					
					if (outputName == null) {
						
						outputName = activeName;
						
					}
					else {
						
						outputName = outputName + " -> " + activeName;
						
					}
					
					activeDuration = activeAction.getDuration();
					
					pathLength = pathLength + activeDuration;
					
					printPathLength(pathLength);
					
					largestPredecessorIndex = findLargestPredecessorIndex(these, activeIndex);
					
					activeIndex = largestPredecessorIndex;
					
					if (activeIndex == -1) {
						
						calculatingPathLength = 0;
						
					}
					
					break;
					
				}
				
			} // << End Of For Loop
			
		} // << End Of While Loop
		
		
		System.out.print("Output Name: ");
		System.out.println(outputName);
		
		results.addElement(outputName);
		
		System.out.print("Ending ");
		printPathLength(pathLength);
		
		resultLength = "" + pathLength;
		
		results.addElement(resultLength); 
		
		//results.addElement("\n ");
		
		System.out.println("Unorganized Results: ");
		System.out.println(results);
		
		deleteLargestPredecessor(these, topOfPath);
		
		return;
		
	}
	
	static int findTopIndex(Vector<Action> these) {
		
		int i = 0;
		
		int topSearch = 1;
		
		int topIndex = -1;
		
		int numberOfEntries = these.size();
		
		int consideringForTop = 1;
		
		int activeLabelNumber = -1;
		
		int activeObjectPredecessorNumber = -1;
		
		Action activeObject = null;
		
		while (topSearch == 1) {
			
			for (i = 0; i < numberOfEntries; i = i + 1) {
				
				activeObject = these.get(i);
				
				activeLabelNumber = activeObject.getLabelNumber();
				
				if ( activeLabelNumber == consideringForTop) {
					
					activeObjectPredecessorNumber = (activeObject.getPredecessors()).size();
					
					if ( activeObjectPredecessorNumber > 0) {
						
						topIndex = i;
						
						System.out.print("Index Of Top: ");
						System.out.println(topIndex);
						System.out.println();
						
						return topIndex;
						
					}
					else {
						
						consideringForTop = consideringForTop + 1;
						
						if (consideringForTop > numberOfEntries) {
							
							return topIndex; // << Valued At -1
							
						}
						
						break;
						
					}
					
				}
				
			} // << End For Loop
			
			consideringForTop = consideringForTop + 1; // << For When Top Is Deleted
			
		} // << End While Loop
		
		return topIndex;
		
	}
	
	static int findLargestPredecessorIndex(Vector<Action> these, int actionIndex) {
		
		Action activeAction = (these.get(actionIndex));
		
		activeAction.printPredecessorDurations();
		
		Vector<Integer> predecessorDurations = activeAction.getPredecessorOrder();
		
		int max = 0;
		
		int maxIndex = -1;
		
		int numberOfPredecessors = predecessorDurations.size();
		
		int i = 0;
		
		int numberOfActions = these.size();
		
		int largestPredecessorIndex = -1;
		
		String largestPredecessor = null;
		
		String activePredecessor = null;
		
		for (i = 0; i < numberOfPredecessors; i = i + 1) {
			
			if (predecessorDurations.get(i) > max) {
				
				max = predecessorDurations.get(i);
				
				maxIndex = i;
				
			}
			
		}
		
		System.out.print("Predecessor Vector Index Of Largest Predecessor: ");
		System.out.println(maxIndex);
		System.out.println();
		
		if (maxIndex == -1) {
			
			return maxIndex;
			
		}
		
		largestPredecessor = (activeAction.getPredecessors()).get(maxIndex);
		
		System.out.print("Largest Predecessor: ");
		System.out.println(largestPredecessor);
		System.out.println();
		
		for (i = 0; i < numberOfActions; i = i + 1) {
			
			activePredecessor = (these.get(i)).getName();
			
			if (largestPredecessor.equals(activePredecessor)){
				
				largestPredecessorIndex = i;
				
			}
			
		}
		
		System.out.print("Largest Predecessor Index: ");
		System.out.println(largestPredecessorIndex);
		System.out.println();
		
		return largestPredecessorIndex;
		
	}
	
	static void printPathLength(int length) {
		
		System.out.print("+++ Path Length: ");
		System.out.println(length);
		System.out.println();
		
		return;
		
	}
	
	static void deleteLargestPredecessor(Vector<Action> these, int topIndex) {
		
		Action activeAction = these.elementAt(topIndex);
		
		String activeName = activeAction.getName();
		
		int i = 0;
		
		int numberOfObjects = these.size();
		
		activeAction.printPredecessorDurations();
		
		if ( (activeAction.getPredecessors()).size() > 1 ) {
		
			System.out.print(activeName);
			System.out.println(" Contained Multiple Predecessors");
			System.out.println("Deleting Largest Predecessor");
			
			(these.elementAt(topIndex)).deleteLargestPredecessor();
			
			System.out.print("Objects: ");
			
			for (i = 0; i < numberOfObjects; i = i + 1) {
				
				System.out.print( (these.get(i)).getName() + " ");
				
			}
			
			System.out.println();
			
			these.elementAt(topIndex).printPredecessorDurations();
			
		}
		
		else {
			
			System.out.print(activeName);
			System.out.println(" Only Contained One Predecessor");
			System.out.print("Deleting ");
			System.out.println(activeName);
			
			these.removeElementAt(topIndex);
			
			System.out.print("Objects: ");
			
			numberOfObjects = these.size();
			
			for (i = 0; i < numberOfObjects; i = i + 1) {
				
				System.out.print( (these.get(i)).getName() + " ");
				
			}
			
			System.out.println();
			
		}
		
		return;
		
	}
	
	static int findPredecessorTotalForObjectVector(Vector<Action> these) {
		
		Action activeAction = null;
		
		int numberOfActions = these.size();
		
		int numberOfPredecessors = 0;
		
		int i = 0;
		
		int j = 0;
		
		int predecessorTotal = 0;
		
		Vector<String> activePredecessors = null;
		
		for (i = 0; i < numberOfActions; i = i + 1) {
			
			activeAction = these.get(i);
			
			activePredecessors = activeAction.getPredecessors();
			
			if (activePredecessors.get(0) != null) {
			
			numberOfPredecessors = activePredecessors.size();
			
				for (j = 0; j < numberOfPredecessors; j = j + 1) {
					
					predecessorTotal = predecessorTotal + 1;
					
				}
				
			}
				
		}
		
		System.out.print("Total Number Of Predecessors: ");
		System.out.println(predecessorTotal);
		
		return predecessorTotal;
		
	}
	
}
