package d_24_08_2023;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);

        System.out.println( "Obrnuti niz je: ");
        for (int i = numbers.size()-1; i>=0; i--) {

            System.out.println( numbers.get(i) + ", ");



        }

    }
}
