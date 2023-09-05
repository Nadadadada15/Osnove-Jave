package Mini_Projekat;

import java.util.ArrayList;

//3.	**Zadatak: Zamena Placeholdera u SQL Upitu**
//
//Napišite program koji obavlja zamenu placeholdera u SQL upitu.Za rešenje ovog zadatka,
// biće potrebno upoznati se sa upotrebom `replace` metode koju pruža `String` klasa u Javi.
//Program će sačuvati sledeće informacije:
//1. SQL upit (string) nad kojim će se obaviti zamena.
//2. Niz vrednosti (niz stringova) koje treba da se ubace umesto placeholdera u SQL upitu.
//Placeholder je označeno mesto u stringu na kom treba da se postavi prava vrednost iz niza vrednosti.
// Placeholderi su označeni kombinacijom `%` i pozicijom za zamenu. Na primer, ukoliko SQL upit izgleda ovako:
//INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)
// VALUES ('%0', '%1', '%2', '%3', '%4', '%5');
//i niz vrednosti je:
//Cardinal, Tom B. Erichsen, Skagen 21, Stavanger, 4006, Norway
//
//Nakon izvršenja zamene, dobiće se SQL upit:
//
//INSERT INTO Customers
// (CustomerName, ContactName, Address, City, PostalCode, Country)
// VALUES ('Cardinal','Tom B. Erichsen','Skagen 21','Stavanger','4006','Norway');
//
//Ovaj program koristi `replace` metodu da zameni placeholder pozicije u SQL upitu sa stvarnim vrednostima iz niza.
public class Zadatak3 {
    public static void main(String[] args) {




        String sqlQuery= "INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country) VALUES ('%0', '%1', '%2', '%3', '%4', '%5')";

        ArrayList<String>newWrd=new ArrayList<>();

        newWrd.add("Cardinal");
        newWrd.add("Tom B. Erichsen");
        newWrd.add("sa Skagen 21");
        newWrd.add("Stavanger");
        newWrd.add("4006");
        newWrd.add("Norway");

        ArrayList<String>position=new ArrayList<>();
        position.add("%0");
        position.add("%1");
        position.add("%2");
        position.add("%3");
        position.add("%4");
        position.add("%5");






        for (int i = 0; i <= newWrd.size()-1; i++) {

             sqlQuery= sqlQuery.replaceAll(position.get(i), newWrd.get(i));

        }


        System.out.println( sqlQuery);











    }
}
