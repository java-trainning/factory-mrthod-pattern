package lk.dasith.factoryMethod;

public class Application {

    public static void main(String[] args) {

        Package packageOne = PackageFactory.createPackage(PackageCode.HAPPINESS);
        System.out.println(packageOne);

        Package packageTwo = PackageFactory.createPackage(PackageCode.LUXURY);
        System.out.println(packageTwo);

        Package packageThree = PackageFactory.createPackage(PackageCode.PREMIUM);
        System.out.println(packageThree);
    }
}
