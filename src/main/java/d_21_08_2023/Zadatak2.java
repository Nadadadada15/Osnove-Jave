package d_21_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Broj unosa ");
        int brUnosa = s.nextInt();
        int suma = 0;

        for (int i = 0; i < brUnosa; i++) {

            System.out.println("Unesite broj: ");
            int broj = s.nextInt();

            if (broj >= 100) {

                suma = suma + broj;
            }


        }

        System.out.println( "Suma je: " + suma);
    }
}
