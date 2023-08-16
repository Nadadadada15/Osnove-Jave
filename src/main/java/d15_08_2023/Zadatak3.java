package d15_08_2023;

//Napisati program koj racuna Z prema formuli:
// (X - Y) NA KVADRAT. X i Y su celi brojevi.

public class Zadatak3 {
    public static void main(String[] args) {

int x = 4;
int y = 2;
double z;

z = x-y;
        System.out.println(  "Z je " + z);

z = z*z;

        System.out.println( "Z na kvadrat je " + z) ;

z = Math.pow ((x-y),2);

        System.out.println( "Z na kvadrat na drugi nacin je " + z);




    }
}
