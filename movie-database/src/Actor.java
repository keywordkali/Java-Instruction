
public class Actor {

	private static String actorFirstName; // define instance variables
	private static String actorLastName;
	private static String actorGender;
	private static String actorBirthdate;

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

	public Actor(String actorFirstName, String actorLastName, String actorGender, String actorBirthdate) {
		super();
		this.actorFirstName = actorFirstName;
		this.actorLastName = actorLastName;
		this.actorGender = actorGender;
		this.actorBirthdate = actorBirthdate;
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

	public static String displayActor() {
		String str = "-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\n";
		str += "-+-+-+-+-+-+-+-+-+-+-Actor-+-+-+-+-+-+-+-+-+-+-+-+-+\n";
		str += "-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-\n";
		str += "Actor Name:\t\t" + actorFirstName + " " + actorLastName + "\n";
		str += "Gender:\t\t\t\t" + actorGender + "\n";
		str += "Birthdate:\t\t" + actorBirthdate + "\n";
		str += "-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\n";

		return str;
	}

}
