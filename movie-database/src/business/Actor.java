package business;

import java.time.LocalDate;

public class Actor {
	private   int    actorID;
	private   String actorFirstName; // define instance variables
	private   String actorLastName;
	private   String actorGender;
	private   LocalDate actorBirthdate;




	
	public Actor( String actorFirstName, String actorLastName, String actorGender, LocalDate actorBirthdate) {
	super();
	
	this.actorFirstName = actorFirstName;
	this.actorLastName = actorLastName;
	this.actorGender = actorGender;
	this.actorBirthdate = actorBirthdate;
}




	public int getActorID() {
		return actorID;
	}




	public void setActorID(int actorID) {
		this.actorID = actorID;
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




	public LocalDate getActorBirthdate() {
		return actorBirthdate;
	}




	public void setActorBirthdate(LocalDate actorBirthdate) {
		this.actorBirthdate = actorBirthdate;
	}




	public Actor() {
		super();
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
