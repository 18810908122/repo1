package firstMacJava;

public class Test {
    public void sayHello(char a) {
        System.out.println("char test");
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.sayHello('a');
    }
}
