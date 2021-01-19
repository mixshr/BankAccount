package bankaccount;

public class SavingAccount extends Account {

    public SavingAccount(int balance) {
        super(balance);
    }

    @Override
    public void pay(int amount) {
        System.out.println("Платежи на сберегательном счете запрещены!");
    }

    @Override
    public void transfer(Account account, int amount) {
        int balance = getBalance() - amount;
        if (balance < 0) {
            System.out.println("На сберегательном счете не может быть отрицательных остатков!");
        } else {
            setBalance(balance);
            account.addMoney(amount);
        }
    }
}