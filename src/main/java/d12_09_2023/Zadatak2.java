package d12_09_2023;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {

        ArrayList<GreenCard> cardList = new ArrayList<>();
        cardList.add(new GreenCard("N.N", "001", "Art", "A.D", 9));
        cardList.add(new GreenCard("M.M", "002", "Math", "S.S", 7));
        cardList.add(new GreenCard("P.P", "003", "Psychology", "R.H", 4));
        cardList.add(new GreenCard("A.R", "004", "Science", "P.P", 9));
        cardList.add(new GreenCard("L.L", "005", "English", "J.J", 10));


        for (int i = 0; i < cardList.size(); i++) {

            cardList.get(i).printIt();
            System.out.println("*****");

        }

        int sum = 0;
        for (int i = 0; i < cardList.size(); i++) {


            sum = sum + cardList.get(i).getGrade();
        }

          double avgGrade = (double) sum /cardList.size();

        System.out.println( "Prosecna ocena je " + avgGrade);

        }

    }
