import bankaccount.Account;
import bankaccount.CheckingAccount;
import bankaccount.CreditAccount;
import bankaccount.SavingAccount;

public class Main {
    public static void main(String[] args) {
        Account creditAcc = new CreditAccount(0);
        Account saveAcc = new SavingAccount(0);
        Account checkAcc = new CheckingAccount(0);

        creditAcc.transfer(saveAcc, 100000);
        saveAcc.transfer(checkAcc, 80000);
        checkAcc.transfer(creditAcc, 50000);
        saveAcc.addMoney(50000);
        saveAcc.transfer(creditAcc, 50000);
        creditAcc.pay(15000);
    }
}