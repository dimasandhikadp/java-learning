import java.util.List;
import java.util.ArrayList;

public class BookStore {
  private List<Book> books;

  public BookStore(){
    books = new ArrayList<>();
  }

  public void addBook(String bookId, String bookTitle, String author, double price){
    books.add(new Book(bookId, bookTitle, author, price));
    System.out.println("Buku Berhasil ditambahkan");
  }

  public void diplayAllBook(){
    if (books.isEmpty()) {
      System.out.println("Belum ada buku.");
      return;
    }
    for (Book book : books) {
      System.out.println(
        book.getId() + " | " + 
        book.getBookTitle() + " | " + 
        book.getAuthor() + " | Rp." + 
        book.getPrice()
      );
    }
  }

  public Book findBook(String id){
    for (Book book : books) {
      if (book.getId().equals(id)) {
        return book;
      }
    }
    return null;
  }

  
}
