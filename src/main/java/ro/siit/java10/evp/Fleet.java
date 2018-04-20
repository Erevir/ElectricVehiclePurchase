package ro.siit.java10.evp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */

public class Fleet {
    private List<Vehicle> vehicles;
    private List<DealerShip>dealerShips;
    DealerShip dealerShip;


    private Fleet(){
        vehicles = new ArrayList<>();
        //dealerShip = new DealerShip();
    }

    public static Fleet create(){
        return new Fleet();
    }

    public void addVehicle(Vehicle v){
        vehicles.add(v);
    }

    public void removeVehicle(Vehicle v){
        vehicles.remove(v);
    }

    public int getTotalVehicles() {
        return vehicles.size();
    }

    public int getTotalUsedVehicles() {

        int total = 0;

        for (Vehicle v : vehicles) {
            if (v.isUsedVehicle())
                total++;
        }

        return total;
    }

    public int getTotalNewVehicles() {

        int total = 0;

        for (Vehicle v : vehicles) {
            if (!v.isUsedVehicle())
                total++;
        }

        return total;
    }
    public List<Vehicle> getVehicles(){
        return vehicles;
    }
}