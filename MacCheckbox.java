package AbstractFactory;

class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a MacOS Checkbox");
    }
}

