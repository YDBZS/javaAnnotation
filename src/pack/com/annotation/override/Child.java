package pack.com.annotation.override;

public class Child implements Person {

    // 在实现了person接口的同时，重写接口里面所有父类的方法。带override注解
    @Override
    public String name() {
        return null;
    }

    @Override
    public int age() {
        return 0;
    }

    @Override
    public void sing() {

    }
}
