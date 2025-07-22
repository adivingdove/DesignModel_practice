package State;

public abstract class AccountState {
    protected Account account;
    protected String stateName;

    // 构造函数
    public AccountState(Account account) {
        this.account = account;
    }

    // 抽象方法
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void computeInterest();
    protected abstract void checkState();
}

