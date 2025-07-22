package Memento;

public class EditorMemento {
    String text;
    EditorMemento(String text){
        this.text = text;
    }

    public  String getText(){
        return text;
    }
}
