package d14_09_2023.zadatak2;

import p14_09.Ingredient;

import java.util.ArrayList;

public class Combination {

    private String comboId;
   private ArrayList<Integer> numbers;

    public Combination(String comboId, int one, int two, int three, int four,
        int five, int six, int seven){

        this.comboId = comboId;
        numbers = new ArrayList<>();
        numbers.add(one);
        numbers.add(two);
        numbers.add(three);
        numbers.add(four);
        numbers.add(five);
        numbers.add(six);
        numbers.add(seven);
    }


public boolean isThisTheSameCombo(Combination k) {

    for (int i = 0; i < numbers.size(); i++) {
        if (this.numbers.get(i) != k.numbers.get(i)) {

            return false;
        }

    }
    return true;
}

public void  printIt () {
    System.out.println("ID:" + this.comboId);
    System.out.println("Brojevi: " );
    for (int i = 0; i < numbers.size(); i++) {
        System.out.println(numbers.get(i));
    }

    System.out.println();
}


//get&set


    public String getComboId() {
        return comboId;
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }
}
























