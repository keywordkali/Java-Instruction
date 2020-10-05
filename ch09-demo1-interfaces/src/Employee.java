
public class Employee extends Person implements Printable, DepartmentConstance {
private String sSN;
private int department;
		public Employee() {  // define instance variables
		super();
		}

		public Employee(String firstName, String lastName, String sSN, int dept) {  // define instance variables
			super(firstName, lastName);
			this.sSN = sSN;
			this.department = dept;
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
//return firstname lastname (deptDescription)
		@Override
		public void print() {
			String dept = "Unknown";
			if (department == ADMIN) {
				dept = "Administration";
			}
			else if (department == EDITORIAL) {
				dept = "Editorial";
			}
			else if (department == MARKETING) {
				dept = "Marketing";
			}
		System.out.println(firstName+" "+lastName+ "("+dept+")");
		}

		

	}


