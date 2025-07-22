package Cor;

public class Client {
    public static void main(String []args){
        LeaveHandler teamLeaderHandler, managerHandler, directorHandler;
        teamLeaderHandler = new TeamLeaderHandler("组长");
        managerHandler = new ManagerHandler("经理");
        directorHandler = new DirectorHandler("总监");
        teamLeaderHandler.setNextHandler(managerHandler);
        managerHandler.setNextHandler(directorHandler);

        LeaveRequest leaveRequest1 = new LeaveRequest("张三",2);
        LeaveRequest leaveRequest2 = new LeaveRequest("李四",5);
        LeaveRequest leaveRequest3 = new LeaveRequest("王五",10);

        teamLeaderHandler.handleRequest(leaveRequest1);
        teamLeaderHandler.handleRequest(leaveRequest2);
        teamLeaderHandler.handleRequest(leaveRequest3);
    }


}
