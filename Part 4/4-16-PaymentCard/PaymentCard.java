public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance){
        this.balance = openingBalance;
    }

    public String toString(){
        return "The card has a balance of " + String.valueOf(this.balance) + " euros";
    }

    public void eatAffordably(){
        if(balance >= 2.60){
            this.balance -= 2.60;
        }
    }

    public void eatHeartily(){
        if(balance >= 4.60){
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amout){
        if(amout > 0.0){
            this.balance += amout;
            if(this.balance > 150){
                this.balance = 150;
            }
        }
    }
}
