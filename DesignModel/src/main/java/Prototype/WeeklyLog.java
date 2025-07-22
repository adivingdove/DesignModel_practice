package Prototype;

import com.sun.source.tree.TryTree;

import java.io.*;

public class WeeklyLog implements Serializable {
    String name;
    String date;
    String content;
    Attachment attachment;

    public WeeklyLog(){
        this.attachment = new Attachment();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Object deepClone() throws IOException, ClassNotFoundException{
        try(ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bao)){
            oos.writeObject(this);
            try(ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis)){
                return ois.readObject();
            }
        }
    }

    public Attachment getAttachment(){
        return this.attachment;
    }

    public void display(){
        System.out.println(name+" - "+ date + " - " + "content");
    }

}
