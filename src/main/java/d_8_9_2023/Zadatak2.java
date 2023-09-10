package d_8_9_2023;

public class Zadatak2 {
    public static void main(String[] args) {


        FacebookPost objava1 = new FacebookPost();
        FacebookPost objava2 = new FacebookPost();

        objava1.korisnikKojiObjavljuje = "Vladimir Minic";
        objava1.korisnikCijiJeProfil = "Nada Nikolic";
        objava1.tekst = "Bravo Nado! Polozila si Prvi Java Test!";
        objava1.like = 450;
        objava1.share = 320;


        objava1.dodajLike();
        objava1.dodajLike();
        objava1.dodajLike();git
        objava1.dodajLike();
        objava1.dodajLike();
        objava1.dodajShare();
        objava1.dodajShare();
        objava1.dodajShare();
        objava1.stampaj();

        System.out.println();
        System.out.println( "***********");
        System.out.println();


        objava2.korisnikKojiObjavljuje= "Pera Peric";
        objava2.korisnikCijiJeProfil= "Marko Markovic";
        objava2.tekst = "Srbija je šampion sveta!";
        objava2.like = 3;
        objava2.share = 4;




        objava2.oduzmiLike();
        objava2.oduzmiLike();
        objava2.oduzmiLike();
        objava2.oduzmiLike();
        objava2.dodajShare();
        objava2.dodajShare();
        objava2.dodajShare();
        objava2.dodajLike();
        objava2.dodajLike();
        objava2.dodajLike();
        objava2.dodajLike();
        objava2.dodajLike();


        objava2.stampaj();






    }


}
