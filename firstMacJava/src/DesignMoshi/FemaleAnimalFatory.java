package DesignMoshi;

public class FemaleAnimalFatory
        implements AnimalFactory {

    @Override
    public Animal createDog() {
        return new FemaleDog();
    }

    @Override
    public Animal createCat() {
        return new FemaleCat();
    }
}
