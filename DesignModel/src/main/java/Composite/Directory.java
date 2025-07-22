package Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemNode{
    private List<FileSystemNode> children = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void addNode(FileSystemNode node) {
        children.add(node);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + name + "/");
        for (FileSystemNode node : children) {
            node.display(indent + "  ");
        }
    }
}
