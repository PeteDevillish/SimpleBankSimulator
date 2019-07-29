public class BankAccount implements Account {

    private int balance;

    public BankAccount() {
        balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    //    wpłata
    @Override
    public void deposit(int amount) {
        if (amount >= 0) {
            balance += amount;
            System.out.println("Wpłata o wartości " + amount + "zakończona sukcesem");
            System.out.println("Na swoim koncie posiadasz: " + balance);
        } else {
            throw new IllegalArgumentException();
        }
    }

    //    wypłata
    @Override
    public void withdraw(int amount) {
        if (balance >= amount && amount>=0) {
            balance -= amount;
            System.out.println("Aktulany stan Twojego konta to: " + balance);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
