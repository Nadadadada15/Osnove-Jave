package d25_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println( "Unesite veki broj: ");

        int num = s.nextInt();

        printBriggerByTen(num);












    }

    public static void printBriggerByTen(int value) {

        System.out.println( "Uvecana vrednost za 10 je : " + value *10 );


    }




}
