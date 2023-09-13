package d12_09_2023;

public class GreenCard {

private String studentFullName;
private String reportCardNum;
private String subject;
private String professorFullName;
private int grade;


public GreenCard (String studentFullName, String reportCardNum, String subject, String professorFullName, int grade ) {

this.studentFullName = studentFullName;
this.reportCardNum = reportCardNum;
this.subject = subject;
this.professorFullName = professorFullName;
this.grade =grade;
}

// metode


    public boolean didStudentPass () {

   return this.grade>5;
    }


public void printIt () {

    System.out.println("Predmet: " + this.subject + " - " + this.grade );
    System.out.println("Student: " + this.studentFullName + " - " + this.reportCardNum);
    System.out.println( "Profesor: " + this.professorFullName);
}



// get i set

    public String getStudentFullName (){
    return this.studentFullName;
    }


    public String getReportCardNum (){
        return this.reportCardNum;
    }

    public String getSubject (){
        return this.subject;
    }

    public String getProfessorFullName (){
        return this.professorFullName;
    }
    public int  getGrade (){
        return this.grade;
    }




}
