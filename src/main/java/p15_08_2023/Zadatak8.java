package p15_08_2023;


//Napisati program koji racuna povrsinu kvadrata stranice a,
// i povrsinu kruga poluprecnika r. PI = 3.14. Povrsina kruga je r (na kvadrat) * pi


public class Zadatak8 {


    public static void main(String[] args) {

double pi = 3.14;
int a = 5;
double r = 3.0;

int povrsinaKv = a*a;
double povrsinakr = (r*r) *pi;

        System.out.println( a);
        System.out.println("Povrsina kvadrata je" + ' ' + povrsinaKv);
        System.out.println( r);
        System.out.println("Povrsina kruga je" + ' ' + povrsinakr);

    }
}
