
public class YourFirstAccount {

    public static void main(String[] args) {
        Account fabiansAccount = new Account("Fabians Account", 100.00);
        fabiansAccount.deposit(20.0);
        System.out.println("The balance of Fabains Account is now: " + String.valueOf(fabiansAccount));
    }
}
