package d15_08_2023;
//Napisati program koji racuna i ispisuje povrsinu i obim trougla. KOREN BROJA 3 neka bude konstanta 1.73.
// Za stranicu trougla postavite proizvoljnu vrednost.
public class Zadatak5 {

    public static void main(String[] args) {

        int a = 4;
        final double N =  1.73;

        double povrsina = ((a*a)*N)/4;
        int obim = (a*3);

        System.out.println( "a je " + a);
        System.out.println("Povrsina trougla je " + povrsina);
        System.out.print ("Obim trougla je "+ obim);






    }
}
