package firstMacJava;

public class TestPersonImpl implements TestPerson {
    @Override
    public String sing(String name) {
        System.out.println("唱" + name + "歌！！");
        return "歌唱完了，谢谢大家！";
    }

    @Override
    public String dance(String name) {
        System.out.println("跳" + name + "舞！！");
        return "舞跳完了，谢谢大家！";
    }
}
