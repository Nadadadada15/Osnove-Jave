package d25_08_2023;

import java.util.Scanner;
import java.util.concurrent.ScheduledFuture;

public class Zadatak6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print( "Unesite m: ");
        int m = s.nextInt();
        System.out.print( "Unesite n: ");
        int n = s.nextInt();

        int numbers = count(m,n);

        System.out.println("Izmedju m i n postoji "+ numbers + " cela boja!");

    }

    public static int count (int m, int n) {
        int counter = 0;

        for (int i = m; i < n -1; i++) {

            counter++;
        }

        return counter;
    }






}
