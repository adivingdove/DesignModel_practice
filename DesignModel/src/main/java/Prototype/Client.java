package Prototype;

public class Client {
    public static void main(String args[]){
        WeeklyLog weeklyLog, copyWeeklyLog= null;
        weeklyLog = new WeeklyLog();
        // 原始周报内容
        weeklyLog.setName("张三");
        weeklyLog.setDate("第12周");
        weeklyLog.setContent("完成模块A设计");


        try{
            copyWeeklyLog = (WeeklyLog)weeklyLog.deepClone();
        }catch (Exception e){
            e.printStackTrace();
        }

        Attachment copyAttachment = copyWeeklyLog.getAttachment();
        Attachment attachment = weeklyLog.getAttachment();

        System.out.print("周报是否相同？ ");
        System.out.println((weeklyLog == copyWeeklyLog)?"true": "false");
        System.out.print("附件是否相同？ ");
        System.out.println((attachment == copyAttachment)?"true":"false");
        System.out.print("原始周报内容：");
        weeklyLog.display();
        System.out.print("克隆周报内容：");
        copyWeeklyLog.display();
    }
}
