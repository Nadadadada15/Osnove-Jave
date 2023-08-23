package d_22_08_2023;
//2.	Napisati program koji ucitava brojeva od korisnika i za svaki broj prikazuje apsolutnu vrednost sve dok se ne unese nula.
//Pomoc: Apsolutna vrednost je kada bilo koji broj pretvarate u pozitivan broj. Npr: -2 u 2 ili -4 u 4 dok pozitivni ostaju pozitivni npr: 9 ostaje 9
//Primer izvrsenja:
//Unesite broj: 3
//Apsolutna vrednost je 3
//Unesite broj: -1
//Apsolutna vrednost je 1
//Unesite broj: 0
//Kraj programa jer je uneta nula.
import java.util.Scanner;

public class Zadata2 {
    public static void main(String[] args) {


// Ne razumem zasto mi i ako unesem 0 opet ostampa apsolutni broj :c


        Scanner s = new Scanner(System.in);
        String broj = " ";
        String subtr = " ";
        boolean not0 = true;



        while (not0) {
            System.out.println( "Unesite broj");
            broj=s.next();
            if (broj.contains("-")) {  subtr =broj.substring(1);
                System.out.println("Apsolutni broj: " + subtr);
            }
            if (broj.equals("0")) { not0 = false;
                System.out.println(   "Kraj jer je uneta 0");}

            else if (!broj.contains("-")) {
                System.out.println("Apsolutni broj : "+ broj);
            }



        }





















    }
}
