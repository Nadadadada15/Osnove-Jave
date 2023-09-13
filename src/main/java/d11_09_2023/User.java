package d11_09_2023;

public class User {

   private String name;
   private String lastName;

public  User ( String name, String lastName) {

    this.lastName= lastName;
    this.name = name;

}



public void printIt () {

    System.out.println( "Ime i Prezime" + this.name + " " + this.lastName) ;
}





   //get i set


    public String getName () {

        return this.name;
    }


    public String getLastName () {

        return  this.lastName;
    }





}
