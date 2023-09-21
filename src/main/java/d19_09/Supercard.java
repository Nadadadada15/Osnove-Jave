package d19_09;

public class Supercard {

    private int cardNum;
    private String  ownerName;
    private double discount;

    public Supercard(int cardNum, String ownerName, double discount) {
        this.cardNum = cardNum;
        this.ownerName = ownerName;
        this.discount = discount;
    }


    public Supercard() {
    }




public void printIt () {
    System.out.println("Card number: " + this.cardNum);
    System.out.println("Card Holder: " + this.ownerName);


}









//get&set


    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
