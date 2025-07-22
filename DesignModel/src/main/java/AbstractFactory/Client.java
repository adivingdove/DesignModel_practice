package AbstractFactory;


import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Object> factories = XMLUtil.getBeanList();

        for (Object obj : factories) {
            GUIFactory factory = (GUIFactory) obj;
            Button button = factory.createButton();
            button.render();

            TextField textField = factory.createTextField();
            textField.render();

            System.out.println("--------");
        }
    }
}

