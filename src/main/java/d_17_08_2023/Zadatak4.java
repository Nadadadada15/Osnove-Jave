package d_17_08_2023;

import java.util.Scanner;

// Napisati program koji proverava da li je kliknuto u okviru login forme za web stranicu.
// Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.


public class Zadatak4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println( "Unesite x za T1");
        int x1 = s.nextInt();
        System.out.println( "Unesite y za T1");
        int y1 = s.nextInt();
        System.out.println( "Unesite y za T2");
        int y2 = s.nextInt();
        System.out.println( "Unesite x za T2");
        int x2 = s.nextInt();
        System.out.println( "Unesite x za M");
        int xm = s.nextInt();
        System.out.println( "Unesite y za M");
        int ym = s.nextInt();

        if ((x1<xm && y1>ym) && (xm<x2 && ym>y2) )  {
            System.out.println( "Kliknuto je unutar forme"); }
        else {
            System.out.println( "Nije kliknuto je unutar forme");}


        }
























    }

