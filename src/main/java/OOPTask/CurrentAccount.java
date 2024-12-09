package OOPTask;

import java.util.Objects;

public class CurrentAccount extends BankAccount{
    private double overdraftLimit;
    public CurrentAccount(String accountHolder, double balance, int accountNumber,double overdraftLimit){
        super(accountHolder,balance,accountNumber);
        this.overdraftLimit=overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CurrentAccount that = (CurrentAccount) o;
        return Double.compare(that.overdraftLimit, overdraftLimit) == 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), overdraftLimit);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Sizin Over Draft Limitiniz: "+overdraftLimit);
    }

    public double withdraw(double amount){
        if (getBalance()-amount>-overdraftLimit){
           setBalance(getBalance()-amount);
        }
        else {
            System.out.println("Siz overdraft limitini kecirsiniz emeliyyat redd edildi");
        }
        return getBalance();
    }

    @Override
    public String toString() {

        return

                "CurrentAccount{" +
                "overdraftLimit=" + overdraftLimit +
                '}';
    }
}
