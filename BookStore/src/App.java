import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    BookStore books = new BookStore();

    int choice;
    do {
      System.out.println("==== Menu Utema ====");
      System.out.println("1. Tambah Buku");
      System.out.println("2. Lihat Semua Buku");
      System.out.println("3. Edit Buku");
      System.out.println("4. Hapus Buku");
      System.out.println("0. Keluar Buku");
      System.out.print("Pilih: ");
      choice = input.nextInt();
      input.nextLine();
      switch (choice) {
        case 1:
          System.out.print("Masukkan ID Buku: ");
          String id = input.nextLine();
          System.out.print("Masukkan Judul Buku: ");
          String title = input.nextLine();
          System.out.print("Masukkan Penulis Buku: ");
          String author = input.nextLine();
          System.out.print("Masukkan Harga Buku: ");
          double price = input.nextDouble();
          input.nextLine();

          books.addBook(id, title, author, price);
          break;
        case 2:
          books.diplayAllBook();
          break;
        case 3:
          System.out.print("Masukkan ID Buku: ");
          String editId = input.nextLine();
          Book bookToEdit = books.findBook(editId);

          if (bookToEdit == null) {
            System.out.println("Buku Tidak ditemukan");
            break;
          }

          System.out.print("Masukkan Judul Buku: ");
          String newTitle = input.nextLine();
          System.out.print("Masukkan Penulis Buku: ");
          String newAuthor = input.nextLine();
          System.out.print("Masukkan Harga Buku: ");
          String newPrice = input.nextLine();

          books.editBook(editId, newTitle, newAuthor, newPrice);
          break;
        case 4:
          System.out.print("Masukkan ID Buku: ");
          String deleteId = input.nextLine();
          Book bookToDelete = books.findBook(deleteId);

          books.deleteBook(deleteId);
          break;
        case 0:
          System.out.println("Terima Kasih! ");
          return;
          default:
            System.out.println("Pilihan Tidak Valid!");
            break;
          }
        } while (choice != 0);
        input.close();
  }
}