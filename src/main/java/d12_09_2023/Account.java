package d12_09_2023;

public class Account {

    private String accNum;
    private String fullName;
    private double availableFunds;


    public Account(String accNum, String fullName, int availableFunds) {

        this.accNum = accNum;
        this.fullName = fullName;
        this.availableFunds = availableFunds;
    }

//metode

    public void receivePayment(double payment) {

        this.availableFunds = availableFunds + payment;

    }

    public void makePayment(double payment) {

        this.availableFunds = availableFunds - payment;
    }


    public void  printIt () {

        System.out.println( "Vlasnik: " + this.fullName + " - " + this.accNum);
        System.out.println( "Stanje na racunu: " + this.availableFunds + " rsd.");
    }




//get i set


    public String getFullName() {
        return this.fullName;
    }

    public String getAccNum() {
        return this.accNum;
    }

    public double getAvailableFunds() {
        return this.availableFunds;
    }


}
