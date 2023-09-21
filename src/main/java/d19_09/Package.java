package d19_09;

public abstract class Package {

    protected String barcode;
    protected String prooductName;

    protected double netoWeight;
    protected double brutoWeight;


    public Package() {
    }


    public Package(String barcode, String prooductName, double netoWeight, double brutoWeight) {
        this.barcode = barcode;
        this.prooductName = prooductName;
        this.netoWeight = netoWeight;
        this.brutoWeight = brutoWeight;
    }


    public double actualWeight() {

        return this.brutoWeight - this.netoWeight;
    }


    public abstract double calculatePrice();

    public abstract void printIt();


    //get&set


    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getProoductName() {
        return prooductName;
    }

    public void setProoductName(String prooductName) {
        this.prooductName = prooductName;
    }

    public double getNetoWeight() {
        return netoWeight;
    }

    public void setNetoWeight(double netoWeight) {
        this.netoWeight = netoWeight;
    }

    public double getBrutoWeight() {
        return brutoWeight;
    }

    public void setBrutoWeight(double brutoWeight) {
        this.brutoWeight = brutoWeight;
    }
}
