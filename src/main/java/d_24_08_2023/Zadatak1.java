package d_24_08_2023;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);
        numbers.add(40);
        numbers.add(45);
        numbers.add(50);

        Scanner s = new Scanner(System.in);

        System.out.println( "Unesite poziciju K od 0 do 9: ");

        int k = s.nextInt();

        System.out.println( "Unesite vrednost K:");
        int valueK=s.nextInt();

        numbers.set(k, valueK);

        System.out.println( "Novi niz: " + numbers);






















    }
}
