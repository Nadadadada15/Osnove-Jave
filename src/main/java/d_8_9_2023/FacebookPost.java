package d_8_9_2023;

public class FacebookPost {

    public String korisnikKojiObjavljuje;
    public String korisnikCijiJeProfil;
    public String tekst;
    public int like;
    public int share;


    public Integer dodajLike() {

        like = like +1;
        return like;

    }

    public Integer oduzmiLike() {

        like = like-1;
        if (like < 0) {
            like = 0;

        }
        return like;
    }

    public Integer dodajShare() {

      share= share + 1;
      return share;

    }


    public void stampaj () {

        System.out.println( korisnikKojiObjavljuje+ ">>>>>>"+ korisnikCijiJeProfil);
        System.out.println( tekst);
        System.out.println( "Likes: " + like + " | " + "Shares: " + share);

    }



}
