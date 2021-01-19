package bankaccount;

public abstract class Account implements BankOperation {

    private int balance;

    protected Account(int balance) {
        this.balance = balance;
    }

    protected int getBalance() {
        return balance;
    }

    protected void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void pay(int amount) {
        balance -= amount;
    }

    @Override
    public void transfer(Account account, int amount) {
        pay(amount);
        account.addMoney(amount);
    }

    @Override
    public void addMoney(int amount) {
        balance += amount;
    }
}