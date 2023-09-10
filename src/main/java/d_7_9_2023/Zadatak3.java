package d_7_9_2023;

public class Zadatak3 {
    public static void main(String[] args) {

        Proizvod prvi = new Proizvod();
        Proizvod drugi = new Proizvod();
        Proizvod treci = new Proizvod();

        prvi.naziv = "Karmin";
        prvi.cena = 440;

        drugi.naziv = "Torba";
        drugi.cena = 5000;

        treci.naziv= "Cipele";
        treci.cena = 7000;


        System.out.println( "Informacije o proizvodu: " + prvi.naziv + ", " +   prvi.cena + " rsd.");
        System.out.println( "Informacije o proizvodu: " + drugi.naziv + ", " +   drugi.cena + " rsd.");
        System.out.println( "Informacije o proizvodu: " + treci.naziv + ", " +   treci.cena + " rsd.");












    }
}
