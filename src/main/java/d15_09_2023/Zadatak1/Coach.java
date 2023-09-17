package d15_09_2023.Zadatak1;

public class Coach extends Person {

    private int yearsOfExp;

    private String type;


    public Coach(String fullName, String personalID, int birthYear, int yearsOfExp, String type) {
        super(fullName, personalID, birthYear);
        this.yearsOfExp = yearsOfExp;
        this.type = type;
    }

    @Override
    public void printIt() {
        System.out.println("Info: " + this.fullName + ", " + this.personalID + ", " + this.birthYear);
        System.out.println("Godine iskustva: " + this.yearsOfExp);
        System.out.println("Tip: " + this.type);

    }


    //get&set


    public int getYearsOfExp() {
        return yearsOfExp;
    }

    public String getType() {
        return type;
    }


    public void setYearsOfExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }

    public void setType(String type) {
        this.type = type;
    }
}
