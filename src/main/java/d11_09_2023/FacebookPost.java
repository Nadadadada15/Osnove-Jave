package d11_09_2023;

public class FacebookPost {


    private String description;

    private User user;


FacebookPost ( String description, User user) {

    this.description = description;
    this.user = user;

}


public void printIt () {

    System.out.println("Korisnik: " + this.user.getName() + " " + this.user.getLastName());
    System.out.println("Objava: " + this.description);
}




















}
