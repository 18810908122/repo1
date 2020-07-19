package firstMacJava;

public class Test5 {
    SampleClass sam1 = new SampleClass("普通成员sam1初始化");
    static SampleClass sam = new SampleClass("静态成员sam初始化");

    //    SampleClass sam1 = new SampleClass("普通成员sam1初始化");
    static {
        System.out.println("static块执行");
        if (sam == null)
            System.out.println("sam is null");
        sam = new SampleClass("静态块内初始化sam成员变量");
    }

    SampleClass sam2 = new SampleClass("普通成员sam2初始化");

    Test5() {
        System.out.println("InitialOrderWithoutExtend默认构造函数被调用");
    }

    public static void main(String[] args) {
        // 创建第1个主类对象
        System.out.println("第1个主类对象：");
        Test5 ts = new Test5();
        // 创建第2个主类对象
        System.out.println("第2个主类对象：");
        Test5 ts2 = new Test5();
        // 查看两个主类对象的静态成员：
        System.out.println("2个主类对象的静态对象：");
        System.out.println("第1个主类对象, 静态成员sam.s: " + ts.sam);
        System.out.println("第2个主类对象, 静态成员sam.s: " + ts2.sam);
    }
}

class SampleClass {
    static {
        System.out.println("sampleClass");
    }

    {
        System.out.println("非静态sampleClass");
    }

    String s;

    SampleClass(String s) {
        this.s = s;
        System.out.println(s);
    }

    public String toString() {
        return this.s;
    }
}
