package d_8_9_2023;

public class Zadatak1 {
    public static void main(String[] args) {


        Proizvod proizvod1 = new Proizvod();
        Proizvod proizvod2 = new Proizvod();
        Proizvod proizvod3 = new Proizvod();


        proizvod1.ime = "Napolitanke";
        proizvod1.cena = 129;
        proizvod1.gramaza = 100;
        proizvod2.ime = "Kafa";
        proizvod2.cena = 220;
        proizvod2.gramaza = 150;
        proizvod3.ime = "Cokolada";
        proizvod3.cena = 450;
        proizvod3.gramaza = 300;


        System.out.println("***********PREGLED***********");
        System.out.println();
        proizvod2.stampaj();
        proizvod2.povecajCenu(50);
        System.out.println("Azuriran proizvod je: ");
        proizvod2.stampaj();
        System.out.println("Cena sa popustom za proizvod " + proizvod2.ime + " je " + proizvod2.vratiCenuSaPopustom(30));
        System.out.println("Postarina za proizvod " + proizvod2.ime + " je " + proizvod2.racunajPostarinu() + " rsd.");

        System.out.println();
        System.out.println("******Pregled drugog proizvoda******");
        System.out.println();

        proizvod1.stampaj();
        proizvod1.povecajCenu(60);
        System.out.println("Azuriran proizvod je: ");
        proizvod1.stampaj();

        double cenaSaPopustom = proizvod1.vratiCenuSaPopustom(50);
        System.out.println("Cena sa popustom za proizdov " + proizvod1.ime + " je " + cenaSaPopustom + " rsd.");
        System.out.println("Postarina za proizvod " + proizvod1.ime + " je " + proizvod1.racunajPostarinu() + " rsd.");
        System.out.println( );
        System.out.println( "-Kraj pregleda-");

    }
}
