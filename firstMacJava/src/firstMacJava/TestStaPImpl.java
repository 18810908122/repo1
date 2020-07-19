package firstMacJava;

public class TestStaPImpl implements TestStaP {

    @Override
    public void sayHello(String content, int age) {
        System.out.println("hello" + content + " " + age);
    }

    @Override
    public void sayGoodBye(boolean seeAgin, double time) {
        System.out.println("GoodBye " + time + " " + seeAgin);
    }
}
