package d25_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println( "Unesite vrednost u evrima: ");
        double euro = s.nextDouble();
        System.out.println( "Unesite valutu u koju zelite da konvertujete: ");
        String currency = s.next();

        double convertedValue = currencyConvertor(euro, currency);

        System.out.println(euro + "EUR je " + convertedValue + " " + currency);



    }

public static Double currencyConvertor (double euro, String currency){

        double covertedValue = 0;
        if (currency.equals("USD")) {
            covertedValue = euro * 1.1;
        }
            if (currency.equals("RSD")) {

                covertedValue= euro * 117;
            }
                if (currency.equals("RUB")) {
                    covertedValue= euro * 62.89;
                }


    return covertedValue;
}

    }
