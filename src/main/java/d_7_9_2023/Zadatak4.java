package d_7_9_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        Film prvi = new Film();
        Film drugi = new Film();

        Scanner s = new Scanner(System.in);

        System.out.print( "Unesite naslov filma: ");
        prvi.naslov = s.next();
        System.out.print( "Unesite godinu premijere: ");
        prvi.godinaIzdanja = s.nextInt();
        System.out.print( "Unesite rezisera: ");
        prvi.reziser = s.next();


        System.out.print( "Unesite naslov filma: ");
        drugi.naslov = s.next();
        System.out.print( "Unesite godinu premijere: ");
        drugi.godinaIzdanja = s.nextInt();
        System.out.print( "Unesite rezisera: ");
        drugi.reziser = s.next();

        System.out.println( " Informacije o filmu: " + prvi.naslov + ", " + prvi.godinaIzdanja + ", " + prvi.reziser + ".");
        System.out.println( " Informacije o filmu: " + drugi.naslov + ", " + drugi.godinaIzdanja + ", " + drugi.reziser + ".");













    }
}
