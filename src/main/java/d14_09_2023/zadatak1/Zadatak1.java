package d14_09_2023.zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {


Subject art = new Subject("Art History", "Minerva McGonagall",9 );
Subject math = new Subject("Mathemathics", "Severus Snape",9);
Subject music= new Subject("Music", "Albus Dumbledore", 10);


Student nada = new Student("156", "Nada Nik","Masters");
nada.addSubject(art);
nada.addSubject(math);
nada.addSubject(music);

nada.printIt();



    }
}
