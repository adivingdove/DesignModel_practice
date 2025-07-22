package Cor;

public class LeaveRequest {
    private String name;
    private int days;

    LeaveRequest(String name , int days){
        this.name = name;
        this.days = days;
    }

    public int getDays(){
        return days;
    }

    public String getName(){
        return name;
    }
}
