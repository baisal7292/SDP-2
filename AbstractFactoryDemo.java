package AbstractFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        UIFactory factory = new WindowsFactory();
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.paint();
        checkbox.paint();

        factory = new MacFactory();
        button = factory.createButton();
        checkbox = factory.createCheckbox();

        button.paint();
        checkbox.paint();
    }
}
