package State;

public class OverdraftState extends AccountState{
    public OverdraftState(Account account) {
        super(account);
        this.stateName = "Overdraft";
    }

    public String getStateName(){
        return stateName;
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        checkState();
    }

    @Override
    public void withdraw(double amount) {
        account.setBalance(account.getBalance() - amount);
        checkState();
    }

    @Override
    public void computeInterest() {
        System.out.println("正常状态：无须支付利息。");
    }

    @Override
    protected void checkState() {
        double bal = account.getBalance();
        if (bal >= 0 ) {
            account.setState(new NormalState(account));
        } else if (bal <= -2000) {
            account.setState(new RestrictedState(account));
        }
    }
}
