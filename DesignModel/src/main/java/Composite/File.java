package Composite;

public class File extends FileSystemNode {
    public File(String name) {
        super(name);
    }

    @Override
    void display(String indent) {
        System.out.println(indent + name);
    }
}
