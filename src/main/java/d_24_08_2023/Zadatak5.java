package d_24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite duzinu liste: ");
        int n = s.nextInt();
        int number = 0;


        for (int i = 0; i < n; i++) {
            System.out.println("Uneiste broj: ");
            number = s.nextInt();
            A.add(number);

        }

        System.out.println( A);

        System.out.println( "Sada unesite vrednost X: ");
        int x = s.nextInt();

        System.out.println( "Rezultat: Elementi niza A koji su jednaki broju X imaju indekse:");

        for (int i = 0; i < A.size()-1; i++) { if (A.get(i)==x){
            System.out.print(i);
        }

        }








    }




}
