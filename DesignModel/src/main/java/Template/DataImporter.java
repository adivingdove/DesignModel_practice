package Template;

public abstract class DataImporter {
    // 具体方法
    void importData(){
        readFile();
        parseData();
        validateData();
        beforeSave();
        saveData();

    }

    // 抽象方法
    abstract void readFile();
    abstract void parseData();
    abstract void validateData();
    abstract void saveData();

    // 钩子方法
    void beforeSave(){
        // 空实现
    }
}
