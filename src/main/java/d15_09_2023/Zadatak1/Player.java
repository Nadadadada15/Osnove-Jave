package d15_09_2023.Zadatak1;

public class Player extends Person {

  private int jerseyNum;
  private String position;
  boolean isTeamCaptain;


  public Player () {

  }

    public Player(String fullName, String personalID, int birthYear, int jerseyNum,
                  String position, boolean isTeamCaptain)
    {

        super(fullName, personalID, birthYear);
        this.jerseyNum = jerseyNum;
        this.position = position;
        this.isTeamCaptain = isTeamCaptain;
    }



    @Override

    public void printIt () {

        System.out.println( "Info: " + this.fullName + ", " + this.personalID + ", " + this.birthYear);
        System.out.println("Broj dresa: " + this.jerseyNum);
        System.out.println("Pozicija: " + this.position);
        System.out.println("Da li je kapiten: " + this.isTeamCaptain);




    }






  //get&set


    public int getJerseyNum() {
        return jerseyNum;
    }

    public String getPosition() {
        return position;
    }

    public boolean isTeamCaptain() {
        return isTeamCaptain;
    }

    public void setJerseyNum(int jerseyNum) {
        this.jerseyNum = jerseyNum;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTeamCaptain(boolean teamCaptain) {
        isTeamCaptain = teamCaptain;
    }
}
