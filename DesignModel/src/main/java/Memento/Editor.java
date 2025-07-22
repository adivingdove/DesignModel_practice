package Memento;

public class Editor {
    private String text;

    public void setText(String text){
        this.text = text;
    }
    public String getText(){
        return text;
    }

    // 创建备忘录
    public EditorMemento createMemento(String text){
        return new EditorMemento(text);
    }

    // 恢复状态
    public void restoreFromMemento(EditorMemento memento){
        if(memento == null){
            throw new IllegalArgumentException("备忘录不能为空！");
        }
        this.text = memento.text;
        System.out.println("执行撤销："+text);
    }
}
