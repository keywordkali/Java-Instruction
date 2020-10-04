
public class PRSConsoleApp {

	public static void main(String[] args) {

		String choice = Console.getString("Command: ");
		System.out.println();

		switch (choice) {

		case "1":
			User u = new User();
			System.out.println("Add a User:");
			u.setId(Console.getInt("ID:"));
			u.setUserName(Console.getRequiredString("Username: "));
			u.setPassword(Console.getRequiredString("Password:"));
			u.setFirstName(Console.getRequiredString("First Name:"));
			u.setLastName(Console.getRequiredString("Last Name:"));
			u.setPhoneNumber(Console.getRequiredString("Phone Number: "));
			u.setEmail(Console.getRequiredString("Email:"));
			u.setReviewer(Console.getBoolean("Is Reviewer:"));
			u.setAdmin(Console.getBoolean("Is Admin:"));
			System.out.println(u.displayUser());
			break;

		case "2":
			Vendor v = new Vendor();
			System.out.println("Add a Vendor");
			v.setId(Console.getInt("ID:"));
			v.setCode(Console.getRequiredString("Code: "));
			v.setName(Console.getRequiredString("Name: "));
			v.setAddress(Console.getRequiredString("Address: "));
			v.setCity(Console.getRequiredString("City: "));
			v.setState(Console.getRequiredString("State: "));
			v.setZip(Console.getRequiredString("Zip: "));
			v.setPhoneNumber(Console.getRequiredString("Phone Number: "));
			v.setEmail(Console.getRequiredString("Email:"));
			System.out.println(v.displayVendor());
			break;

		case "3":
			Product p = new Product();
			System.out.println("Add a Product");
			p.setId(Console.getInt("ID:"));
			p.setVendorId(Console.getInt("Vendor Id: "));
			p.setPartNumber(Console.getRequiredString("Part Number: "));
			p.setName(Console.getRequiredString("Name: "));
			p.setPrice(Console.getDouble("Price: "));
			p.setUnit(Console.getRequiredString("Unit: "));
			p.setPhotoPath(Console.getRequiredString("Photopath: "));
			System.out.println(p.displayProduct());
			break;

		case "4":
			Request r = new Request();
			System.out.println("Add a Request");
			r.setId(Console.getInt("ID:"));
			r.setUserId(Console.getInt("User Id: "));
			r.setJustification(Console.getRequiredString("Justification: "));
			r.setDateNeeded(Console.getRequiredString("Date Needed: "));
			r.setDeliveryMode(Console.getRequiredString("Delivery Mode: "));
			r.setStatus(Console.getRequiredString("Status: "));
			r.setTotal(Console.getDouble("Total: "));
			r.setSubmittedDate(Console.getRequiredString("Submitted Date: "));
			r.setReasonForRejection(Console.getRequiredString("Reason For Rejection: "));
			System.out.println(r.displayRequest());
			break;

		case "5":
			LineItem l = new LineItem();
			System.out.println("Add a Line Item");
			l.setId(Console.getInt("ID:"));
			l.setRequestId(Console.getInt("Request Id: "));
			l.setProductId(Console.getInt("Product Id: "));
			l.setQuantity(Console.getInt("Quantity: "));
			System.out.println(l.displayLineItem());
			
		}
		System.out.println("Bye.");
	}

}
