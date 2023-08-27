package d_24_08_2023;
//4.	.Zadatak
//Napisati program koji ucitava niz A duzine N, i koji nakon unosa niz A stampa sve elemente niza koji su veci od nule.

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
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

        System.out.println( "Lista sa brojevima vecim od 0 je : ");
        for (int i = 0; i < A.size(); i++) {

            if (A.get(i)>0) {
                System.out.print( A.get(i) + ", ");
            }
        }


        }


    }

