import java.util.ArrayList;
import java.util.function.Predicate;

import java.util.List;

public class BookManager {
	private static List<Book> bookList;

	public BookManager() {
		bookList = new BookCatalog().getCatalog();
	}

	public static List<Book> getBooks(Predicate<Book> condition) {
		List<Book> filteredBooks = new ArrayList<>();
		for (Book b : bookList) {
			if (condition.test(b)) {
				filteredBooks.add(b);
			}
		}
		return filteredBooks;
	}
}
