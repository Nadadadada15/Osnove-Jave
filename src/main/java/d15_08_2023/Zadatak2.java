package d15_08_2023;
//Napisati program koji stampa podatke o kreditnoj kartici u formatu kao na slici. Od informacija se pamti broj kartice (16 cifara sa razmacima), mesec i godina do kada vazi kartica, kao i ime i prezime vlasnika kartice. Kartica se stampa sa zvezdicama i ne brinite ukoliko neka zvezdica mrdne i nije u liniji to ce zavisiti od duzine imena.
//Napomena: svaka informacija mora da bude u okviru posebne promenljive.
public class Zadatak2 {
    public static void main(String[] args) {

        String topStar = "**************************************";
        String cc = "*  CREDIT CARD                       *";
        String line ="*   ****                             *";
        String line1 = "*   ****                             *";
        String num = "*     1456 3434 5676 8899            *";
        String valid = "*           valid > 11/26            *";
        String star1="*                                    *";
        String name = "* Nada Nikolic                       *";


        System.out.println( topStar);
        System.out.println( cc);
        System.out.println( line);
        System.out.println( line1);
        System.out.println( num);
        System.out.println( valid);
        System.out.println( star1);
        System.out.println( name);
        System.out.println( topStar);




    }
}
