package d_18_8_2023;

/* 2.	Napisati program koji simulira stampanje ocitane licne karte u vise primeraka. Korisnik unosi podatke :
●	ime
●	prezime
●	jmbg
●	broj primeraka za stampu

*/
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println( "UNESITE IME");
        String ime = s.next();
        System.out.println( "UNESITE PREZIME");
        String prezime = s.next();
        System.out.println( "UNESITE JMBG");
        String jmbg = s.next();
        System.out.println( "UNESITE BROJ KOPIJA");
        int kopije= s.nextInt();

       // String pregled = ime + prezime + jmbg;

        for ( int i=0;i <= kopije;i ++) {
            System.out.println( "**************************");
            System.out.println( "IME I PREZIME: " + ime + " " + prezime );
            System.out.println("JMBG: " + jmbg);}
            System.out.println( "**************************");



    }
}
