public class Bank implements BankTransfer {


    @Override
    public void transfer(BankAccount from, BankAccount to, int amount) {
        if (from.getBalance() >= amount + 1) {
            from.withdraw(amount + 1);
            to.deposit(amount);
        } else {
            throw new IllegalStateException();
        }
    }

    public BankAccount openAccount() {
        return new BankAccount();
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        BankAccount bankAccount = bank.openAccount();
        BankAccount bankAccount1 = bank.openAccount();

        bankAccount.deposit(1000);
        bankAccount1.deposit(100);

        bank.transfer(bankAccount, bankAccount1, 300);
    }
}
