import java.util.List;
import java.security.PublicKey;
import java.util.ArrayList;

public class BookStore {
  private List<Book> books;

  public BookStore(){
    books = new ArrayList<>();
  }

  // Menambahkan Buku
  public void addBook(String bookId, String bookTitle, String author, double price){
    books.add(new Book(bookId, bookTitle, author, price));
    System.out.println("Buku Berhasil ditambahkan");
  }

  //Menampilkan semua buku yang tersimpan
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

  //Mencari buku yang tersimpan Berdasarkan id yang dicari
  public Book findBook(String id){
    for (Book book : books) {
      if (book.getId().equals(id)) {
        return book;
      }
    }
    return null;
  }

  //Edit buku
  public void editBook(String id, String newTitle, String newAuthor, double newPrice){
    Book book = findBook(id);

    if (book == null) {
      System.out.println("Buku tidak ditemukan");
      return;
    }

    book.setBookTitle(newTitle);
    book.setAuthor(newAuthor);
    book.setPrice(newPrice);

    System.out.println("Buku berhasil diperbaruhi");
  }

  //Hapus buku
  public void deleteBook(String id){
    Book book = findBook(id);

    if (book == null) {
      System.out.println("Buku tidak ditemukan");
      return;
    }

    books.remove(book);
    System.out.println("Buku berhasil dihapus");
  }
}
