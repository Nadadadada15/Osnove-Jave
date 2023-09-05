package Mini_Projekat;
//1.	**Zadatak: Simulacija skidanja tekstualnog fajla**
//Napišite program koji simulira proces skidanja tekstualnog fajla.
// Skidanje fajla se obavlja u paketima od po 5 karaktera.
// Pretpostavljamo da korisnik unosi podatke u skladu sa sledećim zahtevima:
//
//●	Korisnik unosi veličinu fajla u bajtovima, pri čemu svaki karakter zauzima 1 bajt.
//●	Ako broj karaktera u fajlu nije deljiv sa 5, poslednji paket će sadržati manje od 5 karaktera.
//●	Korisnik će biti upitan za podatke svakog paketa kroz for petlju.
// Nakon unosa svakog paketa, program treba da prikaže procenat trenutno skinutog fajla.
// Na programu je da odredi koliko paketa je potrebno za ceo fajl.
//●	Na kraju programa, ispišite sadržaj celog fajla.

import java.util.Scanner;

//Napomena: Posto je procenat realan broj, u stampi ce se prikazati vise cifara iza zareza.
public class Zadatak1 {
    public static void main(String[] args) {

        Scanner  s = new Scanner(System.in);
        System.out.print( "Unesite velicinu fajla: ");
        int totalBytes= s.nextInt();
        int packNum = 0;
        String totalLenght= " ";
        double currentPercet=0.0;

        if (totalBytes%5==0) { packNum=totalBytes/5;} else { packNum=(totalBytes/5)+1;}



        for (int i = 0; i <packNum ; i++) {
            System.out.println( "Unesite paket");
            String pack = s.next();
            totalLenght = totalLenght+pack;
            double percent=(1.0*pack.length()/totalBytes)*100;
            currentPercet= currentPercet + percent;
            System.out.println( currentPercet + "%");



        }

        System.out.println( "Sadrzaj fajla je: " + totalLenght);

















    }
}
