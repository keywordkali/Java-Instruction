package business;

public class Actor {
	private   int    actorID;
	private   String actorFirstName; // define instance variables
	private   String actorLastName;
	private   String actorGender;
	private   String actorBirthdate;

	// define empty constrictor
	public Actor() {
		
		actorFirstName = "";
		actorLastName = "";
		actorGender = "";
		actorBirthdate = "";

	} // define fully loaded constrictor

	public void setactorFirstName(String actorFirstName) {
		this.actorFirstName = actorFirstName;
	}

	public Actor(int actorID, String actorFirstName, String actorLastName, String actorGender,
			String actorBirthdate) {
		super();
		this.actorID = actorID;
		this.actorFirstName = actorFirstName;
		this.actorLastName = actorLastName;
		this.actorGender = actorGender;
		this.actorBirthdate = actorBirthdate;
	}

	public int getActorID() {
		return actorID;
	}

	public void setActorID(int actorID) {
		this.actorID=actorID;
	}

	public String getActorFirstName() {
		return actorFirstName;
	}

	public void setActorFirstName(String actorFirstName) {
		this.actorFirstName = actorFirstName;
	}

	public String getActorLastName() {
		return actorLastName;
	}

	public void setActorLastName(String actorLastName) {
		this.actorLastName = actorLastName;
	}

	public String getActorGender() {
		return actorGender;
	}

	public void setActorGender(String actorGender) {
		this.actorGender = actorGender;
	}

	public String getActorBirthdate() {
		return actorBirthdate;
	}

	public void setActorBirthdate(String actorBirthdate) {
		this.actorBirthdate = actorBirthdate;
	}

	public String displayActor() {
		String str = "-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\n";
		str += "-+-+-+-+-+-+-+-+-+-+-Actor-+-+-+-+-+-+-+-+-+-+-+-+-+\n";
		str += "-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-\n";
		str += "Actor ID: \t\t\t" + actorID + " " + "\n";
		str += "Actor Name:\t\t" + actorFirstName + " " + actorLastName + "\n";
		str += "Gender:\t\t\t\t" + (actorGender.equalsIgnoreCase("M")?"Male":"Female") + "\n";
		str += "Born on:\t\t" + actorBirthdate + "\n";
		str += "-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\n";

		return str;
	}

}