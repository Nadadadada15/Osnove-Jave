package d19_09;

public class Zadatak1 {
    public static void main(String[] args) {


Package nextFamily = new Cardboard("123654", "Next Family sok", 200,250,true,220);

nextFamily.calculatePrice();
nextFamily.actualWeight();
nextFamily.printIt();



Package rosa = new Glass("48743684","Rosa staklena", 100,200, 100, false);

rosa.calculatePrice();
rosa.actualWeight();
rosa.printIt();


Glass nisko = new Glass("4484353","Nisko Pivo", 330, 400,60,true);

nisko.setDeposit(30);
nisko.calculatePrice();
nisko.printIt();

Supercard card = new Supercard(44896, "Nada NIk",20);

        Basket basket = new Basket();
        basket.addPackage(nisko);
        basket.addPackage(rosa);
        basket.addPackage(nextFamily);
        System.out.println("Total: " + basket.totalBasketPrice(card));

        for (int i = 0; i <basket.getPackages().size() ; i++) {

            basket.getPackages().get(i).printIt();

        }








    }





}
