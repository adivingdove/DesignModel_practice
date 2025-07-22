package Composite;

public abstract class FileSystemNode {
    protected String name;

    public FileSystemNode(String name){
        this.name= name;
    }

    abstract void display(String indent);
}
