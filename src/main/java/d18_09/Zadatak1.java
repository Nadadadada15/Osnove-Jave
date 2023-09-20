package d18_09;

public class Zadatak1 {
    public static void main(String[] args) {

VideoPlayer player1 = new VideoPlayer(45, 5, 12);

TimeControl skip = new TimeControl(true);
Control audioCtrl = new AudioControl(false);
Control vidQ = new QyalityOptimizer(12);

skip.doAction(player1);
player1.printIt();
audioCtrl.doAction(player1);

player1.printIt();
vidQ.doAction(player1);
player1.printIt();









    }
}
