package ro.siit.java10.evp;

public class ElectricVehicleCreator implements VehicleCreator {
    public Vehicle create(String vinCode) {
        return new ElectricVehicle(vinCode);
    }
}
