package lk.dasith.factoryMethod;

public class Luxury extends Package{

    @Override
    protected void createPackage() {

        services.add(new FlowerDecoration());
        services.add(new HallDecoration());
        services.add(new PhotoGrapher());

    }
}
