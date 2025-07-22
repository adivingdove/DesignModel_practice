package State;

public class NormalState extends AccountState {
    // 正常状态，可以存取款
    public NormalState(Account account) {
        super(account);
        this.stateName = "Normal";
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

    // 检查账户状态
    @Override
    protected void checkState() {
        double bal = account.getBalance();
        if (bal < 0 && bal > -2000) {
            account.setState(new OverdraftState(account));
        } else if (bal <= -2000) {
            account.setState(new RestrictedState(account));
        }
    }
}
