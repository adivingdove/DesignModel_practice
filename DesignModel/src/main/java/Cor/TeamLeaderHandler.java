package Cor;

public class TeamLeaderHandler extends LeaveHandler{
    public TeamLeaderHandler(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getDays()<3){
            System.out.println(leaveRequest.getName()+"请假"+leaveRequest.getDays()+"天 -> "+this.name+"审批通过");
        }else{
            if(this.nextHandler != null){
                this.nextHandler.handleRequest(leaveRequest);
            }
        }
    }
}
