package d_22_08_2023;

//	Napisati program koji proverava uparenost zagrada. Korisnik unosi matematicku formulu sve dok ne unese znak =. Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje da li su sve zagrade uparene.
//	Formula koja se koristi u primeru je: (2 * ( 1 + 3))=


import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        int otvorenaZ=0; //da bude deljiv sa dva  i da brojac odgovara
        int zatvorenaZ=0;
        String symb = "";
        Character equals = '=';
        boolean hasEqual= false;
        String errorExpl= "Fali poslednja zagrada";

        while(!hasEqual) {

            System.out.println( "Unesite simbol");
            symb=s.next();
            if (symb.equals("=")) {hasEqual=true; }
            if (symb.equals("(")) {otvorenaZ++;}
            if (symb.equals(")")) {zatvorenaZ++;}



        }
        if (otvorenaZ==zatvorenaZ) {
            System.out.println( "imate jednak broj otvorenih i zatvorenih zagrada");}

        if (!(otvorenaZ==zatvorenaZ)) {
            System.out.println( "nemate jednak broj otvorenih i zatvorenih zagrada");}














    }
}
