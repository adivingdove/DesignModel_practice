package State;

public class Account {
    private AccountState state;
    private double balance;

    // 构造函数
    public Account( double initBalance) {
        this.balance = initBalance;
        this.state = new NormalState(this);
        System.out.print("开户，初始金额为"+balance);
        System.out.println(" 当前状态"+state.stateName);
    }


    // 存款、取款、计算利息、查询余额
    public void deposit(double amount) {
        System.out.print("存款"+amount);
        state.deposit(amount);
        showStatus();
    }

    public void withdraw(double amount) {
        System.out.print("取款"+amount);
        state.withdraw(amount);
        showStatus();
    }

    // 计算利息
    public void computeInterest() {
        state.computeInterest();
    }

    // 显示状态信息
    public void showStatus() {
        System.out.println(" 余额为"+balance +"，当前状态："+state.stateName);
    }

    // getter和setter方法
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public AccountState getState() {
        return state;
    }
}
