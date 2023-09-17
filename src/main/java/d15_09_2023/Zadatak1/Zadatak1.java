package d15_09_2023.Zadatak1;

import p_15_09.Osoba;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {


        Player play1 = new Player("Bogdan Bogdanovic", "151648", 1992, 13, " suterski bek", true);
        Player play2 = new Player("Earvin Magic Johnson ", "26416546", 1959, 32, "play", true);
        play1.printIt();
        System.out.println();
        play2.printIt();
        System.out.println();

        Coach coach1 = new Coach("Svetislav Pesic", "13448643", 1949, 41, "za igru");
        Coach coach2 = new Coach("Jack McKinney", "1316546", 1935, 25, "za igru");
        coach1.printIt();
        System.out.println();
        coach2.printIt();


        Scanner s = new Scanner(System.in);
        ArrayList<Player>players = new ArrayList<>();
        ArrayList<Coach>coaches = new ArrayList<>();

        System.out.print( "Unesi broj igraca koje zelite da dodate: ");
        int num = s.nextInt();

        for (int i = 0; i <num ; i++) {

            System.out.print("Ime i prezime: ");
            String fullName = s.next();
            System.out.print("JMBG: ");
            String jmbg = s.next();
            System.out.print("Godina rodjenja: ");
            int birthYear= s.nextInt();
            System.out.println("Broj dresa: ");
            int jerseyNum = s.nextInt();
            System.out.println("Pozicija: ");
            String position = s.next();
            System.out.println("Da li je kapiten: ");
            boolean isCaptain= s.nextBoolean();


            players.add(new Player(fullName,jmbg,birthYear,jerseyNum,position,isCaptain));


        }

        System.out.println("Unesite broj trenera koji zelite da ubacite u listu: ");
        int num2=s.nextInt();

        for (int i = 0; i <num2 ; i++) {
            System.out.print("Ime i prezime: ");
            String fullName = s.next();
            System.out.print("JMBG: ");
            String jmbg = s.next();
            System.out.print("Godina rodjenja: ");
            int birthYear= s.nextInt();
            System.out.print("Godine iskustva");
            int expYears = s.nextInt();
            System.out.print("Tip: ");
            String type = s.next();

            coaches.add(new Coach(fullName,jmbg,birthYear,expYears,type));


        }


        for (int i = 0; i <players.size() ; i++) {

            players.get(i).printIt();

        }

        for (int i = 0; i < coaches.size(); i++) {

            coaches.get(i).printIt();

        }





























    }
}







