package firstMacJava;

public class Test8 {
    private String baseName = "base";

    public Test8() {
        System.out.println("Constructor Base : " + baseName);
        System.out.println("before Base callName() -----");
        callName();
        System.out.println("after Base callName() -----");
    }

    public void callName() {
        System.out.println("& " + baseName);
    }

    public static void main(String[] args) {
        Test8 b = new Sub();
        b.callName();
    }
}

class Sub extends Test8 {
    private String baseName = "sub";

    public Sub() {
        System.out.println("Constructor Sub : " + baseName);
    }

    public void callName() {
        System.out.println("# " + baseName);
    }
}