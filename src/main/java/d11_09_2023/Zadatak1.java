package d11_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

 Author autor1 = new Author("J.K Rowling");
 Author autor2 = new Author("Oscar Wilde");

  Book book1 = new Book("neki isbn", "Harry Potter", autor1);
  book1.setYear(1998);
  Book book2 = new Book("neki drugi isbn", "Dorian Gray", autor2);
book2.setYear(1891);

book1.printIt();

book2.printIt();











    }
}
