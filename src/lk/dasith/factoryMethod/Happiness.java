package lk.dasith.factoryMethod;

public class Happiness extends Package{

    @Override
    protected void createPackage() {
        services.add(new FlowerDecoration());
        services.add(new HallDecoration());
    }
}
