package firstMacJava;

public class Son {

    public String sayHello() {
        System.out.println("string");
        return null;
    }

    protected int sayHello(int a) {
        System.out.println("int");
        return 0;
    }

    public int sayHello(Character a) {
        System.out.println("character");
        return 0;
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.sayHello('a');
        System.out.println(String.valueOf(son));
    }
}
