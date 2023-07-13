package adapter;

import adapter.thirdparty.YESBankAPI;

public class YESBankAdapter implements BankAPIAdapter{

    YESBankAPI yesBankAPI=new YESBankAPI();

    public YESBankAdapter() {
        this.yesBankAPI = new YESBankAPI();
    }

    @Override
    public String moneyTransfer(String fromUser, String toUser, double money) {
        long fromUserId=returnUserId(fromUser);
        long toUserID=returnUserId(toUser);
        return this.yesBankAPI.doPayment(fromUserId,toUserID,money);

    }

    @Override
    public double checkBalance(String fromUser) {

        return this.yesBankAPI.balance(returnUserId(fromUser));

    }

    @Override
    public String authenticate(String fromUser) {
        char status= this.yesBankAPI.authenticate(returnUserId(fromUser));
        if (status == 'y'){
            return "Success";
        }
        else{
            return "Failed";
        }
    }

    public long returnUserId(String username){
        return 0;
    }
}
