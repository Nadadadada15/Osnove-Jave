package d_7_9_2023;

// Zadatak 1: Kreiranje klase "Student"
//Napišite klasu "Student" koja ima sledeće atribute: ime (String),
// brojIndeksa (int) i fakultet (String).
// Kreirajte 2-3 objekta ove klase u glavnoj metodi i postavite im vrednosti.
// Ispisati informacije o studentima.
public class Zadatak1 {
    public static void main(String[] args) {

        Student osoba1 = new Student();
        Student osoba2 = new Student();
        Student osoba3 = new Student();

        osoba1.ime = "Pera Peric";
        osoba1.brojIndeksa = 234;
        osoba1.fakultet = "Masinski fakultet";

        osoba2.ime = "Mara Maric";
        osoba2.brojIndeksa = 187;
        osoba2.fakultet = "PMF";

        osoba3.ime = "Vuk Vukovic";
        osoba3.brojIndeksa = 998;
        osoba3.fakultet = "Ekonomski fakultet";


        System.out.println( "Informacije o studentu: " + osoba1.ime + ", " + osoba1.brojIndeksa + ", " + osoba1.fakultet + ".");
        System.out.println( "Informacije o studentu: " + osoba2.ime + ", " + osoba2.brojIndeksa + ", " + osoba2.fakultet + ".");
        System.out.println( "Informacije o studentu: " + osoba3.ime + ", " + osoba3.brojIndeksa + ", " + osoba3.fakultet + ".");
    }
}
