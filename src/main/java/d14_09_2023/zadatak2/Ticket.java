package d14_09_2023.zadatak2;

import java.util.ArrayList;

public class Ticket {

 private ArrayList<Combination> combinations;


    public Ticket() {
        this.combinations = new ArrayList<>();
    }




public void addCombo (Combination combo) {
if (this.combinations.size()<=7){
        this.combinations.add(combo);}
}



public boolean isItAWinningCombo(Combination winCombo) {

    for (int i = 0; i <combinations.size(); i++) {

      Combination combination = combinations.get(i);
      if (combination.isThisTheSameCombo(winCombo)) { return true;}




    }
return false;
}


public void printIt () {
    for (int i = 0; i < combinations.size(); i++) {

        combinations.get(i).printIt();
    }
}




























}
