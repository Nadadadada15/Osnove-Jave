package d15_09_2023.Zadatak1;

public class Person {


    protected String fullName;
    protected String personalID;
    protected int birthYear;


    public Person() {
    }

    public Person(String fullName, String personalID, int birthYear) {
        this.fullName = fullName;
        this.personalID = personalID;
        this.birthYear = birthYear;
    }





public void printIt () {

    System.out.println( "Info: " + this.fullName + ", " + this.personalID + ", " + this.birthYear);








}








  //get&set


    public String getFullName() {
        return fullName;
    }

    public String getPersonalID() {
        return personalID;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPersonalID(String personalID) {
        this.personalID = personalID;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}














