package vezbanja;

import java.util.Scanner;

public class Zadatak18_8_11 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        System.out.println("Unesite duzinu videa u sekundama");
        double ukupnoS = s.nextInt();
        System.out.println("Unesite trenutnu sekundu");
        double trenutnoS = s.nextInt();
        trenutnoS = (trenutnoS/(ukupnoS/100));
        int timeline = 100;

        for (int i = 0; i<=timeline; i++) {
            if (i < trenutnoS) {
                System.out.print("*");
            } else {
                System.out.print("-");
            }




        }
    }
}