package lk.dasith.factoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Package {

   protected List<Services> services =  new ArrayList<>();


    public Package() {
        createPackage();
    }

    protected abstract void createPackage();

    @Override
    public String toString() {
        return "Package{" +
                "services=" + services +
                '}';
    }
}
