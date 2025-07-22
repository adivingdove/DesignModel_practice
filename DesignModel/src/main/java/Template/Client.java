package Template;

import java.util.List;

public class Client {
    public static void main(String[]args){
        // 读取配置文件，根据配置文件中的信息，通过反射生成对象列表
        List<Object> templates = XMLUtil.getBeanList();
        // 遍历对象列表，执行导入数据操作
        for(Object obj : templates){
            DataImporter di = (DataImporter) obj;
            di.importData();
            System.out.println();
        }
    }
}
