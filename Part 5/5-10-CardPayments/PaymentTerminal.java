
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money = 1000; // register initially has 1000 euros of money
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double price = 2.50;
        if(payment >= price){
            this.money += price;
            payment -= price;
            affordableMeals++;
            return payment;
        }else{
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double price = 4.30;
        if(payment >= price){
            this.money += price;
            payment -= price;
            heartyMeals++;
            return payment;
        }else{
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card){
        // an affordable meal costs 2.50 
        // if the payment card has enough money, the balance of the card is decreased by the price
        // and the method return true
        // otherwise false is returned
        double price = 2.50;
        boolean successfulPayment = card.takeMoney(price);
        if(successfulPayment){
            affordableMeals++;
        }
        return successfulPayment;
    }

    public boolean eatHeartily(PaymentCard card){
        // see above; price is 4.30
        double price = 4.30;
        boolean successfulPayment = card.takeMoney(price);
        if(successfulPayment){
            heartyMeals++;
        }
        return successfulPayment;
    }

    // Part 4: Adding money

    public void addMoneyToCard(PaymentCard card, double sum){
        if(sum > 0){
            this.money += sum;
            card.addMoney(sum);
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
