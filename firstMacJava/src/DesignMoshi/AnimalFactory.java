package DesignMoshi;

// 动物工厂类
public interface AnimalFactory {
    // 默认 public abstract
    // 动物分公母，所以分为两个 工厂实现类：、
    // 母动物工厂、公动物工厂
    Animal createDog();

    Animal createCat();
}
