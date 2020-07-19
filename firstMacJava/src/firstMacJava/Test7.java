package firstMacJava;

public class Test7 {
    private void doing() {
        System.out.println("father");
        talking();
    }

    public void talking() {
        System.out.println("father is talking!");
    }

    public static void main(String[] args) {
        Test7 test7 = new Test7Son();
        test7.doing();
    }
}

class Test7Son extends Test7 {

    public void doing() {
        System.out.println("son");
        talking();
    }

    public void talking() {
        System.out.println("Son is talking!");
    }
}
