package d19_09;

public class Cardboard extends Package {

private boolean canBeRecycled;

private double flatPrice;


    public Cardboard(String barcode, String prooductName, double netoWeight,
                     double brutoWeight, boolean canRecycle, double flatPrice)
    {
        super(barcode, prooductName, netoWeight, brutoWeight);
        this.canBeRecycled = canRecycle;
        this.flatPrice = flatPrice;
    }

    @Override
    public double calculatePrice() {
        if (canBeRecycled) {
            return this.actualWeight() * 1.5 + this.flatPrice;
        } else {
            return this.flatPrice;
        }
    }

    @Override
    public void printIt() {
        System.out.println("************Product Overview****************");
        System.out.println("Barcode: " + this.barcode);
        System.out.println("Product: " + this.prooductName);
        System.out.println("Weight: " + this.actualWeight());
        System.out.println("Is it eco fiendly: " + this.canBeRecycled);
        System.out.println("Price: " + this.calculatePrice());

    }
}
