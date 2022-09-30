public interface IAccount {
    void withdraw(double value);
    void deposit(double value);
    void transfer(Account account, double value);
    void printStatement();
}
