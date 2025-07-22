package Bridge;

public class Client {
    public static void main(String[]args){
        MessageSender emailSender = new EmailSender();
        MessageSender smsSender = new SmsSender();

        // 普通邮件消息
        Message commonEmail = new CommonMessage(emailSender);
        commonEmail.send("请尽快提交日报！");

        // 紧急SMS消息
        Message urgentSms = new UrgentMessage(smsSender);
        urgentSms.send("服务器宕机，请立即处理！");
    }
}
