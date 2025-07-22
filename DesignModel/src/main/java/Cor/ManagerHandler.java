package Cor;

public class ManagerHandler extends LeaveHandler{
    public ManagerHandler(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getDays()<10 && leaveRequest.getDays()>=3) {
            System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getDays() + "天 -> " + this.name + "审批通过");
        }else{
            if(this.nextHandler != null){
                this.nextHandler.handleRequest(leaveRequest);
            }
        }
    }

    @Override
    public void setNextHandler(LeaveHandler nextHandler){
        this.nextHandler = nextHandler;
    }
}
