package adapter;

public interface  BankAPIAdapter {

    public String moneyTransfer(String fromAcc, String toAcc, double money);
    public double checkBalance(String accountNo);
    public String authenticate(String accountNo);

}
