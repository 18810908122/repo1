package DesignMoshi;

public abstract class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}

class MaleDog extends Dog {
    @Override
    public void gender() {
        System.out.println("male dog");
    }
}

class FemaleDog extends Dog {
    @Override
    public void gender() {
        System.out.println("female dog");
    }
}