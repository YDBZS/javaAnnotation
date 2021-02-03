package pack.com.annotation.override;

public class Test {

    @SuppressWarnings("deprecation")
    public void sing() {
        Person child = new Child();
        child.sing();
    }

}
