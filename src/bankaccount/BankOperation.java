package bankaccount;

public interface BankOperation {
    void pay(int amount);

    void transfer(Account account, int amount);

    void addMoney(int amount);
}