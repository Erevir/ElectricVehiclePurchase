import ro.siit.java10.evp.*;
import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {



    @Test
    public void testSearchByFastCharging() {

        ElectricVehicle vehicle = createVehicle("1HGB741JXM8109186");

        vehicle.setManufacturer("Ford");
        vehicle.setModel("Fiesta");
        vehicle.setFirstReg("10/12/2010");
        vehicle.setPowerEngine("125");
        vehicle.setFastCharging(true);
        vehicle.setRangePerCharge(300);
        vehicle.setUsedVehicle(true);
        vehicle.setPrice(25000);

        ElectricVehicle vehicle1 = createVehicle("1HGB741JXM81595466");

        vehicle1.setManufacturer("Toyota");
        vehicle1.setModel("Prius");
        vehicle1.setFirstReg("25/12/2015");
        vehicle1.setFastCharging(true);
        vehicle1.setPowerEngine("95");
        vehicle1.setUsedVehicle(false);
        vehicle1.setRangePerCharge(350);
        vehicle1.setPrice(30000);

        ConventionalVehicle vehicle2 = createConventionalVehicle("ashdajfoi");

        vehicle2.setManufacturer("Skoda");
        vehicle2.setModel("Octavia");
        vehicle2.setFirstReg("25/12/2005");
        vehicle2.setFuel(FuelType.LPG);
        vehicle2.setPowerEngine("100");
        vehicle2.setUsedVehicle(true);
        vehicle2.setPrice(15000);

        DealerShip d = new DealerShip();//
//        DealerShip edc = new DealerShip();
//        DealerShip avd= new DealerShip();
//
//        d.setDealerShipName("ParmaAuto");
//        edc.setDealerShipName("Compexit");
//        avd.setDealerShipName("DakAuto");
//        d.purchaseVehicle(vehicle);
//        edc.purchaseVehicle(vehicle1);
//        avd.purchaseVehicle(vehicle2);

        d.setDealerShipName("ToyotaCluj");

        d.purchaseVehicle(vehicle);
        d.purchaseVehicle(vehicle1);
        d.purchaseVehicle(vehicle2);

        Customer customer = new Customer();
        customer.setFirstName("Nick");
        customer.setId("12F");
        customer.setLastName("Untura");
        customer.setPurchaseFunds(35000);
        customer.purchaseCar(vehicle1, d);
        d.runFundsCheck(customer, vehicle1);
//        d.handleCustomer(customer, vehicle1, d, true  );




        Assert.assertEquals(2, d.searchByFastCharging().size());  // check search

        Assert.assertEquals(2, d.getNumberOfUsedCars()); //check used vehicles

        Assert.assertEquals(1, d.getNumberOfNewCars());  //check new vehicles

        Assert.assertTrue(d.catalog.contains(vehicle));  // check ListCatalog

        Assert.assertEquals(3, d.catalog.size()); // check Catalog siz3

        Assert.assertEquals(2, d.getNumberOfUsedCars()); // check

        Assert.assertEquals(3, d.getTotalSize());  // check

        Assert.assertEquals(true, customer.isMoneyFunds());



    }

    private ElectricVehicle createVehicle(String vinCode) {
        return (ElectricVehicle) new ElectricVehicleCreator().create(vinCode);
    }

    private ConventionalVehicle createConventionalVehicle(String vinCode) {
        return (ConventionalVehicle) new ConventionalVehicleCreator().create(vinCode);

    }


}