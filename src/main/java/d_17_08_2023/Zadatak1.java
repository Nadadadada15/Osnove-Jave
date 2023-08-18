package d_17_08_2023;

//Napisati program koji ima informacije koje ucitava informacije sa tastature:
//Ime
//Prezime
//godinu rodjenja
//I stampa informaicije u formatu:
//[ime] [prezime] - [startost] god


import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println( "UNESITE IME");
        String ime = s.next();
        System.out.println( "UNESITE PREZIME");
        String prezime = s.next();
        System.out.println( "UNESITE STAROST");
        String god = s.next();

        System.out.println( ">*************POCETAK*************<");

        System.out.println( ime + " " + prezime + "-" + god + " god.");

        System.out.println( "*********K R A J*****+++***");










    }
}
