
public class Employee extends Person {
private String sSN;

		public Employee() {  // define instance variables
		super();
		}

		public Employee(String firstName, String lastName, String sSN) {  // define instance variables
			super(firstName, lastName);
			this.sSN = sSN;
			}
		

		

		public String getsSN() {
			return sSN;
		}

		

		public void setsSN(String sSN) {
			this.sSN = sSN;
		}

		@Override
		public String toString() {
			return super.toString()+"\n"+ "SSN: " + sSN;
		}

		

	}


