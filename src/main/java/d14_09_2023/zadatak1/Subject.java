package d14_09_2023.zadatak1;

public class Subject {

    private String name;
    private int grade;
    private String fullNameProfessor;


    public Subject(String name, String fullNameProfessor, int grade) {
        this.name = name;
        this.fullNameProfessor = fullNameProfessor;
        this.grade = grade;
    }

    //methods


    public Boolean isPassed() {
        if (grade >= 5) {
            return true;
        } else {
            return false;
        }

    }

    public void printIt() {

        System.out.println("(" + this.name + ")" + " - " +
                "(" + this.fullNameProfessor + ")" + " - "
                + "(" + this.grade + ")");
    }


    //get&set


    public String getName() {
        return name;
    }

    public String getFullNameProfessor() {
        return fullNameProfessor;
    }


    public int getGrade() {
        return grade;
    }


}
