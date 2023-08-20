package d_18_8_2023;


/*3.	Napisati program koji za uneti broj x
 (smatrajte da korisnik unosi jednocifreni broj) ispisuje tablicu mnozenja za taj broj. Resiti for petljom.
 */
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        System.out.println( "Unesite x");

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int broj = 1;


        for (int i=1;i<=10;i++) {
            System.out.println((broj++) + " * 5 = " + i * x);
        }










    }
}
