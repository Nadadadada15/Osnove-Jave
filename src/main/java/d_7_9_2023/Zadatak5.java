package d_7_9_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

         Oprema prva = new Oprema();
         Oprema druga = new Oprema();
         Oprema treca = new Oprema();

        System.out.print( "Unesite tip:");
        prva.tip=s.next();
        System.out.print( "Unesite marku: ");
        prva.marka=s.next();
        System.out.print( "Unesite cenu: ");
        prva.cena=s.nextDouble();


        System.out.print( "Unesite tip");
        druga.tip=s.next();
        System.out.print( "Unesite marku: ");
        druga.marka=s.next();
        System.out.print( "Unesite cenu: ");
        druga.cena=s.nextDouble();


        System.out.print( "Unesite tip");
        treca.tip=s.next();
        System.out.print( "Unesite marku: ");
        treca.marka=s.next();
        System.out.print( "Unesite cenu: ");
        treca.cena=s.nextDouble();


        System.out.println( "Informacije o proizvodu: " + prva.tip + ", " + prva.marka + ", " + prva.cena + " rsd.");
        System.out.println( "Informacije o proizvodu: " + druga.tip + ", " + druga.marka + ", " + druga.cena + " rsd.");
        System.out.println( "Informacije o proizvodu: " + treca.tip + ", " + treca.marka + ", " + treca.cena + " rsd.");










    }
}
