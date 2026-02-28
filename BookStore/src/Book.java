public class Book {  
  private String bookId;
  private String bookTitle;
  private String author;
  private double price;

  public Book(String bookId, String bookTitle, String author, double price){
    this.bookId = bookId;
    this.bookTitle = bookTitle;
    this.author = author;
    this.price = price;
  }

  //Getter 
  public String getId(){
    return bookId;
  }
  public String getBookTitle(){
    return bookTitle;
  }
  public String getAuthor(){
    return author;
  }
  public double getPrice(){
    return price;
  }

  //Setter
  public void setBookTitle(String bookTitle){
    this.bookTitle = bookTitle;
  }
  public void setAuthor(String author){
    this.author = author;
  }
  public void setPrice(double price){
    this.price = price;
  }
}

