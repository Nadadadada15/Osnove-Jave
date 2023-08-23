package d_21_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Broj unosa ");
        int brReci = s.nextInt();
        int brojac = 0;
        double agresivnost =0;

        String rec = " ";

        for (int i = 0; i < brReci; i++) {
            System.out.println( "Unesite rec");
            rec=s.next();
            if (rec.contains("!")) { brojac++;
                System.out.println(rec);
            } else if (!(rec.contains("!"))) {
                System.out.println(rec + "!");
            }
            agresivnost = 1.0*brojac/brReci*100;

        }

        System.out.println( "Agresivnost je: " + agresivnost + '%');

    }
}
