package ro.siit.java10.evp;

import ro.siit.java10.evp.Exceptions.EnoughFundsException;
import java.util.*;
import java.util.List;



public class DealerShip {
    private Fleet fleet;
    public List<Vehicle> catalog;
    private String dealerShipName;
    private String dealerShipAdrres;
    private String dealerShipEmail;


    public DealerShip() {
        this.fleet = Fleet.create();
        catalog = new ArrayList<>();
    }

//    public static DealerShip createDealerShip() {
//        return new DealerShip();
//    }

    public void purchaseVehicle(Vehicle vehicle) {
//        if(inCatalog(vehicle)) {
//            fleet.addVehicle(vehicle);
//        }//other logic related to purchasing/add item process

        if (!inCatalog(vehicle)) {
            addToCatalog(vehicle);
        }
        fleet.addVehicle(vehicle);
    }

    public boolean inCatalog(Vehicle vehicle) {
        boolean contains = false;
        contains = catalog.contains(vehicle);
        return contains;
    }

    public void addToCatalog(Vehicle vehicle) {
        catalog.add(vehicle);
    }
    public void sellVehicle(Vehicle vehicle) {
        if (inCatalog(vehicle)) {
            removeToCatalog(vehicle);
        }
        fleet.removeVehicle(vehicle);       //logic related to selling process
    }
    public void removeToCatalog(Vehicle vehicle) {
        catalog.remove(vehicle);
    }
    public int getTotalSize() {
        return fleet.getTotalVehicles();
    }
    public int getNumberOfUsedCars() {
        return fleet.getTotalUsedVehicles();
    }
    public int getNumberOfNewCars() {
        return fleet.getTotalNewVehicles();
    }
    public List<Vehicle> searchByFastCharging() {

        List<Vehicle> vehicles = new ArrayList();
        for (Vehicle vehicle : fleet.getVehicles()) {
            if (vehicle instanceof ElectricVehicle)
                if (((ElectricVehicle) vehicle).isFastCharging()) {
                    vehicles.add(vehicle);
                }
        }
        return vehicles;
    }

//    verificare fonduri necesare
    public void runFundsCheck(Customer customer, Vehicle vehicle) {
        if(customer.getPurchaseFunds() >= (vehicle.getPrice())) {
            System.out.println("Client " + customer.getId()+customer.getFirstName()+ customer.getLastName() + " is allowed to finance!");
            customer.setMoneyFunds(true);
        } else {
            System.out.println("Client " + customer.getId()+customer.getFirstName()+ customer.getLastName() + " is not allowed to finance!");
            customer.setMoneyFunds(false);
        }
    }

    public void handleCustomer(Customer customer, Vehicle vehicle, DealerShip dealerShip, boolean moneyFunds) {
        runFundsCheck(customer, vehicle);
//            if (customer.getPurchaseFunds() >= vehicle.getPrice()) {
//                System.out.println(customer.getId() + customer.getFirstName() + customer.getLastName() + " has purchased the " + vehicle.getManufacturer() + " " + vehicle.getModel() + " from dealership: " + dealerShip.getDealerShipName() + " for " + vehicle.getPrice());
//            } else
                if (customer.isMoneyFunds()) {
                System.out.println(customer.getId() + customer.getFirstName() + customer.getLastName() + " has financed to buy " + vehicle.getManufacturer() + " " + vehicle.getModel() + " from dealership: " + dealerShip.getDealerShipName() + " for " + vehicle.getPrice());
            } else {
                System.out.println(customer.getId()+customer.getFirstName()+ customer.getLastName() + " does not have enough to buy the vehicle");
            }
            System.out.println(" ");
    }

    public String getDealerShipName() {
        return dealerShipName;
    }
    public void setDealerShipName(String dealerShipName) {
        this.dealerShipName = dealerShipName;
    }

    public String getDealerShipAdrres() {
        return dealerShipAdrres;
    }

    public void setDealerShipAdrres(String dealerShipAdrres) {
        this.dealerShipAdrres = dealerShipAdrres;
    }

    public String getDealerShipEmail() {
        return dealerShipEmail;
    }

    public void setDealerShipEmail(String dealerShipEmail) {
        this.dealerShipEmail = dealerShipEmail;
    }

}

