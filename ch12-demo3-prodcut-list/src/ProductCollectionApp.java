import java.util.ArrayList;

public class ProductCollectionApp {

	public static void main(String[] args) {
	System.out.println("Hello");
	
	ArrayList<Product> products = new ArrayList<>();
	//add products
	products.add(new Product("java","murach's java",57.50)); 
	products.add(new Product("android","Murach's Android",59.50));
	products.add(new Product("mySQL","Murach's MySQL",57.50));
	
	String code = "android";
	for(Product p: products) {
		if (p.getCode().equalsIgnoreCase(code)) {
			System.out.println("Product found!"+p.toString());
			System.out.println("Index Position:"+products.indexOf(p));
			
		}
	}
	
	
	System.out.println("Bye");

	}

}
