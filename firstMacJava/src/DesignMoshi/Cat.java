package DesignMoshi;

public abstract class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

class MaleCat extends Cat {
    @Override
    public void gender() {
        System.out.println("male Cat");
    }
}

class FemaleCat extends Cat {
    @Override
    public void gender() {
        System.out.println("female Cat");
    }
}
