import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Conta Corrente", "11155588811");
        Client client2 = new Client("Conta Poupança", "11155588811");
        Bank bank = new Bank();
        bank.setName("Banco Java");
        Account checkingAccount = new CheckingAccount(client1);
        Account savingsAccount = new SavingsAccount(client2);

        checkingAccount.deposit(500.00);
        checkingAccount.transfer(savingsAccount, 350.00);
        checkingAccount.printStatement();
        savingsAccount.printStatement();
    }
}