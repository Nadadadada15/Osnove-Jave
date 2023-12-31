package Mini_Projekat;

import java.sql.SQLOutput;
import java.util.ArrayList;

//2.	**Zadatak: Simulacija iscrtavanja korisnika na Slacku**
//
//Napišite program koji simulira prikazivanje korisnika na Slacku.
// Prikaz korisnika treba da se izvede tako da prvo budu prikazani aktivni korisnici, a potom neaktivni.
// Program će čuvati sledeće informacije:
//●	Niz korisnika - u ovom nizu će biti sačuvani svi korisnici koji imaju pristup Slacku.
//●	Niz aktivnosti - svaki korisnik će biti označen kao aktivan ili neaktivan.
// Informacije o aktivnostima biće čuvane u nizu gde će za svakog korisnika biti zabeleženo
// da li je trenutno aktivan ili ne  (true ili false)..
// Naravno, korisnik i njegova aktivnost će biti upareni po istom indeksu.
// To znači da će se za korisnika na poziciji N u nizu "korisnici" čitati aktivnost sa pozicije N u nizu "aktivnosti".
//
//Program će ispisivati informacije za svakog korisnika na sledeći način:
//●	Za aktivne korisnike:
//  | slika |o Ime Prezime
//●	Za neaktivne korisnike:
//  | slika |x Ime Prezime
public class Zadatak2 {
    public static void main(String[] args) {

        ArrayList<String> users = new ArrayList<>();
        users.add("Pera Peric");
        users.add("Marko Markovic");
        users.add("Darko Darkovic");
        users.add("Stefan Stefanovic");
        users.add("Neda Nedovic");
        users.add("Bogdan Bogdanovic");

        ArrayList<Boolean> status = new ArrayList<>();
        status.add(false);
        status.add(true);
        status.add(false);
        status.add(false);
        status.add(true);
        status.add(true);

        String activeUsers = "";
        String inactiveUsers = " ";

        for (int i = 0; i <= users.size() - 1; i++) {
            if (status.get(i)) {
                activeUsers = "o " + users.get(i);
                System.out.println("|slika| " + activeUsers);


            }
        }


        for (int i = 0; i < users.size()-1; i++) {
            if (!status.get(i)) {
                inactiveUsers = "x " + users.get(i);
                System.out.println("|slika| " + inactiveUsers);}

        }











        }
    }


