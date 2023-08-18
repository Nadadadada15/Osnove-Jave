package d_17_08_2023;

//Napisati program koji simulira izvrsenja test case-a za redirekciju nakon uspesnog logovanja na sistem.
// Program sa tastature ucitava actual url stranice, expected url stranice i kod o gresci koja treba da se prikaze ukoliko actual stranica nije kao sto je ocekivano.

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println( );
        System.out.println("***********************");
        System.out.println( );
        System.out.println( "ENTER ACTUAL URL");
        String actURL= s.next();
        System.out.println( "ENTER EXPECTED URL");
        String expURL= s.next();
        String error = "URL_MISSMATCH";
        System.out.println( );
        String asertError= "Assertion Error:Expected google.com/home but got google.com/ivalid_login, error code:";
        if (actURL.equals(expURL)) {
            System.out.println( "Test 1 passed");


        } else {
            System.out.println( asertError + error);


        }
        System.out.println( );
        System.out.println("***** E N D *****" );




    }
}
