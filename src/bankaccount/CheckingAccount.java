package bankaccount;

public class CheckingAccount extends Account {

    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    public void transfer(Account account, int amount) {
        if ((getBalance() - amount) < 0) {
            System.out.println("На расчетном счете не может быть отрицательых остатков!");
        } else {
            super.transfer(account, amount);
        }
    }
}