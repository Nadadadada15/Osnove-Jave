package d_21_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        System.out.println( "Unesite broj reakcija: ");
        int brojreakcija= s.nextInt();
        int heartCount=0;
        int smileCount=0;
        int likeCount=0;

        for (int i = 0; i < brojreakcija; i++) {

            System.out.println("Unesite reakciju: ");
            String reakcija = s.next();
            if (reakcija.contains("heart")) {
                heartCount++;
            }
            if (reakcija.contains("smile")) {
                smileCount++;
            }
            if (reakcija.contains("like")) {
                likeCount++;
            }

        }

        System.out.println( "Pregled reakcija: " + heartCount +" srca|" +  smileCount +" smajlija|" + likeCount +" lajkova|");












    }
}
