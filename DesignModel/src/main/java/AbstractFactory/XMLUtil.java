package AbstractFactory;


import javax.xml.parsers.*;
import org.w3c.dom.*;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class XMLUtil
{
    //�÷������ڴ�XML�����ļ�����ȡ������������������һ��ʵ������
    public static List<Object> getBeanList() {
        List<Object> list = new ArrayList<>();
        try {
            InputStream inputStream = XMLUtil.class.getResourceAsStream("/AbstractFactory/AbstractFactoryconfig.xml");
            if (inputStream == null) {
                throw new FileNotFoundException("找不到配置文件！");
            }

            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc = builder.parse(inputStream);

            NodeList nl = doc.getElementsByTagName("className");
            for (int i = 0; i < nl.getLength(); i++) {
                String className = nl.item(i).getTextContent().trim();
                Class<?> c = Class.forName(className);
                Object obj = c.getDeclaredConstructor().newInstance();
                list.add(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
