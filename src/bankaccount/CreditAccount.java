package bankaccount;

public class CreditAccount extends Account {

    public CreditAccount(int balance) {
        super(balance);
    }

    @Override
    public void addMoney(int amount) {
        if ((getBalance() + amount) > 0) {
            System.out.println("На кредитном счете не может быть положительных остатков!");
        } else {
            super.addMoney(amount);
        }
    }
}