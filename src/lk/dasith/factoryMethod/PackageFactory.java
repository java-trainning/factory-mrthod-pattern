package lk.dasith.factoryMethod;

public class PackageFactory {

    public static Package createPackage(PackageCode packageCode){

        switch (packageCode){

            case HAPPINESS:
                return new Happiness();
            case LUXURY:
                return new Luxury();
            case PREMIUM:
                return new Premium();
            default:
                return null;
        }
    }
}
