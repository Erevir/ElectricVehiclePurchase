package ro.siit.java10.evp;

public class ElectricVehicle extends Vehicle {
    private int rangePerCharge;
    private boolean fastCharging;

    public ElectricVehicle(String vinCode) {
        super(vinCode);
    }

    public boolean isFastCharging() {
        return fastCharging;
    }

    public void setFastCharging(boolean fastCharging) {
        this.fastCharging = fastCharging;
    }

    public int getRangePerCharge() {
        return rangePerCharge;
    }

    public void setRangePerCharge(int rangePerCharge) {
        this.rangePerCharge = rangePerCharge;
    }

}
