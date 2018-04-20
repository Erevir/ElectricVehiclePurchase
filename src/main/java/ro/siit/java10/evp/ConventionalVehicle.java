package ro.siit.java10.evp;


public class ConventionalVehicle extends Vehicle {
    private FuelType fuel;

    public ConventionalVehicle(String vinCode) {
        super(vinCode);
  }
        public FuelType getFuel() {
        return fuel;
    }
    public void setFuel(FuelType fuel) {
        this.fuel = fuel;
    }
}
