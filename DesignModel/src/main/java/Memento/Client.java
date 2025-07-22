package Memento;

public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();
        EditorHistory history = new EditorHistory();

        // 模拟用户输入与撤销操作
        editor.setText("Hello");
        history.save(editor.createMemento(editor.getText()));

        editor.setText("Hello World");
        history.save(editor.createMemento(editor.getText()));

        editor.setText("Hello World!");
        history.save(editor.createMemento(editor.getText()));

        // 执行撤销
        editor.restoreFromMemento(history.undo());
        editor.restoreFromMemento(history.undo());
    }
}
