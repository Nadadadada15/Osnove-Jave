package d25_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print( "Unesite broj 1: ");
        int num1 = s.nextInt();
        System.out.print( "Unesite broj 2: ");
        int num2 = s.nextInt();
        System.out.print( "Unesite broj 3: ");
        int num3 = s.nextInt();

        int smallest = getSmallest(num1,num2,num3);

        System.out.println( "Najmanji unet broj je: " +smallest);


    }



    public static int getSmallest(int num1, int num2, int num3) {
        int smallest = 0;

        if (num1<num2 && num1<num3) {
            smallest = num1;
        }
        if (num2<num1 && num2<num3) {
            smallest = num2;
        }
        if (num3<num1 && num3<num2) {
            smallest = num3;
        }

        return smallest;
    }
}
