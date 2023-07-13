package adapter;

import adapter.thirdparty.ICICIBankAPI;

public class ICICIAdapter implements BankAPIAdapter{

    ICICIBankAPI iciciBankAPI=new ICICIBankAPI();

    public ICICIAdapter() {
        this. iciciBankAPI=new ICICIBankAPI();
    }

    @Override
    public String moneyTransfer(String fromAcc, String toAcc, double money) {
        char status= iciciBankAPI.transfer(fromAcc,toAcc,money);
        if(status=='y'){
            return "Success";
        }
        else{
            return "Failed";
        }
    }

    @Override
    public double checkBalance(String accountNo) {
        return iciciBankAPI.checkBalance(accountNo);
    }

    @Override
    public String authenticate(String accountNo) {
        boolean val=iciciBankAPI.CheckUser(accountNo);
        if(val){
            return "Success";
        }
        else{
            return "Failed";
        }
    }
}
