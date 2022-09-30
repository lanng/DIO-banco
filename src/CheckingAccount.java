public class CheckingAccount extends Account{

    public CheckingAccount(Client client) {
        super(client);
    }

    @Override
    public void printStatement() {
        System.out.println("Extrato da conta corrente: ");
        super.printStatement();
    }
}
