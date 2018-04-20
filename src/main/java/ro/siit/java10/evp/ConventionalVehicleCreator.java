package ro.siit.java10.evp;

public class ConventionalVehicleCreator implements VehicleCreator {

    public Vehicle create(String vinCode) {
        return new ConventionalVehicle(vinCode);
    }
}
