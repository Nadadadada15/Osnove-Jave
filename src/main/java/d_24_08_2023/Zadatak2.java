package d_24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {


        ArrayList<Integer> numList = new ArrayList<>();




        Scanner s = new Scanner(System.in);
        System.out.print( "Unesite N: ");

        int n = s.nextInt();
        int counter = 0;

        for (int i = 0; i < n;i++) {

            System.out.println( "Unesite vrednost: ");
            int number = s.nextInt();
            numList.add(number);

           if (number%2==0) {counter++;}


        }

        System.out.println(numList );
        System.out.println( "Uneli ste: " + counter + " parna broja");



    }


}
