package d_22_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj");

        int num = 0;
        int count2 = 0;
        int count1 = 0;

        while (count2 < 2 && count1 < 3) {
            num = s.nextInt();
            System.out.println("Unesite broj");

            if (num == 2) {
                count2++;
            }
            if (num == 1) {
                count1++;
            }


        }

        if (count1 == 3) {
            System.out.println("KRAJ jer je uneto 3 jedinice");
        } else {
            System.out.println("KRAJ jer je uneto 2 dvojke");
        }


    }


}

