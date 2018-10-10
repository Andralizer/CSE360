
import java.util.*;

public class FormatResults {
	
	static void orderResults(Vector<String> organizeMe, Vector<String> finalResults) {
		
		int i = 0;
		
		int sizeOfIncomingStringToOrganize = organizeMe.size();
		
		int numberOfGroupingsOfTwo = sizeOfIncomingStringToOrganize / 2;
		
		for (i = 0; i < numberOfGroupingsOfTwo; i = i + 1) {
		
			int largestLabelIndex = findIndexOfLargestResult(organizeMe);
			
			int largestLengthIndex = largestLabelIndex + 1;
			
			System.out.print("Largest Index: ");
			System.out.println(largestLabelIndex);
			
			String activeLargestLabel = organizeMe.get(largestLabelIndex);
			
			String activeLargestLength = organizeMe.get(largestLengthIndex);
			
			finalResults.add(activeLargestLabel);
			
			finalResults.add(activeLargestLength);
			
			System.out.println(finalResults);
			
			removeLargestIndex(organizeMe, largestLabelIndex);
			
		}
		
		return;
		
	}
	
	static int findIndexOfLargestResult(Vector<String> organizeMe) {
		
		int maxLength = -1;
		
		int maxLengthIndex = -1;
		
		int i = 1;
		
		int integerValue = -1;
		
		int entriesWithinResults = organizeMe.size();
		
		int largestResultIndex = -1;
		
		String activeNumber = null;
		
		for (i = 1; i < entriesWithinResults; i = i + 2) {
			
			activeNumber = organizeMe.get(i);
			
			integerValue = Integer.parseInt(activeNumber);
			
			if (integerValue > maxLength) {
				
				maxLength = integerValue;
				
				maxLengthIndex = i;
				
			}
			
		}
		
		largestResultIndex = maxLengthIndex - 1;
		
		return largestResultIndex;
		
	}

	static void removeLargestIndex(Vector<String> organizeMe, int largestLabelIndex) {
		
		organizeMe.removeElementAt(largestLabelIndex);
		
		organizeMe.removeElementAt(largestLabelIndex);
		
		
		System.out.println("Deletion Complete");
		System.out.print("Remaining To Organize: ");
		System.out.println(organizeMe);
		
		return;
		
	}
	
}
