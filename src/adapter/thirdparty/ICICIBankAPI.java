package adapter.thirdparty;

public class ICICIBankAPI {

    public char transfer(String fromPerson, String toPerson, double amount){
        System.out.println(" Amount Transferred");
        return 'Y';
    }

    public Double checkBalance(String accountNumber){
        return 2000.10;
    }

    public Boolean CheckUser(String accountNumber){
        return true;
    }
}
