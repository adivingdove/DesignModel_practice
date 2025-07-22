package Cor;

public abstract class LeaveHandler {
    protected String name;
    protected LeaveHandler nextHandler;

    public LeaveHandler(String name)
    {
        this.name=name;
    }
    public void setNextHandler(LeaveHandler nextHandler)
    {
        this.nextHandler = nextHandler;
    }
    public abstract void handleRequest(LeaveRequest leaveRequest);
}
