package Memento;

import java.util.ArrayList;
import java.util.List;

public class EditorHistory {
    private List<EditorMemento> history = new ArrayList<>();
    private int currentIndex = -1;

    // 保存状态
    public void save(EditorMemento memento){
        if (memento == null) {
            throw new IllegalArgumentException("备忘录不能为空");
        }

        // 如果当前不在历史末尾，删除后续
        if(currentIndex<history.size()-1) {
            history.subList(currentIndex + 1, history.size()).clear();
        }
        // 添加新状态
        history.add(memento);
        currentIndex++;
        System.out.println("写入："+memento.text);
    }

    // 撤销
    public EditorMemento undo(){
        if (currentIndex <= 0) {
            throw new IllegalStateException("没有可撤销的状态");
        }
        currentIndex--;
        return history.get(currentIndex);
    }


}