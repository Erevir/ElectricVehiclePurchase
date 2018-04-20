package ro.siit.java10.evp;


import java.util.*;

public class GreenBonusProgramAccount {



    GreenBonusProgram bonus = new GreenBonusProgram();

    //private List<bonus> vehicles;

    public int bonusCount() {
        if (bonus.getTotalSum() >= 10000) {
            int bonusReceived = bonus.getFixedBudget();
           // bonus = new ArrayList<bonus>();

            System.out.println("Customer receives bonus of: ");
        } else {
            System.out.println("There are no more bonuses");
        }
        return bonus.getFixedBudget();
    }
}
