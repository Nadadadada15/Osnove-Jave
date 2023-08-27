package d25_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: " );
        int n =s.nextInt();

        printSign(n,'/');



    }



public static void  printSign (int n, char m) {

    for (int i = 0; i <= n; i++) {
        System.out.print( '/');

    }

}



}
