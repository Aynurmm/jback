package OOPTask;

public class MainApp {
    public static void main(String[] args) {
        BankAccount[] bankAccount = new BankAccount[5];
        bankAccount[0] = new BankAccount("Ali Aliyev", 100, 123);
        bankAccount[1] = new SavingsAccount("Ayshe Mammadova", 400, 783, 15, 3);
        bankAccount[2] = new SavingsAccount("Firuza Agasiyeva", 700, 183, 18, 2);
        bankAccount[3] = new CurrentAccount("Huseyn Aliyev", 800, 923, 320);
        bankAccount[4] = new CurrentAccount("Narmin Dilbazi", 500, 153, 200);

        for (BankAccount account : bankAccount) {
            account.displayInfo();
            System.out.println();
        }
        for (BankAccount account : bankAccount) {
            account.withdraw(20);
            account.deposit(100);
            System.out.println();
        }
        bankAccount[1].transfer(bankAccount[3],55);
    }
}
