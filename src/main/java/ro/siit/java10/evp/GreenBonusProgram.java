package ro.siit.java10.evp;

public class GreenBonusProgram {

    private int fixedBudget = 10000;
    // private String[] historyOfPurchases;
    private int totalSum = 10000000;
    private int totalVehicleBonus = 1000;

    public int getTotalVehicleBonus() {
        return totalVehicleBonus;
    }

    public void setTotalVehicleBonus(int totalVehicleBonus) {
        this.totalVehicleBonus = totalVehicleBonus;
    }

    public int getFixedBudget() {
        return fixedBudget;
    }

    public void setFixedBudget(int fixedBudget) {
        this.fixedBudget = fixedBudget;
    }

    public int getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(int totalSum) {
        this.totalSum = totalSum;
    }

}
