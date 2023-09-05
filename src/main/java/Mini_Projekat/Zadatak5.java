package Mini_Projekat;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//5.	**Zadatak: Generisanje Random Passworda sa Specijalnim Karakterom**
//
//Kako biste saznali više o generisanju random brojeva u programiranju, preporučujemo da istražite sledeći link:
// random koristeci Random class. Ovaj resurs će vam pružiti detaljnije razumevanje kako programi generišu slučajne brojeve
// i kako ih možete koristiti u različitim situacijama.
//
//Napišite program koji simulira automatsko generisanje random passworda. Korisnik će uneti željenu dužinu passworda,
// a program će kreirati i ispisati password koji zadovoljava te parametre. Ovaj zadatak zahteva implementaciju
// različitih metoda za generisanje karaktera i passworda.
//●	generisiRandomKarakter: Ova metoda generiše i vraća random karakter. Metoda koristi niz stringova sa elementima
// koji predstavljaju mala slova, velika slova i brojeve (niz je sa fiksnim vrednostima). Random bira jedan element iz
// niza i vraća ga kao povreatnu vrednost (string). Ova metoda nema ulazne parametre.
//●	generisiRandomSpecijalanKarakter: Ova metoda generiše i vraća random specijalan karakter. Metoda koristi niz
// stringova sa elementima `@`, `#`, `&`, `*` i `!` (niz je sa fiksnim vrednostima). Random bira jedan element iz
// niza i vraća ga kao string. Ova metoda nema ulazne parametre.
public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("Unesite zeljenu duzinu passworda: ");
        int passLenght = s.nextInt();
        System.out.println("Da li zelite da sadrzi specijalni karakter?");
        boolean shouldContainSpecialSymbols = s.nextBoolean();
        String newPass = "";


        newPass = generatePasswrod(passLenght, shouldContainSpecialSymbols);
        System.out.println(newPass);


    }


    public static String generatePasswrod(int passLength, boolean shouldContainSpecialSymbols) {

        String generator = "";

        for (int i = 1; i <= passLength; i++) {
            if (shouldContainSpecialSymbols) {
                Random rand = new Random();
// randomizes if next char should be special or normal character
                boolean shouldGenerateSymbol = rand.nextBoolean();
                if (shouldGenerateSymbol) {
                    generator = generator + genereteRandSymb();
                } else {
                    generator = generator + generateRandChar();
                }
                ;

            } else {
                generator = generator + generateRandChar();
            }


        }

        return generator;


    }

    public static String generateRandChar() {

        ArrayList<String> randChar = new ArrayList<>();
        randChar.add("a");
        randChar.add("2");
        randChar.add("e");
        randChar.add("3");
        randChar.add("i");
        randChar.add("4");
        randChar.add("o");
        randChar.add("5");
        randChar.add("u");
        randChar.add("6");
        randChar.add("C");
        randChar.add("7");
        randChar.add("D");
        randChar.add("8");
        randChar.add("E");
        randChar.add("9");
        randChar.add("F");
        randChar.add("10");
        randChar.add("G");
        randChar.add("j");
        randChar.add("A");
        randChar.add("k");
        randChar.add("H");
        randChar.add("N");
        randChar.add("c");
        randChar.add("M");
        randChar.add("z");
        randChar.add("L");
        randChar.add("x");
        randChar.add("p");
        randChar.add("Y");
        randChar.add("s");
        randChar.add("1");
        randChar.add("r");
        Random rand = new Random();

        return randChar.get(rand.nextInt(randChar.size() - 1));


    }


    public static String genereteRandSymb() {

        ArrayList<String> randSymbol = new ArrayList<>();
        randSymbol.add("@");
        randSymbol.add("!");
        randSymbol.add("#");
        randSymbol.add("&");
        randSymbol.add("*");

        Random rand = new Random();

        return randSymbol.get(rand.nextInt(randSymbol.size() - 1));


    }


}
