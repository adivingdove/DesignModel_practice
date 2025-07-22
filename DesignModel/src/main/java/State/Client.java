package State;

public class Client {
    public static void main(String[]args){
        Account account = new Account(1000.0);
        account.deposit(1000.0);
        account.withdraw(3000.0);
        account.withdraw(2000.0);
        account.deposit(4000.0);
    }
}
