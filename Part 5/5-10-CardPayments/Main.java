
public class Main {

    public static void main(String[] args) {
        /*
        // Part 1 Testing:
        PaymentCard fabiansCard = new PaymentCard(10);

        System.out.println("Guthaben auf Karte: " + fabiansCard.balance());
        boolean wasSuccessful = fabiansCard.takeMoney(8);
        System.out.println("Erfolgreich abgebucht: " + wasSuccessful);
        System.out.println("Guthaben auf Fabians Karte: " + fabiansCard.balance());

        wasSuccessful = fabiansCard.takeMoney(10);
        System.out.println("Erfolgreuch abgebucht: " + wasSuccessful);
        System.out.println("Guthaben auf Fabians Karte: " + fabiansCard.balance());

        ////
        // Part 2 Testing:
        PaymentTerminal unicafeExactum = new PaymentTerminal();

        double change = unicafeExactum.eatAffordably(10);
        System.out.println("remaining change " + change);

        change = unicafeExactum.eatAffordably(5);
        System.out.println("remaining change " + change);

        change = unicafeExactum.eatHeartily(4.3);
        System.out.println("remaining change " + change);

        System.out.println(unicafeExactum);
        
        ////
        // Part 3 Testing: 
        System.out.println("##############");

        PaymentTerminal unicafeExactum = new PaymentTerminal();

        double change = unicafeExactum.eatAffordably(10);
        System.out.println("remaining change: " + change);

        PaymentCard annesCard = new PaymentCard(7);

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);
        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);
        wasSuccessful = unicafeExactum.eatAffordably(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println(unicafeExactum);
        */
        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);

        PaymentCard annesCard = new PaymentCard(2);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        unicafeExactum.addMoneyToCard(annesCard, 100);

        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        System.out.println(unicafeExactum);

    }
}

