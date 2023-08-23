package d_22_08_2023;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String I ="I";
        String V ="V";
        String X="X";
        String L ="L";
        String C ="C";
        String D ="D";
        String M ="M";
        System.out.println( "Unesite rimski broj: ");
        String roman=" ";
        boolean notEntered =true;

        while (notEntered) {
            roman=s.next();
            roman.toUpperCase(Locale.ROOT); // ali pise da ignorise naredbu  :(

            if (roman.equals("Kraj")) { notEntered = false;}

            if (roman.equals(I)) {System.out.println( "Arapksi broj je: 1");}
            if (roman.equals(V)) {System.out.println( "Arapksi broj je: 5");}
            if (roman.equals(X)) {System.out.println( "Arapksi broj je: 10");}
            if (roman.equals(L)) {System.out.println( "Arapksi broj je: 50");}
            if (roman.equals(C)) {System.out.println( "Arapksi broj je: 100");}
            if (roman.equals(D)) {System.out.println( "Arapksi broj je: 500");}
            if (roman.equals(M)) {System.out.println( "Arapksi broj je: 1000");}
            if (!(roman.equals("Kraj"))) {
            System.out.println( "Unesite rimski broj");}










        }

        System.out.println( "Program je zatvoren");













    }
}
