package lk.dasith.factoryMethod;

public class Premium extends Package{


    @Override
    protected void createPackage() {

        services.add(new FlowerDecoration());
        services.add(new HallDecoration());
        services.add(new PhotoGrapher());
        services.add(new WeddingCAke());
        services.add(new WeddingVehicle());

    }
}
