package d12_09_2023;

public class Contract {

    private String date;

    private Subject buyer;
    private Subject seller;

    private double price;
    private String address;


    public Contract(String date, Subject buyer, Subject seller, double price, String address) {
        this.date = date;
        this.buyer = buyer;
        this.seller = seller;
        this.price = price;
        this.address = address;
    }


    public double revenueRate() {
        if (buyer.getBoughtPropertyBefore()) {
            return 0.02;
        } else {
            return 0.03;
        }
    }


    public double revenueAfterTaxes() {
        double afterTaxes = 0;

        afterTaxes = 1000 + this.price * revenueRate();

        return afterTaxes;
    }


    public void printIt() {

        System.out.println("Dana " + this.date + " god. Sklopljen je ugovor izmedju " +
                this.buyer.getFullName() + ", " + this.buyer.getPersonalId() + " i " + this.seller.getFullName()
                + ", " + seller.getPersonalId());

        System.out.println("Po ceni od: " + this.price +
                " pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od "
                + this.revenueAfterTaxes() + " din.");
    }





// get i set



public String getDate () {
    return  this.date;


}

public Subject getBuyer () {

        return  this.buyer;
}

public  Subject getSeller () {
        return this.seller;
}

public double getPrice () {
        return this.price;
}

public String getAddress () {
        return  this.address;
}

}