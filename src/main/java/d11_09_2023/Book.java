package d11_09_2023;

public class Book {

    private String isbn;
    private String title;

    private int year;

    private Author author;


    public Book(String isbn, String title, Author author) {

        this.isbn = isbn;
        this.title = title;
        this.author = author;

    }


    public void printIt () {

        System.out.println("ISBN: " + this.isbn);
        System.out.println( "Naslov: " + this.title + " - " + this.year);
        System.out.println("Autor: " + this.author.getFullName());



    }










// get i set

    public String getIsbn() {

        return this.isbn;
    }


/*public void setIsbn (String newIsbn) {

   this.isbn =  newIsbn;

}*/

    public String getTitle() {

        return this.title;
    }

/*
    public void setTitle(String newTitle) {

        this.title = newTitle;
    }
*/

    public int getYear() {
        return this.year;

    }

    public void setYear(int newYear) {


        this.year = newYear;
    }


    public Author getAuthor() {

        return this.author;
    }


}
