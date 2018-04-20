package ro.siit.java10.evp;


public abstract class Vehicle {
    private String manufacturer;
    private String model;
    private String firstReg;
    private String powerEngine;
    private String vinCode;
    private int price;
    private boolean isUsedVehicle;


    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price;  }

    public Vehicle (String vnCode){
        this.vinCode = vinCode;
            }

    public String getVinCode() {
        return vinCode;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFirstReg() {
        return firstReg;
    }

    public void setFirstReg(String firstReg) {
        this.firstReg = firstReg;
    }

    public String getPowerEngine() {
        return powerEngine;
    }

    public void setPowerEngine(String powerEngine) {
        this.powerEngine = powerEngine;
    }

    public boolean isUsedVehicle() {
        return isUsedVehicle;
    }

    public void setUsedVehicle(boolean usedVehicle) {
        isUsedVehicle = usedVehicle;
    }


}
