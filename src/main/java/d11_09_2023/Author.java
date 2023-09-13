package d11_09_2023;

public class Author {

public String fullName;


public Author (String fullName) {

    this.fullName=fullName;
}


public void printIt () {

    System.out.println( "Puno ime autora: " + this.fullName);
}















//get i set


 public String getFullName () {

     return this.fullName;
 }


public void setFullName (String newFullName) {

     this.fullName = newFullName;
}




}
