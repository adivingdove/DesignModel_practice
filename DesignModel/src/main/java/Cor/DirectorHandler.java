package Cor;

public class DirectorHandler extends LeaveHandler{

    public DirectorHandler(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getDays()<30 && leaveRequest.getDays()>=10){
            System.out.println(leaveRequest.getName()+"请假"+leaveRequest.getDays()+"天 -> "+this.name+"审批通过");
        }else{
            System.out.println("请假超过30天，系统自动拒绝审批");
        }
    }

}
