package adapter;

import adapter.thirdparty.YESBankAPI;

public class client {
    public static void main(String[] args) {
        BankAPIAdapter bankAPIAdapter=new ICICIAdapter();
        PhonePay phonePay=new PhonePay(bankAPIAdapter);
        String status=bankAPIAdapter.authenticate("vasu");
        System.out.println(status);
        double bal=bankAPIAdapter.checkBalance("Yamini");
        System.out.println(bal);
        String stat=bankAPIAdapter.moneyTransfer("vasu","Yamini",1000);
        System.out.println(stat);

    }
}
