package d_7_9_2023;

public class Zadatak2 {
    public static void main(String[] args) {



        Automobil prvi = new Automobil();
        Automobil drugi = new Automobil();


        prvi.marka= "BMW" ;
        prvi.model = "X6 Sport";
        prvi.godinaProizvodnje = 2022;



        drugi.marka= "Mazda" ;
        drugi.model = "CX-90";
        drugi.godinaProizvodnje = 2023;

        System.out.println( "Informacije o automobilu: " + prvi.marka + ", " + prvi.model + ", "+ prvi.godinaProizvodnje);
        System.out.println( "Informacije o automobilu: " + drugi.marka + ", " + drugi.model + ", "+ drugi.godinaProizvodnje);



    }






}
