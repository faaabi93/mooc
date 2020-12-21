public class Debt{
    private Double balance;
    private Double interestRate;

    public Debt(double initialBalance, double initalInterestrate){
        this.balance = initialBalance;
        this.interestRate = initalInterestrate;
    }

    public void printBalance(){
        System.out.println(String.valueOf(this.balance));
    }

    public void waitOneYear(){
        this.balance = this.balance * this.interestRate;
    }
}