package p15_08_2023;
//Napisati program koji na ekranu stampa podatke u formatu:
//Sifra [SIFRA PROIZVODA]
//[NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
//[BOJA], [VELICINA]

public class Zadatak4 {
    public static void main(String[] args) {

      String sifra = "1589654";
      String nazivProizvoda = "Puma patike";
      Integer cena = 77;
      Double popust = 15.0;
      String boja = "bela";
      Integer velicina = 36;

        System.out.println(sifra);
        System.out.println( nazivProizvoda + '-' + '$'+ cena + '-' + "Popust" +' '+ popust + '%');
        System.out.print(boja + ','+ velicina);



    }
}
