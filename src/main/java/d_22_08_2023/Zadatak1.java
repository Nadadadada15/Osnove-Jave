package d_22_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int suma = 0;
        int broj = 0;
        boolean not100=true;


        while (not100) {
            System.out.println( "Unesite neki broj: ");
            broj=s.nextInt();
            suma = suma +broj;

            if (suma>100) { not100=false;
                System.out.println( "Prekoracenje! Kraj programa. Sracunata suma je:  " + suma);
            }






        }




















    }
}
