package Template;

public class ProductDataImporter extends DataImporter{
    @Override
    void readFile() {
        System.out.println("【产品数据导入】");
        System.out.println("读取产品文件…");
    }

    @Override
    void parseData() {
        System.out.println("解析产品数据…");
    }

    @Override
    void validateData() {
        System.out.println("校验产品数据…");
    }

    @Override
    void saveData() {
        System.out.println("保存产品数据…");
    }
}
