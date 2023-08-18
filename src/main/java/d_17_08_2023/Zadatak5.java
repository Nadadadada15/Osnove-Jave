package d_17_08_2023;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("UNESITE VREDNOST a: ");
        double a = s.nextDouble();
        System.out.print("UNESITE VREDNOST b: ");
        double b = s.nextDouble();
        System.out.print("IZABERITE OPERATOR (+,-,*,/):");
        String z = s.next();
        double c = a + b;
        double d = a - b;
        double e = a * b;
        double f = a / b;

        if (z.equals("+")) {
            System.out.println("Rezultat: " + c);
        }
        if (z.equals("-")) {
            System.out.println("Rezultat: " + d);
        }
        if (z.equals("*")) {
            System.out.println("Rezultat: " + e);
        }
        if (z.equals("/")) {
            System.out.println("Rezultat: " + f);
        }


    }


}
