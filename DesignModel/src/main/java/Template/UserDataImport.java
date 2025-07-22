package Template;

public class UserDataImport extends DataImporter{
    @Override
    void readFile() {
        System.out.println("【用户数据导入】");
        System.out.println("读取用户文件…");
    }

    @Override
    void parseData() {
        System.out.println("解析用户数据…");
    }

    @Override
    void validateData() {
        System.out.println("校验用户数据…");
    }

    @Override
    void saveData() {
        System.out.println("保存用户数据");
    }
}
