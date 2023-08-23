package d_21_08_2023;

import java.util.Scanner;
//1.	Napisati program koji od korisnika ucitava N brojeva i sabira samo parne brojeve.
// Na kraju programa prikazati sumu.
public class Zadatak1 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println( "Broj unosa ");
        int brUnosa = s.nextInt();
        int suma = 0;

        for (int i = 0; i < brUnosa; i++) {

            System.out.println( "Unesite broj: ");
            int broj = s.nextInt();

            if (broj%2==0) {

           suma = suma + broj;}


        }


        System.out.println( "Suma je: "+ suma);




















    }
}
