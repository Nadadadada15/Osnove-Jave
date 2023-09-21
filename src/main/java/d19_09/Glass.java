package d19_09;

public class Glass extends Package {


    private double deposit;
    private boolean depositNeeded;
    private double flatPrice;


    public Glass(String barcode, String prooductName, double netoWeight, double brutoWeight, double flatPrice, boolean depositNeeded) {
        super(barcode, prooductName, netoWeight, brutoWeight);
        this.depositNeeded = depositNeeded;
        this.flatPrice = flatPrice;
    }


    @Override
    public double calculatePrice() {
        if (depositNeeded) {
            return this.actualWeight() * 1.2 + this.deposit;
        } else {
            return this.flatPrice * 1.2;
        }
    }

    @Override
    public void printIt() {
        System.out.println("************Product Overview****************");
        System.out.println("Barcode: " + this.barcode);
        System.out.println("Product: " + this.prooductName);
        System.out.println("Weight: " + this.actualWeight());
        System.out.println("Does if require deposit: " + this.depositNeeded);
        System.out.println("Price: " + this.calculatePrice());



    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public boolean isDepositNeeded() {
        return depositNeeded;
    }

    public double getFlatPrice() {
        return flatPrice;
    }
}
