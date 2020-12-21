
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account matthewsAccount = new Account("Matthews account", 1000.0);
        Account myAccount = new Account("My account", 0.0);

        matthewsAccount.withdrawal(100.0);
        myAccount.deposit(100.0);

        System.out.println("Mathew's account balance: " + String.valueOf(matthewsAccount));
        System.out.println("My account: " + String.valueOf(myAccount));
    }
}
