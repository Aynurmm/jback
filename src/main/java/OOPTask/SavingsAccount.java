package OOPTask;

import java.util.Objects;

public class SavingsAccount extends BankAccount {
    private double monthlyInterestRate;
    private int withdrawalLimit;

    public SavingsAccount(String accountHolder, double balance, int accountNumber, double monthlyInterestRate, int withdrawalLimit) {
        super(accountHolder, balance, accountNumber);
        this.monthlyInterestRate = monthlyInterestRate;
        this.withdrawalLimit = withdrawalLimit;

    }

    public double getMonthlyInterestRate() {
        return monthlyInterestRate;
    }

    public void setMonthlyInterestRate(double monthlyInterestRate) {
        this.monthlyInterestRate = monthlyInterestRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SavingsAccount that = (SavingsAccount) o;
        return Double.compare(that.monthlyInterestRate, monthlyInterestRate) == 0 && withdrawalLimit == that.withdrawalLimit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), monthlyInterestRate, withdrawalLimit);
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Mushterinin monthlyInterestRate: "+monthlyInterestRate+'\n'+"Mushterinin withdrawlimiti: "+withdrawalLimit);
    }

    public double withdraw(double amount) {
        if (getBalance() > amount) {
            if (withdrawalLimit > 0) {
//             setBalance(getBalance()-amount);
                super.withdraw(amount);
                withdrawalLimit--;

            } else {
                System.out.println("Sizin cixarish limitiniz bitib");
            }
        } else {
            System.out.println("Balansinizda kifayet qeder mebleg yoxdur");
        }
        return getBalance();
    }

    public double applyInterest() {
        double interest = getBalance() * monthlyInterestRate;
        setBalance(getBalance() + interest);
        System.out.println("Faiz geliri elave olundu: " + interest);
        System.out.println("Yenilenmish balans: " + getBalance());
        return getBalance();
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "monthlyInterestRate=" + monthlyInterestRate +
                ", withdrawalLimit=" + withdrawalLimit +
                '}';
    }
}
