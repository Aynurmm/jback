package OOPTask;

import java.util.Objects;

public class BankAccount {
    private String accountHolder;
    private double balance;
    private int accountNumber;

    public BankAccount(String accountHolder, double balance, int accountNumber) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }


    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder() {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double v) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber() {
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(that.balance, balance) == 0 && accountNumber == that.accountNumber && Objects.equals(accountHolder, that.accountHolder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountHolder, balance, accountNumber);
    }


    public double deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("balansiniz artirildi.Yeni balans: " + balance);
            return balance;
        } else {
            System.out.println("yanlish mebleh daxil edildi.Daxil edilen ededn sifirdan boyuk olmalidir.");
            return balance;
        }
    }

    public double withdraw(double amount) {
        if (amount > 0) {
            if (balance > amount) {
                balance -= amount;
                System.out.println("mebleg balansdan cixarildi");
                System.out.println("yeni balans: " + balance);
            } else {
                System.out.println("balansinizda kifayet qeder mebleg yoxdur. Movcud balans: " + balance);
            }

        } else {
            System.out.println("Yanlish mebleg daxil edildi.Mebleg sifirdan boyuk olmalidir!");
        }
        return balance;
    }

    public void displayInfo() {
        System.out.println("Mushterinin ad ve soyadi: " + accountHolder + '\n' + "Mushterinin Balansi: " + balance + '\n' + "Mushterinin hesab nomresi: " + accountNumber
        );
    }

    public double transfer(BankAccount recipient, double amount) {
        if (this.balance > 0 && balance > amount) {
            this.balance -= amount;
            recipient.balance += amount;
            System.out.println("Balansinizdan " + amount + " azn cixildi");
            System.out.println("Yeni balansiniz: " + this.balance);
            System.out.println("Alicinin balansi: " + recipient.balance);

        } else {
            System.out.println("balansinizda kifayet qeder mebleg yoxdur!");
        }
        return balance;
    }

    @Override
    public String toString() {
        return
                "accountHolder='" + accountHolder + '\'' +
                        ", balance=" + balance +
                        ", accountNumber=" + accountNumber;
    }
}
