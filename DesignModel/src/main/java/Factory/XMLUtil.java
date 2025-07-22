package Factory;

import javax.xml.parsers.*;
import org.w3c.dom.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class XMLUtil
{
    public static List<Object> getBeanList() {
        List<Object> list = new ArrayList<>();
        try {
            InputStream inputStream = XMLUtil.class.getResourceAsStream("Factoryconfig.xml");
            if (inputStream == null) throw new FileNotFoundException("配置文件未找到");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(inputStream);

            NodeList nl = doc.getElementsByTagName("className");
            for (int i = 0; i < nl.getLength(); i++) {
                String className = nl.item(i).getTextContent();
                Class<?> clazz = Class.forName(className);
                list.add(clazz.getDeclaredConstructor().newInstance());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
