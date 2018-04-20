package ro.siit.java10.evp;

import java.util.List;

public class Customer {



    private String id;
    private String firstName;
    private String lastName;
    private int purchaseFunds;
    private boolean moneyFunds;
    private DealerShip dealerShip;
    private List<Vehicle> vehicles;


    public Customer() {

    }
    public void setId(String id) {
        this.id = id;
    }
    public int getPurchaseFunds() {
        return purchaseFunds;
    }
    public void setPurchaseFunds(int purchaseFunds) {
        this.purchaseFunds = purchaseFunds;
    }
    public boolean isMoneyFunds() {
        return moneyFunds;
    }
    public void setMoneyFunds(boolean moneyFunds) {
        this.moneyFunds = moneyFunds;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getId() {
        return id;
    }
    public void receiveGreenBonus(){
        return;

    }
    public void purchaseCar(Vehicle vehicle, DealerShip dealerShip) {

        System.out.println(getFirstName()+ getLastName()+getId() + " looking to buy a new car for " + getPurchaseFunds());
        dealerShip.handleCustomer(this, vehicle, dealerShip, moneyFunds);
            }







}
