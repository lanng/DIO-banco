import java.util.Random;

public abstract class Account implements IAccount{
    protected static int sequential;
    protected static final int  agency = 123;
    protected int account;
    protected double balance;
    protected Client client;

    public Account( Client client) {
        this.account = sequential++;
        this.balance = 0;
        this.client = client;
    }

    @Override
    public void withdraw(double value) {
        if (this.balance > value)    this.balance -= value;
        else System.out.println("Saldo insuficiente - R$" + this.balance);
    }

    @Override
    public void deposit(double value) {
        this.balance += value;
        System.out.println("Deposito realizado com sucesso!");
    }

    @Override
    public void transfer(Account account, double value) {
        this.withdraw(value);
        account.deposit(value);
    }

    @Override
    public void printStatement() {
        System.out.println("Titular: " + this.client.getName());
        System.out.println("Agencia: " + agency);
        System.out.println("Conta: " + this.account);
        System.out.println("Saldo: " + this.balance);
    }

}
