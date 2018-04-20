package ro.siit.java10.evp;

import java.util.*;
import java.util.Comparator;

public class ISortVehicle {

    private Vehicle vehicle;
    private DealerShip dealerShip;
    private List<Vehicle> vehicles;


//    public static String listCarsAscending(List<Vehicle> listOfCars) {
//        ArrayList<String> response = new ArrayList<>();
//
//        Comparator<Vehicle> priceComparator = new Comparator<Vehicle>() {
//            @Override
//            public int compare(Vehicle firstVehicle, Vehicle secondVehicle) {
//                return Double.compare(firstVehicle.getPrice(), secondVehicle.getPrice());
//            }
//        };
//
//       listOfCars.sort(priceComparator);
//       return listOfCars;
//            }





    public List<Vehicle> sortByPrice() {

        List<Vehicle> sortedByPriceList = new ArrayList<>();
        Collections.sort(sortedByPriceList, new Comparator<Vehicle>() {
            public int compare(Vehicle o1, Vehicle o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        return sortedByPriceList;

    }

    public List<Vehicle> sortByRangePerCharge(){

        List<Vehicle> sortedByRangePercharge = new ArrayList<>();
        Collections.sort(sortedByRangePercharge, new Comparator<Vehicle>() {
            public int compare(Vehicle o1, Vehicle o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        return sortedByRangePercharge;
    }
    public List<Vehicle> sortByPowerEngine(){

        List<Vehicle> sortedByPowerEngine = new ArrayList<>();
        Collections.sort(sortedByPowerEngine, new Comparator<Vehicle>() {
            public int compare(Vehicle o1, Vehicle o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        return sortedByPowerEngine;
    }
}




