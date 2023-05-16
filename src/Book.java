import java.util.Objects;

public class Book implements Comparable<Book> {

  public String autor;
  public String title;
  public int summer;

  public Book(String autor, String title, int summer) {
    this.autor = autor;
    this.title = title;
    this.summer = summer;
  }

  @Override
  public String toString() {
    return autor + " - \"" + title + "\" (" + summer + " pages)";
  }

  @Override
  public int compareTo(Book book) {
    if (autor.compareTo(book.autor) != 0) {
      return autor.compareTo(book.autor);
    }
    if (title.compareTo(book.title) != 0) {
      return title.compareTo(book.title);
    }
    return summer - book.summer;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Book book)) {
      return false;
    }
    return autor.equals(book.autor) && title.equals(book.title) && summer == book.summer;
  }

  @Override
  public int hashCode() {
    return Objects.hash(autor, title, summer);
  }
}
