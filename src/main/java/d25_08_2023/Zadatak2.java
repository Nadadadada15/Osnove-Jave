package d25_08_2023;

import java.util.Scanner;
import java.util.StringJoiner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print( "Unesite neki jednocifreni broj: ");
        String num1=s.next();
        System.out.print( "Unesite jos jedan jednocifreni broj: ");
        String num2=s.next();

        String newNum= concatenate(num1,num2);
        System.out.println( "Novi broj je: " + newNum);



    }
    public static String concatenate(String a, String b ) {

        String concatNum= a+b;
        return concatNum;


    }





}
