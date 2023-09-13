package d12_09_2023;

public class Subject {

private String fullName;
private String idNum ;

private String  personalId;


private boolean boughtPropertyBefore;


public Subject ( String personalId) {


    this.personalId = personalId;

}


//metode

   public void printIt (){

       System.out.println(this.fullName + ", " + this.idNum);
   }




//get i set


    public String getFullName () {

        return this.fullName;
    }

    public void setFullName (String fullName) {

    this.fullName = fullName;
    }

    public  String getIdNum () {

    return this.idNum;
    }

    public void setIdNum ( String idNum) {

    this.idNum = idNum;
    }

    public String getPersonalId () {

    return  this.personalId;
    }


    public void  setBoughtPropertyBefore (boolean boughtPropertyBefore) {

    this.boughtPropertyBefore = boughtPropertyBefore;
    }

    public  boolean  getBoughtPropertyBefore () {

    return this.boughtPropertyBefore;
    }


















}
