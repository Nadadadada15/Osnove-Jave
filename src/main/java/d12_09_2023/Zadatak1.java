package d12_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

Subject seller = new Subject("150699873538");

seller.setFullName("Nada Nik");
seller.setIdNum("123654");

seller.printIt();

Subject buyer = new Subject(" 1656478615436");

buyer.setFullName("Mimi Mercedes");

buyer.setIdNum("123698");
buyer.setBoughtPropertyBefore(true);

Contract contract = new Contract("15-06-2032", buyer, seller,100000,"Victory Garden residence" );

contract.printIt();






    }











}
