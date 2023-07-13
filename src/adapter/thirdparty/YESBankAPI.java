package adapter.thirdparty;

public class YESBankAPI {

    public String doPayment(long fromId, long toId, Double amount){
        System.out.println("Amount Transferred");
        return "Success";
    }

    public double balance(long accountNO){
        return 10000.0;
    }

    public char authenticate(long accountId){
        return 'Y';
    }
}
