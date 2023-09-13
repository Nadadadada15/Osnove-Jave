package d12_09_2023;

public class Transaction {

    public String transId;
    public Account sender;
    public Account receiver;



    public Transaction ( String transId, Account sender, Account receiver) {

        this.transId = transId;
        this.sender = sender;
        this.receiver = receiver;
    }



    public double transactionFee (double amount ) {

       if (amount<4500) {

           return 45;
       } else { return (1.0/ amount) *100;}

    }


public void transfer (double amount) {

       sender.makePayment(amount);
       receiver.receivePayment(amount);

}



public void printIt () {

    System.out.println("Uplatilac: " + this.sender.getFullName() + " - " + this.sender.getAccNum() );

    System.out.println("Primalac: " + this.receiver.getFullName() + " - " + this.receiver.getAccNum() );

}



    //get i set

    public String getTransId ()
    {
        return this.transId;
    }

    public Account  getSender () {
        return  this.sender;
    }


    public Account getReceiver () {
        return  this.receiver;
    }

}
