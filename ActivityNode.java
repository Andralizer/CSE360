
public class ActivityNode{
	
	//Declaring the Variables
	private String activity;
	private int duration;
	private String predecessor;
	
	//Default Constructor that intializes everything
	public ActivityNode() {
		activity = "";
		duration = 0;
		predecessor = "";
	}
	
	//Paremeter-wise Constructors 
	public ActivityNode(String activity, int duration, String predecessor) {
		this.activity = activity;
		this.duration = duration;
		this.predecessor = predecessor;
	}
	
	/*Accessor Methods*/
	public String getActivity() {
		return activity;
	}
	
	public int getDuration() {
		return duration; 
	}
	
	public String getPred() {
		return predecessor; 
	}
	
	/*Setter Methods*/
	public void setActivity(String activity) {
		this.activity = activity;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public void setPredecessor(String predecessor) {
		this.predecessor = predecessor;
	}
	
	//Override the right method from the object class
	@Override
	public String toString() {
		return activity + "\t" + duration + "\t" + predecessor;
	}
	
	
	
	
	
	
	
}
