package Facade;

public class Client {
    public static void main(String []args){
        HomeFacade homeFacade = new HomeFacade();
        homeFacade.homeMode();
        System.out.println();
        homeFacade.awayMode();
    }
}
