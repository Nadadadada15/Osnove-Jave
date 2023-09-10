package d_8_9_2023;

public class Proizvod {

    public String ime;
    public double cena;
    public double gramaza;




    public void  stampaj () {

        System.out.println( "Naziv: "+ ime + ", Cena: "  + cena + ", Gramaza:  " + gramaza);

    }


    public void povecajCenu (double povecanje) {

     this.cena = povecanje + this.cena;

    }


    public Double vratiCenuSaPopustom (double popust) {

        popust = (popust*cena)/100;
        double cenaSaPopustom = cena-popust;

        return cenaSaPopustom;

    }

    public Integer racunajPostarinu  () {

       if (gramaza<=100) { return 200;}
       else if (gramaza<=500) { return 400;}
       else {return 1000;}


    }



}
