import java.util.*;

public class PrintResults {

	static void output(Vector<String> finalResults) {
		
		int i = 0;
		
		int iterations = finalResults.size();
		
		String activeLabel = null;
		
		String activeLength = null;
		
		System.out.println("\n");
		
		System.out.println("FINAL RESULTS");
		System.out.println("=============");
		
		for (i = 0; i < iterations; i = i + 1) {
			
			if (i % 2 == 0) {
				
				activeLabel = finalResults.get(i);
				
				System.out.print(activeLabel);
				
				System.out.print("\t");
				
			}
			else {
				
				activeLength = finalResults.get(i);
				
				System.out.println(activeLength);
				
			}
			
			
		} // << End For Loop
		
		
		return;
		
	}
	
}
