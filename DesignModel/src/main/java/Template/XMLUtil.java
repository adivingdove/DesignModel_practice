package Template;

import javax.xml.parsers.*;
import org.w3c.dom.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class XMLUtil
{
    public static List<Object> getBeanList() {
        // 读取配置文件，根据配置文件中的信息，通过反射生成对象列表
        List<Object> list = new ArrayList<>();
        try {
            // 读取配置文件
            InputStream inputStream = Factory.XMLUtil.class.getResourceAsStream("/Template/Templatemethodconfig.xml");
            if (inputStream ==  null) throw new FileNotFoundException("配置文件未找到");
        
            // 解析XML文件
            // 创建DocumentBuilderFactory实例
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(inputStream);

            // 获取所有className标签
            NodeList nl = doc.getElementsByTagName("className");
            for (int i = 0; i < nl.getLength(); i++) {
                // 获取className标签内容
                String className = nl.item(i).getTextContent();
                // 通过反射获取Class对象
                Class<?> clazz = Class.forName(className);
                // 通过反射创建对象并添加到列表中
                list.add(clazz.getDeclaredConstructor().newInstance());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
