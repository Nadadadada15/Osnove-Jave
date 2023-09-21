package d19_09;

import java.util.ArrayList;

public class Basket {

    ArrayList<Package>packages;


    public Basket() {

      this.packages = new ArrayList<>();

    }



public void addPackage(Package pack) {

        this.packages.add(pack);
}



public void removePackage (Package pack) {

    for (int i = 0; i <packages.size(); i++) {
        if
        (packages.get(i).getBarcode().equals(pack.getBarcode()))
        {packages.remove(packages.get(i));}

    }

}


private ArrayList<Double> discountedPrices (double discount ) {
ArrayList<Double> prices = new ArrayList<>();
    for (int i = 0; i < packages.size() ; i++) {
      double discountPrice=  packages.get(i).calculatePrice() - discount;
      prices.add(discountPrice);
    }
return prices;
}

public double totalBasketPrice (Supercard supercard){
double priceSum=0;
ArrayList<Double> prices = new ArrayList<>();

prices = discountedPrices(supercard.getDiscount());


    for (int i = 0; i < prices.size(); i++) {

priceSum = priceSum + prices.get(i);


    }

return  priceSum;
}

    public ArrayList<Package> getPackages() {
        return packages;
    }
}
