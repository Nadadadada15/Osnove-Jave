package d14_09_2023.zadatak1;

import p14_09.Ingredient;

import java.util.ArrayList;

public class Student {

    private String indexNum;
    private String fullName;
    private String classType;
    private ArrayList<Subject>subjects;


    public Student(String indexNum, String fullName, String classType) {
        this.indexNum = indexNum;
        this.fullName = fullName;
        this.classType = classType;
        this.subjects = new ArrayList<>();
    }



public void addSubject (Subject subject) {
        
    this.subjects.add(subject);   
        
    } 


public double calculateAvg() {
    double avgGrade = 0;
    int sum =0;


    for (int i = 0; i < subjects.size(); i++) {
        if (subjects.get(i).isPassed()) {
            sum = sum + subjects.get(i).getGrade();

            avgGrade = (double) sum / subjects.size();
        }
if (avgGrade==0) {return 0;}
    }
    return avgGrade;
}



public void printIt () {

    System.out.println(this.indexNum + " - " + this.fullName + " - " + this.classType);
    System.out.println("Predmeti: ");
    for (int i = 0; i < subjects.size(); i++) {
        this.subjects.get(i).printIt();

    }

    System.out.println( "Prosecna ocena: " + calculateAvg());

}



    //get i set

    public String getIndexNum() {
        return indexNum;
    }

    public void setIndexNum(String indexNum) {
        this.indexNum = indexNum;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }



}
