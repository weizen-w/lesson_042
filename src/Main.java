import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    books.add(new Book("Autor 1", "Title 1", 100));
    books.add(new Book("Autor 2", "Title 2", 300));
    books.add(new Book("Autor 1", "Title 2", 100));
    books.add(new Book("Autor 2", "Title 2", 100));
    books.add(new Book("Autor 1", "Title 1", 300));
    books.add(new Book("Autor 2", "Title 1", 100));
    System.out.println(books);
    Collections.sort(books);
    System.out.println(books);
  }
}
