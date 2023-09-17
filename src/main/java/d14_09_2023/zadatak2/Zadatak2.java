package d14_09_2023.zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {

Combination combo1 = new Combination("001C", 14,15,3,22,28,30,32);
Combination combo2 = new Combination("002C", 18,20,22,24,26,28,30);
Combination combo3 =new Combination("003C", 2,5,8,11,14,17,20);
Combination combo4= new Combination("004", 3, 5, 7, 9, 13,15,17);

Ticket firstTicket = new Ticket();
firstTicket.addCombo(combo1);
firstTicket.addCombo(combo2);
firstTicket.addCombo(combo3);
firstTicket.addCombo(combo4);

Combination winCombo = new Combination("005C",3,5,7,9,13,15,17);
firstTicket.isItAWinningCombo(winCombo);

firstTicket.printIt();

if (firstTicket.isItAWinningCombo(winCombo)) {
    System.out.println("Imate dobitnu kombinaciju!");}
        System.out.println();



    }
}
