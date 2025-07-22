package Composite;

public class Client {
    public static void main(String []args){
        // 根目录
        Directory root = new Directory("root");

        // 子目录 doc和 img
        Directory doc = new Directory("doc");
        Directory img = new Directory("img");

        root.addNode(doc);
        root.addNode(img);

        // 子文件
        File resume = new File("resume.docx");
        File readme = new File("readme.txt");
        File photo = new File("photo.jpg");
        File index = new File("index.html");

        doc.addNode(resume);
        doc.addNode(readme);
        img.addNode(photo);
        img.addNode(index);

        root.display("");
    }
}
