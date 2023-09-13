package d12_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {

Account sender = new Account("125-896-6633", "Bogdan Bogdanovic", 15000);
Account receiver = new Account("365-598-757", "Marko Markovic", 6000);

Transaction transaction = new Transaction("transaction00001", sender, receiver);


transaction.transfer(5000);

transaction.printIt();

// System.out.println( transaction.getReceiver().getAvailableFunds());







    }
}
