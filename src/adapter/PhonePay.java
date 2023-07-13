package adapter;

public class PhonePay {

    BankAPIAdapter bankAPIAdapter;

    public PhonePay(BankAPIAdapter bankAPIAdapter) {
        this.bankAPIAdapter = bankAPIAdapter;
    }

    public String transferMoney(){
        String status= bankAPIAdapter.moneyTransfer("vasu","yamini",1000);
        return status;

    }

    public double checkBalance(){
        double money=bankAPIAdapter.checkBalance("vasu");
        return money;
    }

    public  String login(){
        String status= bankAPIAdapter.authenticate("Yamini");
        return status;

    }
}
